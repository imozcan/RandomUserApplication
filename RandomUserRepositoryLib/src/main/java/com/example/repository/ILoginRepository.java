package com.example.repository;

import com.example.entity.Login;
import com.example.entity.base.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginRepository extends CrudRepository <Login, Long>{
    Login findByUsername(String username);
}
