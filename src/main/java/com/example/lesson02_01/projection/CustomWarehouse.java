package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {

    Integer getId();

    String getName();

    boolean getActive();

}
