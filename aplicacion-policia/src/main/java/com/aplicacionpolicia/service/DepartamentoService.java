package com.aplicacionpolicia.service;

import com.aplicacionpolicia.controller.dto.DepartamentoDto;
import com.aplicacionpolicia.controller.request.DepartamentoRequest;

import java.util.List;

public interface DepartamentoService {

    DepartamentoDto save(DepartamentoRequest departamentoRequest);
    List<DepartamentoDto> getAll();
    DepartamentoDto getById(Long id);
    DepartamentoDto update(Long id, DepartamentoRequest departamentoRequest);
    void deleteById(Long id);
}
