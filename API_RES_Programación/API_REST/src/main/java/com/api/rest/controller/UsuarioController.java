package com.api.rest.controller;

import com.api.rest.model.UsuarioModel;
import com.api.rest.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ArrayList<UsuarioModel> listaUsuarios() {
        return service.listaUsuarios();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioModel> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return service.guardarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public UsuarioModel actualizarUsuario(@RequestBody UsuarioModel usuario, @PathVariable Long id) {
        return service.actualizarUsuario(usuario, id);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        service.eliminarUsuario(id);
    }
}
