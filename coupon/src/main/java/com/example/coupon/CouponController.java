package com.example.coupon;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/coupon/api")
public class CouponController {
    @GetMapping
    public ResponseEntity<Map<String, String>> coupon() {
        return ResponseEntity.ok(Map.of("message", "쿠폰 서비스"));
    }
}
