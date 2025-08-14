package com.example.service.mapper.entity;

import com.example.service.domain.model.PersonName;
import com.example.service.mapper.config.CentralMappingConfig;
import com.example.entity.Name;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(config = CentralMappingConfig.class)
public interface NameEntityMapper {

    // Domain -> Entity
    @Mappings({
            @Mapping(source = "nameTitle", target = "title"),
            @Mapping(source = "firstName", target = "first"),
            @Mapping(source = "lastName",  target = "last")
    })
    Name toEntity(PersonName src);

    // Entity -> Domain
    @Mappings({
            @Mapping(source = "title", target = "nameTitle"),
            @Mapping(source = "first", target = "firstName"),
            @Mapping(source = "last",  target = "lastName")
    })
    PersonName toDomain(Name src);
}

//PersonName ↔ Name