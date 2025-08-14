package com.example.service.mapper.entity;

import com.example.service.domain.model.IdentityNumber;
import com.example.service.mapper.config.CentralMappingConfig;
import com.example.entity.Id;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(config = CentralMappingConfig.class)
public interface IdentityEntityMapper {

    @Mappings({
            @Mapping(source = "idType",   target = "name"),
            @Mapping(source = "idNumber", target = "value")
    })
    Id toEntity(IdentityNumber src);

    @Mappings({
            @Mapping(source = "name",  target = "idType"),
            @Mapping(source = "value", target = "idNumber")
    })
    IdentityNumber toDomain(Id src);
}

//IdentityNumber ↔ Id