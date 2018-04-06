package com.kkd.farmerdetailsservice.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkd.farmerdetailsservice.document.Farmer;
import com.kkd.farmerdetailsservice.repository.FarmerDetails;

@RestController
@RequestMapping("/rest/users")
public class FarmerResource {
	
	private FarmerDetails farmerDetails;
	
	public FarmerResource(FarmerDetails farmerDetails) {
		this.farmerDetails = farmerDetails;
	}
	
	@GetMapping("/all")
	public List<Farmer> getAll(){
		return farmerDetails.findAll();
		
	}
}
