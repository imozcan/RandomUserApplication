package com.example.randomuserme.dto;

import lombok.Data;

@Data
public class Info {
    private String seed;
    private int results;
    private int page;
    private String version;
}