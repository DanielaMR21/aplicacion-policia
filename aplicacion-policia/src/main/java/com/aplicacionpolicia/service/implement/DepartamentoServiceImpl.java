package com.aplicacionpolicia.service.implement;

import com.aplicacionpolicia.controller.dto.DepartamentoDto;
import com.aplicacionpolicia.controller.request.DepartamentoRequest;
import com.aplicacionpolicia.entity.Departamento;
import com.aplicacionpolicia.repository.DepartamentoRepository;
import com.aplicacionpolicia.service.DepartamentoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    private final DepartamentoRepository departamentoRepository;

    public DepartamentoServiceImpl(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }


    @Override
    public DepartamentoDto save(DepartamentoRequest departamentoRequest) {
        Departamento savedDepartamento = departamentoRepository.save(Departamento.builder()
                .departamentoId(departamentoRequest.getDepartamentoId())
                .nombre(departamentoRequest.getNombre())
                .ciudades(departamentoRequest.getCiudades())
                .build());
        return new DepartamentoDto(savedDepartamento.getDepartamentoId(),savedDepartamento.getNombre(), savedDepartamento.getCiudades());
    }

    @Override
    public List<DepartamentoDto> getAll() {
        return departamentoRepository.findAll().stream()
                .map(departamento -> new DepartamentoDto(departamento.getDepartamentoId(), departamento.getNombre(), departamento.getCiudades()))
                .collect(Collectors.toList());
    }

    @Override
    public DepartamentoDto getById(Long id) {
        return null;
    }

    @Override
    public DepartamentoDto update(Long id, DepartamentoRequest departamentoRequest) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
