package com.example.service.mapper.provider;

import com.example.randomuserme.dto.Picture;
import com.example.service.domain.model.PersonPicture;
import com.example.service.mapper.config.CentralMappingConfig;
import org.mapstruct.Mapper;

@Mapper(config = CentralMappingConfig.class)
public interface PictureMapper {
    PersonPicture toPersonPicture(Picture src);
}
//Picture → PersonPicture