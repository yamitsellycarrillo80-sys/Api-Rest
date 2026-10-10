package com.api.rest.repository;

import com.api.rest.model.AutorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends CrudRepository<AutorModel, Long> {
}
