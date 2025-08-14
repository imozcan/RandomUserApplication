package com.example.service.mapper.provider;

import com.example.randomuserme.dto.Dob;
import com.example.service.domain.model.BirthDate;
import com.example.service.mapper.config.CentralMappingConfig;
import org.mapstruct.Mapper;

@Mapper(config = CentralMappingConfig.class)
public interface BirthDateMapper {
    BirthDate toBirthDate(Dob src);
}

//Dob → BirthDate