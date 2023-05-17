package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@RestController
public class Module3LogApplication {

    public static void main(String[] args) {
        SpringApplication.run(Module3LogApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println(System.getProperty("java.io.tmpdir"));
            log.trace("what happened");
            log.debug("what happened");
            log.info("what happened");
            log.warn("what happened");
            log.error("what happened");
        };
    }

    @GetMapping("hello")
    public String hello(String name){
        log.info("hello");
        return "my name is"+name;
    }
}
