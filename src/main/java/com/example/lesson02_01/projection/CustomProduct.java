package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    Integer getCategory();

    Integer getPhoto();

    String getCode();

    Integer getMeasurement();

}
