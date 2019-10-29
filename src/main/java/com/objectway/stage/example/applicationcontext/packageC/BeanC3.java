package com.objectway.stage.example.applicationcontext.packageC;

import org.springframework.stereotype.Component;

@Component
public class BeanC3 {
    private final BeanC2 c2;

    public BeanC3(final BeanC2 c2) {
        this.c2 = c2;
    }

    @Override
    public String toString() {
        return "BeanC3{" +
                "c2=" + ((c2 != null) ? "<injected>" : "<null>") + // We can't include c2.toString in our method, otherwise an infinite loop will be created
                '}';
    }
}
