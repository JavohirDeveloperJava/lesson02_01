package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.Attechment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attechment.class)
public interface CustomAttechment {

    Integer getId();

    String getOriginalName();

    long getSize();

    String getContentType();




}
