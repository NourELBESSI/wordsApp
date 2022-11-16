package com.noSQLProject.noSQLProject.repo;

import com.noSQLProject.noSQLProject.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepo extends MongoRepository<Post, String> {


}