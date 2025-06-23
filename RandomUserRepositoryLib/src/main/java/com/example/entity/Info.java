package com.example.entity;

import com.example.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Info extends BaseEntity {

    public String seed;
    public int results;
    public int page;
    public String version;
}