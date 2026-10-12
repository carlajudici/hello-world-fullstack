package com.example.hello_world_backend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class StatusController {

    @Value("${spring.application.name:hello-world-backend}")
    private String appName;

    @GetMapping("/api/status")
    public Map<String, Object> status() {
        return Map.of(
                "application", appName,
                "status", "UP",
                "timestamp", Instant.now().toString()
        );
    }
}