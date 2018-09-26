package com.aoe.greetingjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class GreetingJavaApplication {

    @Bean
    public Function<String, Flux<String>> doStuff() {
        return input -> Flux.fromArray(input.split(" "));
    }

    public static void main(String[] args) {
        SpringApplication.run(GreetingJavaApplication.class, args);
    }
}
