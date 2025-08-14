package com.example.service.mapper.provider;


import com.example.randomuserme.dto.base.User;
import com.example.service.domain.model.base.UserProfile;
import com.example.service.mapper.config.CentralMappingConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(
        config = CentralMappingConfig.class,
        uses = {
                NameMapper.class,
                AddressMapper.class,
                LoginMapper.class,
                PictureMapper.class,
                IdentityMapper.class,
                BirthDateMapper.class,
                InfoMapper.class
        }
)
public interface UserProviderMapper {

    @Mappings({
            @Mapping(source = "nat",  target = "nationality"),              // nat -> nationality
            @Mapping(source = "name", target = "name"),                     // name -> PersonName
            @Mapping(source = "location", target = "location"),             // location -> Address
            @Mapping(source = "picture", target = "picture"),               // picture -> PersonPicture
            @Mapping(source = "login", target = "login"),                   // login -> LoginInformation
            @Mapping(source = "dob",  target = "dob"),                      // dob -> BirthDate
            @Mapping(source = "id",   target = "id"),                       // id -> IdentityNumber
            @Mapping(source = "registered", target = "registered"),
            @Mapping(source = "info", target = "m_externalServiceInfo")     // info -> m_externalServiceInfo
    })
    UserProfile toDomain(User src);

    List<UserProfile> toDomainList(List<com.example.randomuserme.dto.base.User> src);
}


/*
    alan adları aynı, ama tipler farklı.
        •	Aynı isim + aynı tip → @Mapping gerekmez.
	    •   Aynı isim + farklı tip → @Mapping yazmak gerekir, çünkü MapStruct’a “bu alanı map’le, uygun sub-mapper kullan” demiş aluyoruz.
        •	Bu sayede NameMapper, AddressMapper devreye girer.
*/

//RandomUserApiMapper: Provider DTO → Domain (ServiceLib’te)