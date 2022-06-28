package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    boolean getActive();

    Integer getParentCategory();
}
