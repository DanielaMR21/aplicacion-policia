package com.aplicacionpolicia.repository;

import com.aplicacionpolicia.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {


}
