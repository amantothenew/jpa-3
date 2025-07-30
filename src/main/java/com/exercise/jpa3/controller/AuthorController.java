package com.exercise.jpa3.controller;

import com.exercise.jpa3.entity.Author;
import com.exercise.jpa3.repo.AuthorRepo;
import com.exercise.jpa3.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService service;

    @PostMapping
    public List<Author> saveAll(@RequestBody List<Author> authors) {
        return service.saveAll(authors);
    }

}
