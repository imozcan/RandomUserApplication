package com.example.service.mapper.provider;

import com.example.randomuserme.dto.Id;
import com.example.service.domain.model.IdentityNumber;
import com.example.service.mapper.config.CentralMappingConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(config = CentralMappingConfig.class)
public interface IdentityMapper {

    @Mappings({
            @Mapping(source = "name",  target = "idType"),
            @Mapping(source = "value", target = "idNumber")
    })
    IdentityNumber toIdentityNumber(Id src);
}

//id → IdentityNumber