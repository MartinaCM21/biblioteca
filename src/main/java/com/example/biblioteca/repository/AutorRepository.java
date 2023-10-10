package com.example.biblioteca.repository;

import com.example.biblioteca.entity.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
