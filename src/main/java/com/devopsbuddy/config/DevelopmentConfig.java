package com.devopsbuddy.config;

import com.devopsbuddy.backend.service.EmailService;
import com.devopsbuddy.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Pawel on 6/25/2017.
 */

@Configuration
@Profile("dev")
@PropertySource("file:///P://.devopsbuddy/application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService(){
        return new MockEmailService();
    }
}
