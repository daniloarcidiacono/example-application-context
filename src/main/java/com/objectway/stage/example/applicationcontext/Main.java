package com.objectway.stage.example.applicationcontext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            // Annotation-based application context (JavaConfig)
            final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.objectway.stage.example.applicationcontext.config");
            System.out.println("No profiles");
            System.out.println("----------");
            System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));

            for (String name : ctx.getBeanDefinitionNames()) {
                if (name.contains("bean")) {
                    System.out.println(ctx.getBean(name));
                }
            }

            System.out.println();
            ctx.close();
        }
    }
}
