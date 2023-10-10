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
public class Localidad extends Base {

    @Column ( name = "denominacion")
    private String denominacion;
}