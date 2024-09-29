package com.apparel.apparel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apparel.apparel.model.Apparel;

public interface ApparelRepository extends MongoRepository<Apparel, String> {
    // MongoRepository provides CRUD operations and query methods
}
