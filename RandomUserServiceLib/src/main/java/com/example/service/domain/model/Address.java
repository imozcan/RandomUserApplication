package com.example.service.domain.model;

import lombok.Data;

@Data
public class Address {
    private Street street;
    private String city;
    private String state;
    private String country;
    private String postcode; // int ya da String olabiliyor
    private Coordinates coordinates;
    private Timezone timezone;
}