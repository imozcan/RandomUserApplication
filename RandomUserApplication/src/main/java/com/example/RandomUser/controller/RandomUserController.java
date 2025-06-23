package com.example.RandomUser.controller;

import com.example.randomuserme.dto.base.User;
import com.example.service.RandomUserAppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("dev/api")
public class RandomUserController {

    private final RandomUserAppService helper;

    public RandomUserController(RandomUserAppService helper)
    {
        this.helper = helper;
    }



    @GetMapping("/list")
    public List<User> getUsersInList() {

        return helper.getRandomUser();
    }

    @GetMapping("getUser")
    public com.example.entity.base.User getUser()
    {
        return helper.getUser();
    }

}