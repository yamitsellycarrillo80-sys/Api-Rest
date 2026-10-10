package com.api.rest.controller;

import com.api.rest.model.LibroModel;
import com.api.rest.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService service;

    @GetMapping
    public ArrayList<LibroModel> listaLibros() {
        return service.listaLibros();
    }

    @GetMapping("/{id}")
    public Optional<LibroModel> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public LibroModel guardarLibro(@RequestBody LibroModel libro) {
        return service.guardarLibro(libro);
    }

    @PutMapping("/{id}")
    public LibroModel actualizarLibro(@RequestBody LibroModel libro, @PathVariable Long id) {
        return service.actualizarLibro(libro, id);
    }

    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id) {
        service.eliminarLibro(id);
    }
}
