package com.learning.spring_learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.spring_learning.entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}
