package com.example.biblioteca.controller;

import com.example.biblioteca.controller.impl.BaseControllerImpl;
import com.example.biblioteca.entity.Domicilio;
import com.example.biblioteca.service.impl.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {


}
