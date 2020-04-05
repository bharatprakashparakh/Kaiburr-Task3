package io.glacier.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import io.glacier.model.*;
@Repository
public interface PlatformRepository extends MongoRepository<Platform,Integer> {

   // @Query("{name:'?0'}")
    //List<Platform> findn(String name);
}
