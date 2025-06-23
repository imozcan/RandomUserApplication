package com.example.randomuserme.dto.base;

import com.example.randomuserme.dto.Info;
import lombok.Data;
import java.util.List;

@Data
public class RandomUserObj {
    private List<User> results;
    private Info info;
}