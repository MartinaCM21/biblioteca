package com.example.biblioteca.controller;

import com.example.biblioteca.controller.impl.BaseControllerImpl;
import com.example.biblioteca.entity.Persona;
import com.example.biblioteca.service.impl.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {


}
