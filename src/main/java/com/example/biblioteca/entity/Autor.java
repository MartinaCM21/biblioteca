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
@Builder
public class Autor extends Base {

    @Column( name = "nombre")
    private String nombre;

    @Column( name = "apellido")
    private String apellido;

    @Column( name = "biografia")
    private String biografia;
}