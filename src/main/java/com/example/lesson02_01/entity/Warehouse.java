package com.example.lesson02_01.entity;

import com.example.lesson02_01.entity.template.AbsEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Warehouse extends AbsEntity {
}
