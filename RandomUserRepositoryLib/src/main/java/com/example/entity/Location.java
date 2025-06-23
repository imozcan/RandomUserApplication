package com.example.entity;

import com.example.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Location extends BaseEntity {

    public String city;
    public String state;
    public String country;
    public String postcode; // int ya da String olabiliyor

    @OneToOne(cascade = CascadeType.ALL)
    public Street street;
    @OneToOne(cascade = CascadeType.ALL)
    public Coordinates coordinates;
    @OneToOne(cascade = CascadeType.ALL)
    public Timezone timezone;
}