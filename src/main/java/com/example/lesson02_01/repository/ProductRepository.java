package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.Product;

import com.example.lesson02_01.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {

    boolean existsByNameAndCategoryId(String name, Integer category_id);
}
