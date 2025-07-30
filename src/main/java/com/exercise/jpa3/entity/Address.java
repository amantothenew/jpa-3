package com.exercise.jpa3.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private Long streetNumber;
    private String location;
    private String state;
}
