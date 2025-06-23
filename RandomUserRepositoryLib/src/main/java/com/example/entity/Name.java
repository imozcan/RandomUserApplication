package com.example.entity;

import com.example.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Name extends BaseEntity {

    public String title;
    @Column(name = "first_name")
    public String first;
    @Column(name = "last_name")
    public String last;
}