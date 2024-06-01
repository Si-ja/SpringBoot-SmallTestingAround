package net.springboot.testing.demobuild.controllers;

import net.springboot.testing.demobuild.utils.RequestResponder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index(
            RequestResponder requestResponder) {
        return requestResponder.getHelloReply();
    }
}
