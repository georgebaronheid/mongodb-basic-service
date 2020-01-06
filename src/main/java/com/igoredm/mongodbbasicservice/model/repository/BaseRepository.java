package com.igoredm.mongodbbasicservice.model.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface BaseRepository<T> extends MongoRepository<T, String> {

}
