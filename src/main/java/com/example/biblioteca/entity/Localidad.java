package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table ( name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Localidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLocalidad;

    @Column ( name = "denominacion")
    private String denominacion;
}