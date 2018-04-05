package com.jeya.spring;

public class Address {
	private String houseNumber;
	private String streetName;
	private String cityName;

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void print() {
		System.out.println("Address: ");
		System.out.println(houseNumber + "," + streetName + ",");
		System.out.println(cityName);
	}
}