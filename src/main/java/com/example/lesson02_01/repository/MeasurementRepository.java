package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.Measurement;

import com.example.lesson02_01.projection.CustomMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {

    boolean existsByName(String name);

}
