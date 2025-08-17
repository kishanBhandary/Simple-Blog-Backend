package com.Simple.Blog.Backend.Simple.Blog.Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@SpringBootApplication
public class SimpleBlogBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBlogBackendApplication.class, args);
	}
	public PlatformTransactionManager add(MongoDatabaseFactory databaseFactory){
		return new MongoTransactionManager(databaseFactory);
	}

}
