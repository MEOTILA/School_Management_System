package org.example.base.service;

import org.example.base.model.BaseEntity;

import java.io.Serializable;

public interface BaseService <ID extends Serializable,T extends BaseEntity<ID>> {
    void save(T entity);

}
