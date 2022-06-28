package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.OutputProduct;

import com.example.lesson02_01.projection.CustomOutpuProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct",excerptProjection = CustomOutpuProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
