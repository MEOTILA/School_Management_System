package org.example.base.service;

import org.example.base.model.BaseEntity;
import org.example.base.repository.BaseRepository;
import org.example.base.repository.BaseRepositoryImpl;

import java.io.Serializable;

public class BaseServiceImpl<ID extends Serializable, T extends BaseEntity<ID>, R extends BaseRepository<ID, T>> implements BaseService<ID, T> {

    private final R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public void save(T entity) {

        repository.save(entity);
    }

}
