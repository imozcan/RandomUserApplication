package com.example.service;

import com.example.dal.RandomUserRepositoryHelper;
import com.example.randomuserme.RandomUserClient;
import com.example.randomuserme.dto.*;
import com.example.randomuserme.dto.base.RandomUserObj;
import com.example.randomuserme.dto.base.User;
import com.example.service.mapper.UserMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RandomUserAppService { //RandomUserFacade
    private final RandomUserClient RandomUserClient;
    private final RandomUserRepositoryHelper RandomUserRepositoryHelper;
    private final UserMapper UserMapper;


    public RandomUserAppService(RandomUserClient randomUserClient,
                                RandomUserRepositoryHelper randomUserRepositoryHelper,
                                UserMapper userMapper)
    {
        RandomUserClient = randomUserClient;
        RandomUserRepositoryHelper = randomUserRepositoryHelper;
        UserMapper = userMapper;
    }

    public List<User> getRandomUser()
    {
        var ruc = getRandomUserWithOutSource();
        RandomUserRepositoryHelper.saveAllUser(UserMapper.dtoListToEntityList(ruc));

        return ruc;
    }

    public com.example.entity.base.User getUser()
    {
        User ru = RandomUserClient.getRandomUser();
        return RandomUserRepositoryHelper.saveUser(UserMapper.dtoToEntity(ru));
    }

    public List<User> getRandomUserWithOutSource()
    {
        return RandomUserClient.getRandomUserInList();
    }

    public RandomUserObj getRandomUserResponseWithOutSource()
    {
        return RandomUserClient.getRandomUserResponse();
    }
}
