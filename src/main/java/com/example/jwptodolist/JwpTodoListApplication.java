package com.example.jwptodolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JwpTodoListApplication {

    public static void main(final String[] args) {
        SpringApplication.run(JwpTodoListApplication.class, args);
    }

}
