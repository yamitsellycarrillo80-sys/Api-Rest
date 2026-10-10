package com.api.rest.controller;

import com.api.rest.model.CategoriaModel;
import com.api.rest.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public ArrayList<CategoriaModel> listaCategorias() {
        return service.listaCategorias();
    }

    @GetMapping("/{id}")
    public Optional<CategoriaModel> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public CategoriaModel guardarCategoria(@RequestBody CategoriaModel categoria) {
        return service.guardarCategoria(categoria);
    }

    @PutMapping("/{id}")
    public CategoriaModel actualizarCategoria(@RequestBody CategoriaModel categoria, @PathVariable Long id) {
        return service.actualizarCategoria(categoria, id);
    }

    @DeleteMapping("/{id}")
    public void eliminarCategoria(@PathVariable Long id) {
        service.eliminarCategoria(id);
    }
}
