package com.aplicacionpolicia.controller.dto;

import com.aplicacionpolicia.entity.Ciudad;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartamentoDto {

    private Long departamentoId;
    private String nombre;
    private Set<Ciudad> ciudades;
}
