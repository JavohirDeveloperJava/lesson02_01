package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.Supplier;

import com.example.lesson02_01.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier",excerptProjection = CustomSupplier.class)
public interface SupplierRepositroy extends JpaRepository<Supplier,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
