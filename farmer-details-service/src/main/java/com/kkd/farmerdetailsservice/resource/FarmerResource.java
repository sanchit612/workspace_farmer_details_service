package com.kkd.farmerdetailsservice.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkd.farmerdetailsservice.document.Farmer;
import com.kkd.farmerdetailsservice.repository.FarmerDetailsRepository;

@RestController
@RequestMapping("/farmer")
public class FarmerResource {
	
	@Autowired
	private FarmerDetailsRepository farmerDetailsRepository;
	
	public FarmerResource(FarmerDetailsRepository farmerDetailsRepository) {
		this.farmerDetailsRepository = farmerDetailsRepository;
	}
	
	@GetMapping("/all")
	public List<Farmer> getFarmer() {
		return farmerDetailsRepository.findAll();
	}
	
	@PostMapping("/newUser")
	public String addFarmers(@RequestBody Farmer farmer) {
		farmerDetailsRepository.save(farmer);
		return "Farmer successfully added";

	}
	
	@GetMapping("/users/{location}")
	public ArrayList<Farmer> getAllByLocation(@PathVariable String location){
		ArrayList<Farmer> farmersByLocation = new ArrayList<Farmer>();
		for (Farmer farmer : farmerDetailsRepository.findAll())
		{
			System.out.println(farmer.toString());
			for(String city : farmer.getCities())
			{
				if(city == location)
				{
					farmersByLocation.add(farmer);
				}
			}
		}
		return farmersByLocation;
	}
}
