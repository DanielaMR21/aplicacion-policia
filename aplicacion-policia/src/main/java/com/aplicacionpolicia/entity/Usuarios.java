package com.aplicacionpolicia.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    @NotBlank
    private String nombre;

    @NotNull
    @NotBlank
    private String apellido;

    @NotNull
    @NotBlank
    @Email
    private String correo;

    @ToString.Exclude
    @NotNull
    @NotBlank
    private String password;

    @NotNull
    private boolean estaActivo;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER
    )
    private List<Rol> roles;


}
