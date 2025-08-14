package com.example.service.domain.model;

import lombok.Data;

@Data
public class ExternalServiceInfo {
    private String seed;
    private int resultsCount;
    private int page;
    private String apiVersion;
}