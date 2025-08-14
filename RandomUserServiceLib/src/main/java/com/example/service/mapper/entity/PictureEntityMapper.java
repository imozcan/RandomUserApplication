package com.example.service.mapper.entity;

import com.example.service.domain.model.PersonPicture;
import com.example.service.mapper.config.CentralMappingConfig;
import com.example.entity.Picture;
import org.mapstruct.Mapper;

@Mapper(config = CentralMappingConfig.class)
public interface PictureEntityMapper {
    Picture toEntity(PersonPicture src);
    PersonPicture toDomain(Picture src);
}

//PersonPicture ↔ Picture