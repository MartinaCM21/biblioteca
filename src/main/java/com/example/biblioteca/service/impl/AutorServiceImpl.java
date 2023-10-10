package com.example.biblioteca.service.impl;

import com.example.biblioteca.entity.Autor;
import com.example.biblioteca.repository.AutorRepository;
import com.example.biblioteca.repository.BaseRepository;
import com.example.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }

    @Override
    public List<Autor> findAll() throws Exception {
        return null;
    }
}