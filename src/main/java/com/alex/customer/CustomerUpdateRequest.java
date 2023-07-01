package com.alex.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {

}
