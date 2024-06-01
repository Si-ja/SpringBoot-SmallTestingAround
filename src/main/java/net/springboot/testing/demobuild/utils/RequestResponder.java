package net.springboot.testing.demobuild.utils;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class RequestResponder {
    private String helloReply;

    RequestResponder() {
        this.helloReply = "Greetings, you managed to start this application up!";
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public String getHelloReply() {
        return helloReply;
    }
}
