package com.api.rest.service;

import com.api.rest.model.AutorModel;
import com.api.rest.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public ArrayList<AutorModel> listaAutores() {
        return (ArrayList<AutorModel>) repository.findAll();
    }

    public Optional<AutorModel> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public AutorModel guardarAutor(AutorModel autor) {
        return repository.save(autor);
    }

    public AutorModel actualizarAutor(AutorModel autor, Long id) {
        autor.setIdAutor(id);
        return repository.save(autor);
    }

    public void eliminarAutor(Long id) {
        repository.deleteById(id);
    }
}
