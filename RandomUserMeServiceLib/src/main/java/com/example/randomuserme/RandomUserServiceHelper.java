package com.example.randomuserme;

import com.example.randomuserme.dto.RandomUserResponse;
import com.example.randomuserme.dto.User;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RandomUserServiceHelper {
    private final RestTemplate restTemplate;
    private static final String RANDOM_USER_API_URL = "https://randomuser.me/api/";

    public RandomUserServiceHelper(RestTemplate RestTemplate)
    {
        this.restTemplate = RestTemplate;
    }

    public User getRandomUser()
    {
        var response = getRandomUserResponse();

        if (!response.getResults().isEmpty()) {
            return response.getResults().get(0);
        }

        throw new RuntimeException("API'den kullanıcı verisi alınamadı.");
    }


    public RandomUserResponse getRandomUserResponse()
    {
        var response = restTemplate.getForObject(RANDOM_USER_API_URL, RandomUserResponse.class);

        if (response != null)
            return response;

        throw new RuntimeException("API'den kullanıcı verisi alınamadı.");
    }
}