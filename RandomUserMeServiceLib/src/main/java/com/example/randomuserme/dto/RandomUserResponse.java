package com.example.randomuserme.dto;

import lombok.Data;
import java.util.List;

@Data
public class RandomUserResponse {
    private List<User> results;
    private Info info;
}