package com.example.biblioteca.service.impl;


import com.example.biblioteca.entity.Autor;
import com.example.biblioteca.entity.Localidad;
import com.example.biblioteca.repository.AutorRepository;
import com.example.biblioteca.repository.BaseRepository;
import com.example.biblioteca.repository.LocalidadRepository;
import com.example.biblioteca.service.AutorService;
import com.example.biblioteca.service.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }

    @Override
    public List<Localidad> findAll() throws Exception {
        return null;
    }
}