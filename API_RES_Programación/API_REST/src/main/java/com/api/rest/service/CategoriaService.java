package com.api.rest.service;

import com.api.rest.model.CategoriaModel;
import com.api.rest.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public ArrayList<CategoriaModel> listaCategorias() {
        return (ArrayList<CategoriaModel>) repository.findAll();
    }

    public Optional<CategoriaModel> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public CategoriaModel guardarCategoria(CategoriaModel categoria) {
        return repository.save(categoria);
    }

    public CategoriaModel actualizarCategoria(CategoriaModel categoria, Long id) {
        categoria.setIdCategoria(id);
        return repository.save(categoria);
    }

    public void eliminarCategoria(Long id) {
        repository.deleteById(id);
    }
}
