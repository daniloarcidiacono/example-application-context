package com.objectway.stage.example.applicationcontext;

import com.objectway.stage.example.applicationcontext.beans.Dog;
import com.objectway.stage.example.applicationcontext.beans.Person;
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
            System.out.println(ctx.getBean(Dog.class));
            System.out.println();
            ctx.close();
        }

        {
            // profileOne
            final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
            ctx.getEnvironment().setActiveProfiles("profileOne");
            ctx.scan("com.objectway.stage.example.applicationcontext.config");
            ctx.refresh();

            System.out.println("profileOne");
            System.out.println("----------");
            System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
            System.out.println(ctx.getBean(Dog.class));
            System.out.println(ctx.getBean(Person.class));
            System.out.println(ctx.getBean("person"));
            System.out.println(ctx.getBean(Person.class) == ctx.getBean("person"));
            System.out.println();
            ctx.close();
        }

        {
            // profileTwo
            final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
            ctx.getEnvironment().setActiveProfiles("profileTwo");
            ctx.scan("com.objectway.stage.example.applicationcontext.config");
            ctx.refresh();
            System.out.println("profileTwo");
            System.out.println("----------");
            System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
            System.out.println(ctx.getBean(Dog.class));
            System.out.println(ctx.getBean(Person.class));
            System.out.println(ctx.getBean("person"));
            System.out.println(ctx.getBean(Person.class) == ctx.getBean("person"));
            System.out.println();
            ctx.close();
        }
    }
}
