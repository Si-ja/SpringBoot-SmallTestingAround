package net.springboot.testing.demobuild.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RequestResponder {
    private String helloReply;

    RequestResponder() {
        this.helloReply = "Greetings, you managed to start this application up!";
    }

    @Bean
    public String getHelloReply() {
        return helloReply;
    }
}
