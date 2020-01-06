package com.igoredm.mongodbbasicservice.model.service;

import com.igoredm.mongodbbasicservice.model.entity.LogEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LogService extends BaseService<LogEntity> {
    public void save(String serviceName, List<String> descricao) {
        LogEntity entity = new LogEntity();
        entity.setDataInclusao(LocalDateTime.now());
        entity.setServiceName(serviceName);
        entity.setDescricao(descricao);
        super.save(entity);
    }
}
