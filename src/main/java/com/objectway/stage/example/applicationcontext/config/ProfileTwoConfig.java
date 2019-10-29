package com.objectway.stage.example.applicationcontext.config;

import com.objectway.stage.example.applicationcontext.beans.Dog;
import com.objectway.stage.example.applicationcontext.beans.PersonWithDog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("profileTwo")
public class ProfileTwoConfig {
    // Field injection is not recommended
//    @Autowired
//    private Dog snoopy;

    // Method parameter injection
    @Bean
    public PersonWithDog person(final Dog snoopy) {
        return new PersonWithDog("Charlie", "Brown", 8, snoopy);
    }
}
