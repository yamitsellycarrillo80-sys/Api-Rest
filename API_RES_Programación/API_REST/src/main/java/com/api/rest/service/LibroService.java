package com.api.rest.service;

import com.api.rest.model.LibroModel;
import com.api.rest.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository repository;

    public ArrayList<LibroModel> listaLibros() {
        return (ArrayList<LibroModel>) repository.findAll();
    }

    public Optional<LibroModel> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public LibroModel guardarLibro(LibroModel libro) {
        return repository.save(libro);
    }

    public LibroModel actualizarLibro(LibroModel libro, Long id) {
        libro.setIdLibro(id);
        return repository.save(libro);
    }

    public void eliminarLibro(Long id) {
        repository.deleteById(id);
    }
}
