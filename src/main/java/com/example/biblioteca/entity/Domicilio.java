package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Optional;

@Entity
@Table ( name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDomicilio;

    @Column ( name = "calle")
    private String calle;

    @Column ( name = "numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn( name = "fk_localidad")
    private Localidad localidad;
}