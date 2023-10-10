package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table ( name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class Domicilio extends Base {


    @Column ( name = "calle")
    private String calle;

    @Column ( name = "numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn( name = "fk_localidad")
    private Localidad localidad;
}