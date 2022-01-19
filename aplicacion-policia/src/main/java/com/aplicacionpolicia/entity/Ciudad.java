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
@Table(name = "ciudades")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long ciudadId;

    @NotNull
    @NotBlank
    private String nombre;

    @NotNull
    @ManyToOne
    @JoinColumn(name="departamentos_id", referencedColumnName = "departamentoId")
    private Departamento departamento;


}
