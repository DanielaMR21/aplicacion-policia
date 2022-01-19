package com.aplicacionpolicia.repository;

import com.aplicacionpolicia.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
