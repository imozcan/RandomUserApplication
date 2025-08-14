package com.example.service.domain.model.base;

import com.example.service.domain.model.ExternalServiceInfo;
import lombok.Data;

import java.util.List;

@Data
public class UserProfileObj {
    private List<UserProfile> results;
    private ExternalServiceInfo m_externalServiceInfo;
}