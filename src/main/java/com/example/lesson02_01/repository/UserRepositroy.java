package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.User;

import com.example.lesson02_01.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user",excerptProjection = CustomUser.class)
public interface UserRepositroy extends JpaRepository<User,Integer> {

    boolean existsByPhoneNumber(String phoneNumber);

    boolean existsByCode(String code);
}
