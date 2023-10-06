package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table ( name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    @Column( name = "nombre")
    private String nombre;

    @Column( name = "apellido")
    private String apellido;

    @Column( name = "dni")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn( name ="fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn( name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();
}