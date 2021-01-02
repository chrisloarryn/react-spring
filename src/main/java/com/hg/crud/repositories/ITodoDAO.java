package com.hg.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hg.crud.models.TodoDTO;

@Repository
public interface ITodoDAO extends MongoRepository<TodoDTO, String> {


}
