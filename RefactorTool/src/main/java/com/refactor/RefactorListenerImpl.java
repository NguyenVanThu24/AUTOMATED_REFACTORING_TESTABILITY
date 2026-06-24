package com.refactor;

public class RefactorListenerImpl
        extends RefactorBaseListener {

    @Override
    public void enterDependencyCall(
            RefactorParser.DependencyCallContext ctx) {

        System.out.println(
                "Found dependency call:");

        System.out.println(
                ctx.getText());
    }
}