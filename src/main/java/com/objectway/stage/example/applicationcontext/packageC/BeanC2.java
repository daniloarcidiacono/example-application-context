package com.objectway.stage.example.applicationcontext.packageC;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanC2 {
    private final BeanC3 c3;

    // https://www.baeldung.com/circular-dependencies-in-spring
    public BeanC2(@Lazy final BeanC3 c3) {
        this.c3 = c3;
    }

    @Override
    public String toString() {
        return "BeanC2{" +
                "c3=" + ((c3 != null) ? "<injected>" : "<null>") + // We can't include c3.toString in our method, otherwise an infinite loop will be created
                '}';
    }
}
