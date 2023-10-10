package com.example.biblioteca.repository;

import com.example.biblioteca.entity.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
