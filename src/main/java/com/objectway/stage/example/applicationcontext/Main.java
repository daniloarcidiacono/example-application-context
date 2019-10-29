package com.objectway.stage.example.applicationcontext;

import com.objectway.stage.example.applicationcontext.beans.Dog;
import com.objectway.stage.example.applicationcontext.beans.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // XML-based application context
        final ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        final ConfigurableEnvironment env = ctx.getEnvironment();
        System.out.println("No profiles");
        System.out.println("----------");
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        System.out.println(ctx.getBean(Dog.class));
        System.out.println();

        // profileOne
        env.setActiveProfiles("profileOne");
        ctx.refresh();
        System.out.println("profileOne");
        System.out.println("----------");
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        System.out.println(ctx.getBean(Dog.class));
        System.out.println(ctx.getBean(Person.class));
        System.out.println(ctx.getBean("person"));
        System.out.println(ctx.getBean(Person.class) == ctx.getBean("person"));
        System.out.println();

        // profileTwo
        env.setActiveProfiles("profileTwo");
        ctx.refresh();
        System.out.println("profileTwo");
        System.out.println("----------");
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        System.out.println(ctx.getBean(Dog.class));
        System.out.println(ctx.getBean(Person.class));
        System.out.println(ctx.getBean("person"));
        System.out.println(ctx.getBean(Person.class) == ctx.getBean("person"));
        System.out.println();
    }
}
