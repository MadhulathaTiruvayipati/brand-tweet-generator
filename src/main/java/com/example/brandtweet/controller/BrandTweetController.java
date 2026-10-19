package com.example.brandtweet.controller;

import com.example.brandtweet.model.GenerateRequest;
import com.example.brandtweet.model.GenerateResponse;
import com.example.brandtweet.service.BrandTweetService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BrandTweetController {
    private final BrandTweetService brandTweetService;

    public BrandTweetController(BrandTweetService brandTweetService) {
        this.brandTweetService = brandTweetService;
    }

    @PostMapping("/generate")
    public GenerateResponse generate(@Valid @RequestBody GenerateRequest request) {
        return new GenerateResponse(brandTweetService.generate(request));
    }
}
