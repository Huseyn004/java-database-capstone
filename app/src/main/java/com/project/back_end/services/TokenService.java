package com.project.back_end.services;

public class TokenService {

    public String generateToken(String username, String role) {
        // Logic to generate an authentication token (e.g., JWT or session token)
        return "sample-token-" + username;
    }

    public boolean validateToken(String token) {
        // Logic to validate the authenticity and expiration of a token
        return token != null && !token.isEmpty();
    }

    public String getUsernameFromToken(String token) {
        // Logic to extract user details from the token
        return "user";
    }
}
