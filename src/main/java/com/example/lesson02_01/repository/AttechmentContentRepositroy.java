package com.example.lesson02_01.repository;

import com.example.lesson02_01.entity.AttechmentContent;
import com.example.lesson02_01.projection.CostumAttechmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attechmentcontent",excerptProjection = CostumAttechmentContent.class)
public interface AttechmentContentRepositroy extends JpaRepository<AttechmentContent,Integer> {

}
