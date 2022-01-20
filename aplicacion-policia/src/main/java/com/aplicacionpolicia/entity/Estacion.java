package com.aplicacionpolicia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Estacion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotNull
    @NotBlank
    private String nombre;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ciudad_id", referencedColumnName = "ciudadId")
    private Ciudad ciudad;

    @OneToMany(mappedBy = "estacion", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Cai> cais;
}
