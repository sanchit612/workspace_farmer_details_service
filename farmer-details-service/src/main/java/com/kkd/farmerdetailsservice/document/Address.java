package com.kkd.farmerdetailsservice.document;

import org.springframework.stereotype.Component;

@Component
	public class Address {

		private String pincode;
		private String state;
		private String district;
		private String city;
		private String addressLine;
		
		public Address() {
			super();
		}
		public Address(String pincode, String state, String district,String city, String addressLine  ) {
			super();
			this.pincode = pincode;
			this.state = state;
			this.district = district;
			this.city = city;
			this.addressLine = addressLine;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		public String getAddressLine() {
			return addressLine;
		}
		public void setAddressLine(String addressLine) {
			this.addressLine = addressLine;
		}
		@Override
		public String toString() {
			return "Address [pincode=" + pincode + ", state=" + state + ", district=" + district + ", city=" + city
					+ ", addressLine=" + addressLine + "]";
		}
		
		

}
