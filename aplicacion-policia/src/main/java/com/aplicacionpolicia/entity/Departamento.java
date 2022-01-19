package com.aplicacionpolicia.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "departamentos")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long departamentoId;

    @NotNull
    @NotBlank
    private String nombre;

    @OneToMany(mappedBy = "departamento",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Ciudad> ciudades;

}


