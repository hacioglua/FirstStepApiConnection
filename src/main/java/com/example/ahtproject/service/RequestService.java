package com.example.ahtproject.service;

import com.example.ahtproject.enums.ResourceType;
import com.example.ahtproject.exception.CustomException;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    public String processGetRequest(int resourceId) {
        ResourceType resource = getResourceTypeById(resourceId);
        return "GET process completed: " + resource.name() + " source";
    }

    public String processPostRequest(int resourceId) {
        ResourceType resource = getResourceTypeById(resourceId);
        return "POST process completed: " + resource.name() + " source";
    }

    public String[] getAllResources() {
        ResourceType[] resourceTypes = ResourceType.values();
        String[] resources = new String[resourceTypes.length];
        for (int i = 0; i < resourceTypes.length; i++) {
            resources[i] = resourceTypes[i].name();
        }
        return resources;
    }

    private ResourceType getResourceTypeById(int resourceId) {
        ResourceType[] resourceTypes = ResourceType.values();

        if (resourceId >= 1 && resourceId <= resourceTypes.length) {
            return resourceTypes[resourceId - 1];
        } else {
            throw new CustomException("Invalid resource ID.");
        }
    }
}
