package com.example.biblioteca.service.impl;

import com.example.biblioteca.entity.Domicilio;
import com.example.biblioteca.repository.BaseRepository;
import com.example.biblioteca.repository.DomicilioRepository;
import com.example.biblioteca.service.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServiceImpl  extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository, DomicilioRepository domicilioRepository) {
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }

    @Override
    public List<Domicilio> findAll() throws Exception {
        return null;
    }
}