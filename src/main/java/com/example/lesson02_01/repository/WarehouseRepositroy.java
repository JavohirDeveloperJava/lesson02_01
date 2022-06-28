package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.Warehouse;

import com.example.lesson02_01.projection.CustomWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepositroy extends JpaRepository<Warehouse,Integer> {
    boolean existsByName(String name);
}
