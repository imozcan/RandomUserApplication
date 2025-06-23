package com.example.entity;

import com.example.entity.base.BaseEntity;
import com.example.entity.base.User;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Login extends BaseEntity {

    public String uuid;
    public String username;
    public String password;
    public String salt;
    public String md5;
    public String sha1;
    public String sha256;

    @OneToOne(mappedBy = "login",cascade = CascadeType.ALL)
    private User user;
}