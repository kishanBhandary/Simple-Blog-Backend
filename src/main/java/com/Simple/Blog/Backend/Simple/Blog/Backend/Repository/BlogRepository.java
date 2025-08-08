package com.Simple.Blog.Backend.Simple.Blog.Backend.Repository;


import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.Blog;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogRepository extends MongoRepository<Blog, ObjectId> {

}
