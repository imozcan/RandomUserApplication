package com.example.randomuserme.dto.base;

import com.example.randomuserme.dto.*;
import lombok.Data;

@Data
public class User {
    private String gender;
    private String phone;
    private String email;
    private String cell;
    private String nat;

    private Registered registered;
    private Location location;
    private Picture picture;
    private Login login;
    private Name name;
    private Info info;
    private Dob dob;
    private Id id;
}