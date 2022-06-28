package com.example.lesson02_01.repository;


import com.example.lesson02_01.entity.Currencyy;
import com.example.lesson02_01.projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "currency",excerptProjection = CustomCurrency.class)
public interface CurrencyRepositriy extends JpaRepository<Currencyy,Integer> {
    boolean existsByName(String name);
}
