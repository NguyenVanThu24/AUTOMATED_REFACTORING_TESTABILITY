package com.refactor;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String inputPath = "input/OrderProcessor.java";

        String source = FileReaderUtil.readFile(inputPath);

        // BEFORE
        FileWriterUtil.writeFile("output/BEFORE.txt", source);

        System.out.println("===== BEFORE =====");
        System.out.println(source);

        // REFRACTOR
        String result = RefactorEngine.refactor(source);

        // AFTER
        FileWriterUtil.writeFile("output/AFTER.java", result);

        System.out.println("\n===== AFTER =====");
        System.out.println(result);

        // REPORT
        Set<String> deps = RefactorEngine.getDependencies();

        StringBuilder report = new StringBuilder();
        report.append("DEPENDENCY REPORT\n\n");

        for (String d : deps) {
            report.append("- ").append(d).append("\n");
        }

        FileWriterUtil.writeFile("output/REPORT.txt", report.toString());

        System.out.println("\nREPORT GENERATED!");
    }
}