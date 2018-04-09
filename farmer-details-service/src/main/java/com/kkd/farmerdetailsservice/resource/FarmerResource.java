package com.kkd.farmerdetailsservice.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkd.farmerdetailsservice.document.Address;
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

	@GetMapping("/users/location/{location}")
	public List<Farmer> getAllByLocation(@PathVariable String location){
		return farmerDetailsRepository.findAllBycities(location);
	}
	
	@GetMapping("users/phone/{mobileNo}")
	public String getByMobileNo(@PathVariable String mobileNo) {
		
		//try catch
		if(farmerDetailsRepository.findBymobileNo(mobileNo) != null)
			return farmerDetailsRepository.findBymobileNo(mobileNo).getPassword();
		else
			return "No user found!!";
	}
	
	@PutMapping("/users/change/{mobileNo}")
	public String updatePassword(@RequestBody String password,@PathVariable String mobileNo) {
		
		Farmer farmer = farmerDetailsRepository.findBymobileNo(mobileNo);
		farmer.setPassword(password);
		farmerDetailsRepository.save(farmer);
		return "password changed successfully";
	}
	
	@DeleteMapping("/users/delete/{kkdFarmId}")
	public String deleteAccount(@PathVariable String kkdFarmId) {
		farmerDetailsRepository.deleteById(kkdFarmId);
		return "Account Deleted Successfully";
	}
	
	@GetMapping("/users/id/{kkdFarmId}")
	public Optional<Farmer> getById(@PathVariable String kkdFarmId){
		return farmerDetailsRepository.findById(kkdFarmId);
	}
	
	@PutMapping("/users/addressUpdate/{mobileNo}")
	public String addressUpdate(@RequestBody Address address,@PathVariable String mobileNo) {
		
		Farmer farmer = farmerDetailsRepository.findBymobileNo(mobileNo);
		farmer.setCurrentAddress(address);
		farmerDetailsRepository.save(farmer);
		return "password changed successfully";
	}
}
