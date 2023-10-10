package com.example.biblioteca.service.impl;


import com.example.biblioteca.entity.Autor;
import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.repository.AutorRepository;
import com.example.biblioteca.repository.BaseRepository;
import com.example.biblioteca.repository.LibroRepository;
import com.example.biblioteca.service.AutorService;
import com.example.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }

    @Override
    public List<Libro> findAll() throws Exception {
        return null;
    }
}