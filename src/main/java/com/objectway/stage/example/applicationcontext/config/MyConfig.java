package com.objectway.stage.example.applicationcontext.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
    "com.objectway.stage.example.applicationcontext.packageA"
)
public class MyConfig {
}
