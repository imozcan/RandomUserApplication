package com.example.entity;

import com.example.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "app_timezone")
public class Timezone extends BaseEntity {


    @Column(name = "time_offset")
    public String offset;
    public String description;
}