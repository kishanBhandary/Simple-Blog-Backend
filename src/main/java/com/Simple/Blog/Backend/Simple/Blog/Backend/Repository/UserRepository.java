package com.Simple.Blog.Backend.Simple.Blog.Backend.Repository;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
  User findByUserName(String userName);
}
