package com.objectway.stage.example.applicationcontext.config;

import com.objectway.stage.example.applicationcontext.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("profileOne")
public class ProfileOneConfig {
    @Bean
    public Person person() {
        return new Person("John", "Smith");
    }
}
