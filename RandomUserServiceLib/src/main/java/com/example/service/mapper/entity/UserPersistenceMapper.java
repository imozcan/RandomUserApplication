package com.example.service.mapper.entity;

import com.example.service.domain.model.base.UserProfile;
import com.example.service.mapper.config.CentralMappingConfig;
import com.example.entity.base.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(
        config = CentralMappingConfig.class,
        uses = {
                NameEntityMapper.class,
                AddressEntityMapper.class,
                LoginEntityMapper.class,
                PictureEntityMapper.class,
                IdentityEntityMapper.class,
                BirthDateEntityMapper.class,
                InfoEntityMapper.class
        }
)
public interface UserPersistenceMapper {

    // Domain -> Entity
    @Mappings({
            @Mapping(source = "nationality",        target = "nat"),
            @Mapping(source = "name",               target = "name"),      // PersonName -> Name (sub-mapper)
            @Mapping(source = "location",           target = "location"),  // Address -> Location (sub-mapper)
            @Mapping(source = "picture",            target = "picture"),   // PersonPicture -> Picture
            @Mapping(source = "login",              target = "login"),     // LoginInformation -> Login
            @Mapping(source = "m_externalServiceInfo", target = "info"),   // ExternalServiceInfo -> Info
            @Mapping(source = "dob",                target = "dob"),       // BirthDate -> Dob
            @Mapping(source = "id",                 target = "id"),        // IdentityNumber -> id
            @Mapping(source = "registered",         target = "registered") // aynı isim/alanlar
    })
    User toEntity(UserProfile src);

    // Entity -> Domain
    @Mappings({
            @Mapping(source = "nat",  target = "nationality"),
            @Mapping(source = "name", target = "name"),        // Name -> PersonName
            @Mapping(source = "location", target = "location"),// Location -> Address
            @Mapping(source = "picture",  target = "picture"), // Picture -> PersonPicture
            @Mapping(source = "login",    target = "login"),   // Login -> LoginInformation
            @Mapping(source = "info",     target = "m_externalServiceInfo"),
            @Mapping(source = "dob",      target = "dob"),
            @Mapping(source = "id",       target = "id"),
            @Mapping(source = "registered", target = "registered")
    })
    UserProfile toDomain(User src);

    List<User> toEntityList(List<UserProfile> src);

    List<UserProfile> toDomainList(List<User> src);
}

//UserProfile ↔ User
//Domain ↔ Entity

/*
    alan adları aynı, ama tipler farklı.
        •	Aynı isim + aynı tip → @Mapping gerekmez.
	    •   Aynı isim + farklı tip → @Mapping yazmak gerekir, çünkü MapStruct’a “bu alanı map’le, uygun sub-mapper kullan” demiş aluyoruz.
        •	Bu sayede NameMapper, AddressMapper devreye girer.
*/