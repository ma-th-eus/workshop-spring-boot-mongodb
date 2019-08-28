package com.matheuscosta.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matheuscosta.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
