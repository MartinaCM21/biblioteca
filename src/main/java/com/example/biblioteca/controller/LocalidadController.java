package com.example.biblioteca.controller;

import com.example.biblioteca.controller.impl.BaseControllerImpl;
import com.example.biblioteca.entity.Localidad;
import com.example.biblioteca.service.impl.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.*;




@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {


}

