package com.noSQLProject.noSQLProject.repo;

import com.noSQLProject.noSQLProject.model.post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface postRepo extends MongoRepository<post, String> {


}