package com.example.service.mapper.provider;

import com.example.randomuserme.dto.Info;
import com.example.service.domain.model.ExternalServiceInfo;
import com.example.service.mapper.config.CentralMappingConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(config = CentralMappingConfig.class)
public interface InfoMapper {

    @Mappings({
            @Mapping(source = "results", target = "resultsCount"),
            @Mapping(source = "version", target = "apiVersion")
    })
    ExternalServiceInfo toExternalServiceInfo(Info src);
}

// Info → ExternalServiceInfo