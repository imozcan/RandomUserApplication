package com.example.service;

import com.example.dal.RandomUserRepositoryHelper;
import com.example.randomuserme.RandomUserClient;
import com.example.randomuserme.dto.base.RandomUserObj;
import com.example.randomuserme.dto.base.User;
import com.example.service.mapper.entity.UserPersistenceMapper;
import com.example.service.mapper.provider.UserProviderMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;


import java.util.List;

@Service
//@RequiredArgsConstructor ctoru otomatik yazar
public class RandomUserAppService { //RandomUserFacade
    private final RandomUserClient m_randomUserClient;
    private final RandomUserRepositoryHelper m_randomUserRepositoryHelper;

    private final UserProviderMapper m_providerMapper;          // Provider -> Domain
    private final UserPersistenceMapper m_persistenceMapper;    // Domain -> Entity

    public RandomUserAppService(RandomUserClient randomUserClient,
                                RandomUserRepositoryHelper randomUserRepositoryHelper,
                                UserProviderMapper providerMapper,
                                UserPersistenceMapper persistenceMapper
                                )
    {
        m_randomUserClient = randomUserClient;
        m_randomUserRepositoryHelper = randomUserRepositoryHelper;
        m_providerMapper = providerMapper;
        m_persistenceMapper = persistenceMapper;
    }

    public List<com.example.entity.base.User> getRandomUser()
    {
        List<User> providers = getRandomUserWithoutSource();
        var domainList = m_providerMapper.toDomainList(providers);;
        var entities   = m_persistenceMapper.toEntityList(domainList);;
        m_randomUserRepositoryHelper.saveAllUser(entities);

        return entities;
    }

    @Transactional
    public com.example.entity.base.User getUser()
    {
        var provider = m_randomUserClient.getRandomUser();
        var domain = m_providerMapper.toDomain(provider);
        var entity = m_persistenceMapper.toEntity(domain);
        return m_randomUserRepositoryHelper.saveUser(entity);
    }
    @Transactional
    public List<User> getRandomUserWithoutSource()
    {
        return m_randomUserClient.getRandomUserInList();
    }

    public RandomUserObj getRandomUserResponseWithOutSource()
    {
        return m_randomUserClient.getRandomUserResponse();
    }
}

/*
        Persist = veriyi kalıcı hale getirmek, yani bellekte geçici tutmak yerine DB’ye kaydetmek için kullanıyoruz.

        @Transactional = metot içindeki DB işlemlerini bir bütün (transaction) olarak
                         çalıştırıyor. yani ya hep ya hiç. metot içindeki işlemlerden biri başarısız olursa
                         hepsi geri alınır (rollback).

        SONUÇ = Persist ettiğimiz metotlara @Transactional ekleyeceğiz.
 */