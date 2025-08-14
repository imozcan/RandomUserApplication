package com.example.service.mapper.entity;

import com.example.service.domain.model.Address;
import com.example.service.mapper.config.CentralMappingConfig;
import com.example.entity.Location;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(config = CentralMappingConfig.class)
public interface AddressEntityMapper {

    // Domain -> Entity
    @Mappings({
            @Mapping(source = "street",      target = "street"),
            @Mapping(source = "city",        target = "city"),
            @Mapping(source = "state",       target = "state"),
            @Mapping(source = "country",     target = "country"),
            @Mapping(source = "postcode",    target = "postcode"),
            @Mapping(source = "coordinates", target = "coordinates"),
            @Mapping(source = "timezone",    target = "timezone")
    })
    Location toEntity(Address src);

    // Entity -> Domain
    @Mappings({
            @Mapping(source = "street",      target = "street"),
            @Mapping(source = "city",        target = "city"),
            @Mapping(source = "state",       target = "state"),
            @Mapping(source = "country",     target = "country"),
            @Mapping(source = "postcode",    target = "postcode"),
            @Mapping(source = "coordinates", target = "coordinates"),
            @Mapping(source = "timezone",    target = "timezone")
    })
    Address toDomain(Location src);
}

//Address ↔ Location