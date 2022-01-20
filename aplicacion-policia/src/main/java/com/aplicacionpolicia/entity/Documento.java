package com.aplicacionpolicia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotNull
    @NotBlank
    private String numero;

    @NotNull
    private LocalDate fechaRecepcion;

    private LocalDate fechaEntrega;

    @NotNull
    private Boolean estaEntregado;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cai_id", referencedColumnName = "id")
    private Cai cai;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "estacion_id", referencedColumnName = "id")
    private Estacion estacion;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "reclamante_id", referencedColumnName = "id")
    private UsuarioReclamante usuarioReclamante;

}
