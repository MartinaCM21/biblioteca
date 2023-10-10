package com.example.biblioteca.repository;

import com.example.biblioteca.entity.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}
