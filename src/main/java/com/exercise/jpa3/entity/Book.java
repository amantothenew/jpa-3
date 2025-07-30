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

    @ManyToOne
    //JoinColumn is optional in bidirectional one-to-many
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;
}
