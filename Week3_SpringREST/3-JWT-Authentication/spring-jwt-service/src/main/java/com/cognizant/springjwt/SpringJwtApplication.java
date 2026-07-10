package com.cognizant.springjwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJwtApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringJwtApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtApplication.class, args);
        LOGGER.info("JWT Authentication Service initialized cleanly on port 8090.");
    }
}
