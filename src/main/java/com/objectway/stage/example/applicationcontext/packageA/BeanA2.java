package com.objectway.stage.example.applicationcontext.packageA;

import com.objectway.stage.example.applicationcontext.packageB.BeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA2 {
    private BeanB beanB;

    // Setter-based dependency injection
    // In setter-based dependency injection, setter methods are annotated with
    // @Autowired. Spring container will call these setter methods once the
    // Bean is instantiated using a no-argument constructor or a no-argument
    // static factory method in order to inject the Bean’s dependencies.
    @Autowired
    public void setBeanB(final BeanB beanB) {
        this.beanB = beanB;
    }

    @Override
    public String toString() {
        return "BeanA2{" +
                "beanB=" + beanB +
                '}';
    }
}
