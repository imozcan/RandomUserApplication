package com.example.entity.base;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
