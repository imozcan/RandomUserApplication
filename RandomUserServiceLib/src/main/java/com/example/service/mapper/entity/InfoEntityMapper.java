package com.example.service.mapper.entity;

import com.example.service.domain.model.ExternalServiceInfo;
import com.example.service.mapper.config.CentralMappingConfig;
import com.example.entity.Info;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(config = CentralMappingConfig.class)
public interface InfoEntityMapper {

    @Mappings({
            @Mapping(source = "resultsCount", target = "results"),
            @Mapping(source = "apiVersion",   target = "version")
    })
    Info toEntity(ExternalServiceInfo src);

    @Mappings({
            @Mapping(source = "results", target = "resultsCount"),
            @Mapping(source = "version", target = "apiVersion")
    })
    ExternalServiceInfo toDomain(Info src);
}

//ExternalServiceInfo ↔ Info