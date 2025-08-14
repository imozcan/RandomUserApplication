package com.example.service.domain.model.base;

import com.example.service.domain.model.*;
import lombok.Data;

@Data
public class UserProfile {
    private String gender;
    private String phone;
    private String email;
    private String cell;
    private String nationality;

    private Registered registered;
    private Address location;
    private PersonPicture picture;
    private LoginInformation login;
    private PersonName name;
    private ExternalServiceInfo m_externalServiceInfo;
    private BirthDate dob;
    private IdentityNumber id;
}