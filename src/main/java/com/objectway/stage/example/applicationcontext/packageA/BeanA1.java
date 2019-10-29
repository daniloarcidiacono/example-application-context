package com.objectway.stage.example.applicationcontext.packageA;

import com.objectway.stage.example.applicationcontext.packageB.BeanB;
import org.springframework.stereotype.Component;

@Component
public class BeanA1 {
    private final BeanB beanB;

    // Constructor-based dependency injection
    // The main advantage of constructor-based injection is that you can declare your injected
    // fields final, as they will be initiated during class instantiation.
    // This is convenient for required dependencies.
    public BeanA1(final BeanB beanB) {
        this.beanB = beanB;
    }

    @Override
    public String toString() {
        return "BeanA1{" +
                "beanB=" + beanB +
                '}';
    }
}
