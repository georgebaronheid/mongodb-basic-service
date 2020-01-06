package com.igoredm.mongodbbasicservice.controller;

import com.igoredm.mongodbbasicservice.model.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Primary
public class BaseController<T> {

    @Autowired
    private BaseService<T> service;

    @GetMapping()
    public List<T> findAll() {
        return service.findAll();
    }
}
