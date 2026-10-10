package com.api.rest.repository;

import com.api.rest.model.PrestamoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends CrudRepository<PrestamoModel, Long> {
}
