package com.objectway.stage.example.applicationcontext.packageA;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.objectway.stage.example.applicationcontext.packageB",
    "com.objectway.stage.example.applicationcontext.packageC"
})
public class PackageAConfig {
}
