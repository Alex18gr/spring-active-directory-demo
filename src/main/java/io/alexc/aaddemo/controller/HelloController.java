package io.alexc.aaddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class HelloController {
    // @Autowired
    @PreAuthorize("hasRole('users')")
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @PreAuthorize("hasRole('users')")
    @RequestMapping("/demo")
    public String demoEndpoint() {
        return "demo protected resource";
    }
}
