package com.oskar.mailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableJpaRepositories
public class MailerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailerApplication.class, args);
    }

}
