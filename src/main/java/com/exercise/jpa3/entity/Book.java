package com.exercise.jpa3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String bookName;

    //No Reference here make it Unidirectional
    //Now it is Bidirectional
//    @ManyToOne()
//    private Author author;
}
