package com.example.service.mapper;

import com.example.entity.base.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(implementationName = "userInfoMapperImpl" ,componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "id", target = "identity")
    com.example.entity.base.User dtoToEntity(com.example.randomuserme.dto.base.User dto);

    @Mapping(source = "id", target = "identity")
    List<User> dtoListToEntityList(List<com.example.randomuserme.dto.base.User> dtoList);

    //Değişken isimleri Dış servisten gelenler için dto daha doğru, düzelt
}