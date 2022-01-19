package com.aplicacionpolicia.controller;

import com.aplicacionpolicia.controller.dto.DepartamentoDto;
import com.aplicacionpolicia.controller.request.DepartamentoRequest;
import com.aplicacionpolicia.service.DepartamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/departamento")
public class DepartamentoController {

    private final DepartamentoService departamentoService;

    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<DepartamentoDto> getDepartamentos() {
        return departamentoService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DepartamentoDto createTodo(@RequestBody DepartamentoRequest request) {
        return departamentoService.save(request);
    }

}
