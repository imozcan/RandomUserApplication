package com.example.service.mapper.entity;

import com.example.service.domain.model.BirthDate;
import com.example.service.mapper.config.CentralMappingConfig;
import com.example.entity.Dob;

import org.mapstruct.Mapper;

@Mapper(config = CentralMappingConfig.class)
public interface BirthDateEntityMapper {
    Dob toEntity(BirthDate src);
    BirthDate toDomain(Dob src);
}

//BirthDate ↔ Dob