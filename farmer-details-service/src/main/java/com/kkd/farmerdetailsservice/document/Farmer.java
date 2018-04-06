package com.kkd.farmerdetailsservice.document;


import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="farmer")
public class Farmer {
	
	@Id
	private String kkdFarmId;
	private String mobileNo;
	private String password;
	private String alternateNo;
	private ArrayList<String> cities;
	private Address currentAddress;
	private String status;
	private boolean autoConfirm;
	private Aadhar aadharData;
	
	public Farmer() {
		super();
	}

	public Farmer(String kkdFarmId, String mobileNo, String password, String alternateNo, ArrayList<String> cities,
			Address currentAddress, String status, boolean autoConfirm, Aadhar aadharData) {
		super();
		this.kkdFarmId = kkdFarmId;
		this.mobileNo = mobileNo;
		this.password = password;
		this.alternateNo = alternateNo;
		this.cities = cities;
		this.currentAddress = currentAddress;
		this.status = status;
		this.autoConfirm = autoConfirm;
		this.aadharData = aadharData;
	}

	public String getKkdFarmId() {
		return kkdFarmId;
	}

	public void setKkdFarmId(String kkdFarmId) {
		this.kkdFarmId = kkdFarmId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAlternateNo() {
		return alternateNo;
	}

	public void setAlternateNo(String alternateNo) {
		this.alternateNo = alternateNo;
	}

	public ArrayList<String> getCities() {
		return cities;
	}

	public void setCities(ArrayList<String> cities) {
		this.cities = cities;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isAutoConfirm() {
		return autoConfirm;
	}

	public void setAutoConfirm(boolean autoConfirm) {
		this.autoConfirm = autoConfirm;
	}

	public Aadhar getAadharData() {
		return aadharData;
	}

	public void setAadharData(Aadhar aadharData) {
		this.aadharData = aadharData;
	}

	@Override
	public String toString() {
		return "Farmer [kkdFarmId=" + kkdFarmId + ", mobileNo=" + mobileNo + ", password=" + password + ", alternateNo="
				+ alternateNo + ", cities=" + cities + ", currentAddress=" + currentAddress + ", status=" + status
				+ ", autoConfirm=" + autoConfirm + ", aadharData=" + aadharData + "]";
	}
	
	
}
