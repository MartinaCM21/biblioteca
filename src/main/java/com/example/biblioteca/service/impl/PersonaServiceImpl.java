package com.example.biblioteca.service.impl;


import com.example.biblioteca.entity.Autor;
import com.example.biblioteca.entity.Persona;
import com.example.biblioteca.repository.AutorRepository;
import com.example.biblioteca.repository.BaseRepository;
import com.example.biblioteca.repository.PersonaRepository;
import com.example.biblioteca.service.AutorService;
import com.example.biblioteca.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> findAll() throws Exception {
        return null;
    }
}