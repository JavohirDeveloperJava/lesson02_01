package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.InputProduct;
import org.springframework.data.rest.core.config.Projection;



@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Long getProduct();

    Integer getAmount();

    Double getPrice();

    String getExpireDate();

    Integer getInput();
}
