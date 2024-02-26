package com.michaelrkaplan.bakersassistant.dto;

public class UserRequest {
    private String email;
    private String password;

    public UserRequest() {
        // Default constructor
    }

    public UserRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
