package com.example.ahtproject.service;
import com.example.ahtproject.enums.ResourceType;
import com.example.ahtproject.exception.CustomException;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    public String processGetRequest(ResourceType resource) {
        switch (resource) {
            case NBA:
                return "GET process completed: NBA source";
            case EUROLEAGUE:
                return "GET process completed: EUROLEAGUE source";
            case NCAA:
                return "GET process completed: NCAA source";
            case WNBA:
                return "GET process completed: WNBA source";
            case FIBA:
                return "GET process completed: FIBA source";
            default:
                throw new CustomException("Invalid request service.");
        }
    }

    public String processPostRequest(ResourceType resource) {
        switch (resource) {
            case NBA:
                return "POST process completed: NBA source";
            case EUROLEAGUE:
                return "POST process completed: EUROLEAGUE source";
            case NCAA:
                return "POST process completed: NCAA source";
            case WNBA:
                return "POST process completed: WNBA source";
            case FIBA:
                return "POST process completed: FIBA source";
            default:
                throw new CustomException("Invalid request service.");
        }
    }
}
