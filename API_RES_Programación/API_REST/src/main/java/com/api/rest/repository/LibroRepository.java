package com.api.rest.repository;

import com.api.rest.model.LibroModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends CrudRepository<LibroModel, Long> {
}
