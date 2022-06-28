package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.Output;

import com.example.lesson02_01.projection.CustomOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output",excerptProjection = CustomOutput.class)
public interface OutputRepositroy extends JpaRepository<Output,Integer> {
}
