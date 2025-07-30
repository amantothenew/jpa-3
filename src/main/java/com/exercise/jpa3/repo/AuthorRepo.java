package com.exercise.jpa3.repo;

import com.exercise.jpa3.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
