package com.api.rest.controller;

import com.api.rest.model.AutorModel;
import com.api.rest.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping
    public ArrayList<AutorModel> listaAutores() {
        return service.listaAutores();
    }

    @GetMapping("/{id}")
    public Optional<AutorModel> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public AutorModel guardarAutor(@RequestBody AutorModel autor) {
        return service.guardarAutor(autor);
    }

    @PutMapping("/{id}")
    public AutorModel actualizarAutor(@RequestBody AutorModel autor, @PathVariable Long id) {
        return service.actualizarAutor(autor, id);
    }

    @DeleteMapping("/{id}")
    public void eliminarAutor(@PathVariable Long id) {
        service.eliminarAutor(id);
    }
}
