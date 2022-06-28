package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.InputProduct;

import com.example.lesson02_01.projection.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputproduct",excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
