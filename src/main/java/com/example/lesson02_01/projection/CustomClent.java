package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.Clent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Clent.class)
public interface CustomClent {
    Integer getId();

    String getName();

    String getPhoneNumber();
}
