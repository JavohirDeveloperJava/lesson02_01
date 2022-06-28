package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Integer getId();

    String getName();

        boolean getActive();
}
