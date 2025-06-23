package com.example.randomuserme;

import com.example.randomuserme.dto.base.RandomUserObj;
import com.example.randomuserme.dto.base.User;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RandomUserClient {
    private final RestTemplate restTemplate;
    private static final String RANDOM_USER_API_URL = "https://randomuser.me/api/";

    public RandomUserClient(RestTemplate RestTemplate)
    {
        this.restTemplate = RestTemplate;
    }

    public User getRandomUser()
    {
        return getRandomUserInList().get(0);
    }

    public List<User> getRandomUserInList()
    {
        var response = getRandomUserResponse();

        if (!response.getResults().isEmpty()) {
            return response.getResults();
        }

        throw new RuntimeException("API'den kullanıcı verisi alınamadı.");
    }


    public RandomUserObj getRandomUserResponse()
    {
        var response = restTemplate.getForObject(RANDOM_USER_API_URL, RandomUserObj.class);

        if (response != null)
            return response;

        throw new RuntimeException("API'den kullanıcı verisi alınamadı.");
    }
}