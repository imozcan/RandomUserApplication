package com.example.randomuserme.dto;

import lombok.Data;

@Data
public class Location {
    private Street street;
    private String city;
    private String state;
    private String country;
    private String postcode; // int ya da String olabiliyor
    private Coordinates coordinates;
    private Timezone timezone;
}