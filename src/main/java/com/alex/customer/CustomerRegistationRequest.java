package com.alex.customer;

public record CustomerRegistationRequest(
        String name,
        String email,
        Integer age
) {

}
