package com.training.springtask.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "customEndpoint")
public class CustomEndpoint {

    @ReadOperation
    public Map<String, String> getSimpleResponse() {
        Map<String, String> details = new HashMap<>();
        details.put("CustomHealthStatus", "Service is UP.");
        details.put("Time", LocalDateTime.now().toString());
        return details;
    }
}
