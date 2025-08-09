package com.Simple.Blog.Backend.Simple.Blog.Backend.Repository;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.Blog;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BlogRepository extends MongoRepository<Blog, ObjectId> {
    void deleteById(ObjectId id);
    Optional<Blog> findById(ObjectId id);

}
