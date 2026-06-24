package com.refactor;

import java.util.*;
import java.util.regex.*;

public class RefactorEngine {

    private static Set<String> dependencies = new LinkedHashSet<>();

    public static String refactor(String source) {

        // =========================
        // 1. ANALYSIS PHASE
        // =========================
        analyze(source);

        // =========================
        // 2. TRANSFORMATION PHASE
        // =========================
        source = removeStaticCalls(source);
        source = replaceDependencies(source);

        String injectedCode = generateInjectionCode();

        source = injectIntoClass(source, injectedCode);

        return source;
    }

    // =========================
    // ANALYZE (compiler-like step)
    // =========================
    private static void analyze(String source) {

        Pattern p = Pattern.compile("(\\w+)\\.getInstance\\(\\)");
        Matcher m = p.matcher(source);

        dependencies.clear();

        while (m.find()) {
            dependencies.add(m.group(1));
        }
    }

    // =========================
    // MODIFY STEP (replace calls)
    // =========================
    private static String replaceDependencies(String source) {

        for (String dep : dependencies) {

            String var = toVar(dep);

            source = source.replace(
                    dep + ".getInstance()",
                    var
            );
        }

        return source;
    }

    // =========================
    // DELETE STEP (remove static usage lines)
    // =========================
    private static String removeStaticCalls(String source) {

        // xóa dòng chứa getInstance (giả lập AST delete)
        return source.replaceAll(".*getInstance\\(\\).*\\n?", "");
    }

    // =========================
    // INSERT STEP (DI generation)
    // =========================
    private static String generateInjectionCode() {

        StringBuilder fields = new StringBuilder();
        StringBuilder constructor = new StringBuilder();

        constructor.append("\n    public OrderProcessor(");

        int i = 0;

        for (String dep : dependencies) {

            String type = map(dep);
            String var = toVar(dep);

            fields.append("    private ")
                    .append(type)
                    .append(" ")
                    .append(var)
                    .append(";\n");

            if (i > 0) constructor.append(", ");

            constructor.append(type)
                    .append(" ")
                    .append(var);

            i++;
        }

        constructor.append(") {\n");

        for (String dep : dependencies) {

            String var = toVar(dep);

            constructor.append("        this.")
                    .append(var)
                    .append(" = ")
                    .append(var)
                    .append(";\n");
        }

        constructor.append("    }\n");

        return fields + constructor.toString();
    }

    // =========================
    // INSERT INTO CLASS
    // =========================
    private static String injectIntoClass(String source, String injected) {

        return source.replace(
                "public class OrderProcessor {",
                "public class OrderProcessor {\n" + injected
        );
    }

    // =========================
    // UTIL
    // =========================
    private static String toVar(String input) {

        String cleaned = input.replaceFirst("^SQL", "");

        return Character.toLowerCase(cleaned.charAt(0))
                + cleaned.substring(1);
    }

    private static String map(String dep) {

        if (dep.contains("Payment")) return "PaymentGateway";
        if (dep.contains("Email")) return "EmailService";
        if (dep.contains("Logger")) return "Logger";

        return dep;
    }

    public static Set<String> getDependencies() {
        return dependencies;
    }
    
}

    