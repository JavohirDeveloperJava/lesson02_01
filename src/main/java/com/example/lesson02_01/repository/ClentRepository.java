package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.Clent;

import com.example.lesson02_01.projection.CustomClent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "clent",excerptProjection = CustomClent.class)
public interface ClentRepository extends JpaRepository<Clent,Integer> {

    boolean existsByPhoneNumber(String phoneNumber);
}
