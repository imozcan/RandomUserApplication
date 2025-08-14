package com.example.service.mapper.provider;

import com.example.randomuserme.dto.Location;
import com.example.service.domain.model.Address;
import com.example.service.mapper.config.CentralMappingConfig;
import org.mapstruct.Mapper;

@Mapper(config = CentralMappingConfig.class)
public interface AddressMapper {

    Address toAddress(Location src);
}

// Location → Address