package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table ( name = "autor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAutor;

    @Column( name = "nombre")
    private String nombre;

    @Column( name = "apellido")
    private String apellido;

    @Column( name = "biografia")
    private String biografia;
}