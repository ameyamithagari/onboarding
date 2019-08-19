package com.amdocs;

public class EmployeeAddress {
	public String doorNo;
	public String street;
	public String city;
	public String pinCode;
	public EmployeeAddress(String doorNo, String street, String city, String pinCode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", pinCode=" + pinCode
				+ "]";
	}

}