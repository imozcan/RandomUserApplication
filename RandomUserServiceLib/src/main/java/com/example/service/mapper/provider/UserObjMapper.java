package com.example.service.mapper.provider;

import com.example.randomuserme.dto.base.RandomUserObj;
import com.example.service.domain.model.base.UserProfileObj;
import com.example.service.mapper.config.CentralMappingConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(
        config = CentralMappingConfig.class,
        uses = { UserProviderMapper.class, InfoMapper.class }
)
public interface UserObjMapper {

    @Mappings({

            @Mapping(source = "results", target = "results"),               // results -> results
            @Mapping(source = "info", target = "m_externalServiceInfo")     // info -> m_externalServiceInfo

    })
    UserProfileObj toDomain(RandomUserObj src);
}