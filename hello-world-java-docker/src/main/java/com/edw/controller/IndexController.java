package com.edw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/")
    public Map<String, Object> index() {
        logger.debug("Request served");

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("hello", "world");
        response.put("new-message", "Adding a new message");

        return response;
    }
}
