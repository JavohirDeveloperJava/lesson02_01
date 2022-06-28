package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.Input;
import com.example.lesson02_01.projection.CustomInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
}
