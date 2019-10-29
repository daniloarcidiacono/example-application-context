package com.objectway.stage.example.applicationcontext.packageC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanC1 {
    @Autowired
    private BeanC2 c2;

    @Override
    public String toString() {
        return "BeanC1{" +
                "c2=" + c2 +
                '}';
    }
}
