package com.api.rest.service;

import com.api.rest.model.UsuarioModel;
import com.api.rest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public ArrayList<UsuarioModel> listaUsuarios() {
        return (ArrayList<UsuarioModel>) repository.findAll();
    }

    public Optional<UsuarioModel> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return repository.save(usuario);
    }

    public UsuarioModel actualizarUsuario(UsuarioModel usuario, Long id) {
        usuario.setIdUsuario(id);
        return repository.save(usuario);
    }

    public void eliminarUsuario(Long id) {
        repository.deleteById(id);
    }
}
