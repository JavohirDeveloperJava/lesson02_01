package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getName();

    boolean getActive();

    String getPhoneNumber();
}
