package com.aplicacionpolicia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cai {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotNull
    @NotBlank
    private String nombre;

    @NotNull
    @NotBlank
    private String direccionGoogle;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "estacion_id", referencedColumnName = "id")
    private Estacion estacion;


}
