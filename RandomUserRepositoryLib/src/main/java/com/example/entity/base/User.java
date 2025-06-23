package com.example.entity.base;

import com.example.entity.*;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "app_user")
public class User extends BaseEntity  {

    public String gender;
    public String phone;
    public String email;
    public String cell;
    public String nat;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login_id")
    public Login login;

    @OneToOne(cascade = CascadeType.ALL)
    public Registered registered;
    @OneToOne(cascade = CascadeType.ALL)
    public Location location;
    @OneToOne(cascade = CascadeType.ALL)
    public Picture picture;
    @OneToOne(cascade = CascadeType.ALL)
    public Name name;
    @OneToOne(cascade = CascadeType.ALL)
    public Info info;
    @OneToOne(cascade = CascadeType.ALL)
    public Dob dob;
    @OneToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "user_identity_id")
    private com.example.entity.Id identity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "randomUserObj_id")
    public RandomUserObj randomUserObj;
}