package com.kkd.farmerdetailsservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kkd.farmerdetailsservice.document.Farmer;

public interface FarmerDetails extends MongoRepository<Farmer, Integer> {

}
