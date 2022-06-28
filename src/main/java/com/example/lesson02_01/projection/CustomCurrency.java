package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.Currencyy;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currencyy.class)
public interface CustomCurrency {

    Integer getId();

    String getName();

    boolean getActive();
}
