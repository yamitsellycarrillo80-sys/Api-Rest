package com.api.rest.controller;

import com.api.rest.model.PrestamoModel;
import com.api.rest.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService service;

    @GetMapping
    public ArrayList<PrestamoModel> listaPrestamos() {
        return service.listaPrestamos();
    }

    @GetMapping("/{id}")
    public Optional<PrestamoModel> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public PrestamoModel guardarPrestamo(@RequestBody PrestamoModel prestamo) {
        return service.guardarPrestamo(prestamo);
    }

    @PutMapping("/{id}")
    public PrestamoModel actualizarPrestamo(@RequestBody PrestamoModel prestamo, @PathVariable Long id) {
        return service.actualizarPrestamo(prestamo, id);
    }

    @DeleteMapping("/{id}")
    public void eliminarPrestamo(@PathVariable Long id) {
        service.eliminarPrestamo(id);
    }
}
