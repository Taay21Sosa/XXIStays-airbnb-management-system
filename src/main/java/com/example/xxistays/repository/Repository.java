package com.example.xxistays.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    void loadAll(List<T> list);
    Optional<T> findById(String Id);
    void add(T entity);
    void update(T entity);
    void delete(T entity);
    void saveAll(List<T> list);
}
