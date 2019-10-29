package com.objectway.stage.example.applicationcontext.config;

import com.objectway.stage.example.applicationcontext.beans.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Dog snoopy() {
        return new Dog("Snoopy", 3, 8);
    }
}
