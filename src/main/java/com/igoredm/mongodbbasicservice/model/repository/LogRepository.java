package com.igoredm.mongodbbasicservice.model.repository;

import com.igoredm.mongodbbasicservice.model.entity.LogEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends BaseRepository<LogEntity> {
}
