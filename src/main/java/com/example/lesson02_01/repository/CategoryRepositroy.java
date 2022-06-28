package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.Category;

import com.example.lesson02_01.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category",excerptProjection = CustomCategory.class)
public interface CategoryRepositroy extends JpaRepository<Category,Integer> {
}
