package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.Attechment;
import com.example.lesson02_01.projection.CustomAttechment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attechment",excerptProjection = CustomAttechment.class)
public interface AttechmentRepository extends JpaRepository<Attechment,Integer> {
}
