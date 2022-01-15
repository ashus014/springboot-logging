package com.mypilotproject.demoproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${foo.name}")
    private String name;

    Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/")
    public String getResponse(){

        logger.trace("Home method accessed");
        return name;
    }

}
