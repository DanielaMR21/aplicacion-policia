package com.aplicacionpolicia.controller.dto;

import com.aplicacionpolicia.entity.Departamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CiudadDto {

    private Long ciudadId;
    private String nombre;
    private Departamento departamento;
}
