package com.log4j.log4jspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
import java.util.List;

@RestController
public class Log4jController {
    private static final Logger logger = LogManager.getLogger(Log4jController.class);

    private List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

    @GetMapping("/")
    public String main() {
        logger.info("I'm in Controller Class");
        // java 8 lambda, no need to check log level
        logger.debug("Hello from Log4j 2 - num : {}", () -> num);
        logger.info("Try the Infor Log : {}", () -> "Completicated Project Management");
        logger.warn("This is Get Number", ()->getNum());
        logger.trace("I would like to trace my class");
        logger.error("Exception has been handled");

        

        return "Welcome to the Log4j"; //view
    }

    private int getNum() {
        return 100;
    }
}
