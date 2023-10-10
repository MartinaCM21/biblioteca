package com.example.biblioteca.controller;

import com.example.biblioteca.controller.impl.BaseControllerImpl;
import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.service.impl.LibroServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {


}
