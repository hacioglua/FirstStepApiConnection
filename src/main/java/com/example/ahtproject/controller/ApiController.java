package com.example.ahtproject.controller;
import com.example.ahtproject.enums.ResourceType;
import com.example.ahtproject.exception.CustomException;
import com.example.ahtproject.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private RequestService requestService;

    @GetMapping("/process")
    public ResponseEntity<String> processGetRequest(@RequestParam("resource") ResourceType resource) {
        try {
            String result = requestService.processGetRequest(resource);
            return ResponseEntity.ok(result);
        } catch (CustomException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping("/process")
    public ResponseEntity<String> processPostRequest(@RequestParam("resource") ResourceType resource) {
        try {
            String result = requestService.processPostRequest(resource);
            return ResponseEntity.ok(result);
        } catch (CustomException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
    @GetMapping("/test/{number}")
    public ResponseEntity<Integer> murat(@PathVariable("number") int number) {
        return ResponseEntity.ok(number);
    }
}
