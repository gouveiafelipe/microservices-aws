package com.microservices.project.microservicesaws.controller;


import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @GetMapping("{dog_name}")
    public ResponseEntity<?> endpointTest(@RequestHeader (value = "user-access", required = false) String userAccess,
                                          @PathVariable(value = "dog_name") String dogName){

        LOGGER.info("Testing endpoint Controller, dog's name: {}", dogName);

        return ResponseEntity.status(HttpStatus.OK).body("Name: " + dogName);

    }
}
