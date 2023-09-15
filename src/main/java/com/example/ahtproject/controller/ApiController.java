package com.example.ahtproject.controller;

import com.example.ahtproject.enums.ResourceType;
import com.example.ahtproject.exception.CustomException;
import com.example.ahtproject.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private RequestService requestService;

    @GetMapping("/getall")
    public ResponseEntity<String[]> getAllResources() {
        return ResponseEntity.ok(requestService.getAllResources());
    }

    @GetMapping("/get/{resourceId}")
    public ResponseEntity<String> processGetRequest(@PathVariable("resourceId") int resourceId) {
        return ResponseEntity.ok(requestService.processGetRequest(resourceId));
    }

    @PostMapping("/post/{resourceId}")
    public ResponseEntity<String> processPostRequest(@PathVariable("resourceId") int resourceId) {
        return ResponseEntity.ok(requestService.processPostRequest(resourceId));
    }
    @GetMapping("/test/{number}")
    public ResponseEntity<Integer> murat(@PathVariable("number") int number) {
        return ResponseEntity.ok(number);
    }
}

