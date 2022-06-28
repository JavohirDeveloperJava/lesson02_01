package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.Input;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    String getDate();

    Integer getWarehouse();

    Integer getSupplier();

    Integer getCurrency();

    String getFacturaNumber();

    String getCode();




}
