package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.OutputProduct;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutpuProduct {

    Integer getId();

    Integer getProduct();

    Integer getAmount();

    Double getPrice();

    Integer getOutput();
}
