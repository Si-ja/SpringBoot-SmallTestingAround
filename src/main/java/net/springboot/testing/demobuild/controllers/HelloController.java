package net.springboot.testing.demobuild.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Greetings, you managed to start this application up!";
    }
}
