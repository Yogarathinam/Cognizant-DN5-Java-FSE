package com.cognizant.springjwt.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);
    private final Key signingKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader(value = "Authorization", required = false) String authHeader) {
        LOGGER.info("START - JWT Authentication processing triggered.");
        
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            LOGGER.error("Authentication Error: Authorization header basic parameter missing.");
            throw new RuntimeException("Missing or invalid Authorization header credentials.");
        }

        String base64Credentials = authHeader.substring("Basic ".length()).trim();
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);
        
        String[] values = credentials.split(":", 2);
        String username = values[0];
        
        LOGGER.debug("Decoded user request identity token for: {}", username);

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        Date expiryDate = new Date(nowMillis + 1200000); // 20 min token lifespan

        String jwtToken = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(signingKey)
                .compact();

        Map<String, String> responsePayload = new HashMap<>();
        responsePayload.put("token", jwtToken);

        LOGGER.info("END - JWT generated successfully.");
        return responsePayload;
    }
}
