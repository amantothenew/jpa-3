package com.exercise.jpa3.service;

import com.exercise.jpa3.entity.Author;
import com.exercise.jpa3.repo.AuthorRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AuthorService {

    private final AuthorRepo repo;

    public List<Author> saveAll(List<Author> authors) {
        return repo.saveAll(authors);
    }
}
