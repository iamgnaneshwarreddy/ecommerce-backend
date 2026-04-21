package com.gnaneshwar.ecommerce.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of("status", "Ecommerce Backend Running 🚀");
    }
}