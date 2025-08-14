package com.example.service.mapper.provider;

import com.example.randomuserme.dto.Login;
import com.example.service.domain.model.LoginInformation;
import com.example.service.mapper.config.CentralMappingConfig;
import org.mapstruct.Mapper;

@Mapper(config = CentralMappingConfig.class)
public interface LoginMapper {
    LoginInformation toLoginInformation(Login src);
}

//Login → LoginInformation