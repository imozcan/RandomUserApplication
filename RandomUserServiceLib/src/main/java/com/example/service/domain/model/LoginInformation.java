package com.example.service.domain.model;

import lombok.Data;

@Data
public class LoginInformation {
    private String uuid;
    private String username;
    private String password;
    private String salt;
    private String md5;
    private String sha1;
    private String sha256;
}