package com.kkd.farmerdetailsservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.kkd.farmerdetailsservice.document.Farmer;

public interface FarmerDetailsRepository extends MongoRepository<Farmer, String> {

	public List<Farmer> findAllBycities(String location);
		//public List<Farmer> findAllBycities(String cities);
	public Farmer findBymobileNo(String mobileNo);
}
