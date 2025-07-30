package com.exercise.jpa3.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Address {
    private Long streetNumber;
    private String location;
    private String state;
}
