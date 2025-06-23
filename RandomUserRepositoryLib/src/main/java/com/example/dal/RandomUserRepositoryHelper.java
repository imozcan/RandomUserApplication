package com.example.dal;

import com.example.entity.base.RandomUserObj;
import com.example.entity.base.User;
import com.example.repository.ILoginRepository;
import com.example.repository.IRandomUserObjRepository;
import com.example.repository.IUserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RandomUserRepositoryHelper {
    private final ILoginRepository ILoginRepository;
    private final IRandomUserObjRepository IRandomUserObjRepository;
    private final IUserRepository IUserRepository;


    public RandomUserRepositoryHelper(ILoginRepository ILoginRepository, IRandomUserObjRepository IRandomUserObjRepository, IUserRepository IUserRepository)
    {
        this.ILoginRepository = ILoginRepository;
        this.IRandomUserObjRepository = IRandomUserObjRepository;
        this.IUserRepository = IUserRepository;
    }

    public User findUserByUsername(String username)
    {
        return ILoginRepository.findByUsername(username).getUser();
    }
    public Iterable<User> saveAllUser(List<User> user)
    {
        return IUserRepository.saveAll(user);
    }

    public User saveUser(User user)
    {
        return IUserRepository.save(user);
    }

    public RandomUserObj SaveRandomUserObj(RandomUserObj randomUserObj)
    {
        return IRandomUserObjRepository.save(randomUserObj);
    }




}
