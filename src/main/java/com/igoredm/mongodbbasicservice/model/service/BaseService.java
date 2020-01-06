package com.igoredm.mongodbbasicservice.model.service;

import com.igoredm.mongodbbasicservice.model.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseService<T> {

    @Autowired
    private BaseRepository<T> repository;

    public List<T> findAll() {
        return repository.findAll() ;
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public void deleteAll() { repository.deleteAll(); }
}
