package com.example.lesson02_01.projection;

import com.example.lesson02_01.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getCode();
    boolean getActive();
    Integer getWarehouses();

}
