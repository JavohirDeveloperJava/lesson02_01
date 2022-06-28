package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.Output;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    String getDate();

    Integer getCurrency();

    Integer getFacturaNumber();

    String getCode();

    Integer getClent();
}
