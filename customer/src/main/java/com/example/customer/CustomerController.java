package com.example.customer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/customer/api")
public class CustomerController {
    @GetMapping
    public ResponseEntity<Map<String, String>> coupon() {
        return ResponseEntity.ok(Map.of("message", "커스터머 서비스"));
    }
}
