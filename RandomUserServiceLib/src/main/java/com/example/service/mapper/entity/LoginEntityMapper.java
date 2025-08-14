package com.example.service.mapper.entity;

import com.example.service.domain.model.LoginInformation;
import com.example.service.mapper.config.CentralMappingConfig;
import com.example.entity.Login;
import org.mapstruct.Mapper;

@Mapper(config = CentralMappingConfig.class)
public interface LoginEntityMapper {
    Login toEntity(LoginInformation src);
    LoginInformation toDomain(Login src);
}

//LoginInformation ↔ Login