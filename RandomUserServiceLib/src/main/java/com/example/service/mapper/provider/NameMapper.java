package com.example.service.mapper.provider;

import com.example.randomuserme.dto.Name;
import com.example.service.domain.model.PersonName;
import com.example.service.mapper.config.CentralMappingConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(config = CentralMappingConfig.class)
public interface NameMapper {

    @Mappings({
            @Mapping(source = "title", target = "nameTitle"),
            @Mapping(source = "first", target = "firstName"),
            @Mapping(source = "last",  target = "lastName")
    })
    PersonName toPersonName(Name src);
}

//Name → PersonName