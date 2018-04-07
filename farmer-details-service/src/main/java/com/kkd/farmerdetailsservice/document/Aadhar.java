package com.kkd.farmerdetailsservice.document;


import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Aadhar {
	
	private String aadharNo;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String gender;
	private String fatherName;
	private String photoUrl;
	private Address permanentAddress;
	
	public Aadhar() {
		super();
	}
	
	public Aadhar(String aadharNo, String firstName, String lastName, LocalDate dateOfBirth, String gender,
			String fatherName, String photoUrl, Address permanentAddress) {
		super();
		this.aadharNo = aadharNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.fatherName = fatherName;
		this.photoUrl = photoUrl;
		this.permanentAddress = permanentAddress;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	@Override
	public String toString() {
		return "Aadhar [aadharNo=" + aadharNo + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", fatherName=" + fatherName + ", photoUrl=" + photoUrl
				+ ", permanentAddress=" + permanentAddress + "]";
	}
}
