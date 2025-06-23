package com.example.entity.base;

import com.example.entity.Info;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class RandomUserObj  extends BaseEntity {

    @OneToMany(mappedBy = "randomUserObj", cascade = CascadeType.ALL)
    public List<User> results;

    @OneToOne(cascade = CascadeType.ALL)
    public Info info;
}