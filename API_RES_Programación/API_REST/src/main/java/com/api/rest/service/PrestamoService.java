package com.api.rest.service;

import com.api.rest.model.PrestamoModel;
import com.api.rest.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository repository;

    public ArrayList<PrestamoModel> listaPrestamos() {
        return (ArrayList<PrestamoModel>) repository.findAll();
    }

    public Optional<PrestamoModel> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public PrestamoModel guardarPrestamo(PrestamoModel prestamo) {
        return repository.save(prestamo);
    }

    public PrestamoModel actualizarPrestamo(PrestamoModel prestamo, Long id) {
        prestamo.setIdPrestamo(id);
        return repository.save(prestamo);
    }

    public void eliminarPrestamo(Long id) {
        repository.deleteById(id);
    }
}
