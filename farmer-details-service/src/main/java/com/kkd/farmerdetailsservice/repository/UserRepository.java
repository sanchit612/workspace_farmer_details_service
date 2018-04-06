package com.kkd.farmerdetailsservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kkd.farmerdetailsservice.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {

}
