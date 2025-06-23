package com.example.repository;

import com.example.entity.base.RandomUserObj;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRandomUserObjRepository extends CrudRepository<RandomUserObj, Long> {
}
