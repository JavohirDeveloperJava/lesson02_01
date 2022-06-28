package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.AttechmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttechmentContent.class)
public interface CostumAttechmentContent {

    Integer getId();

    byte getBytes();

    Integer getAttechment();

}
