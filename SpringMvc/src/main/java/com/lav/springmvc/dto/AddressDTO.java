package com.lav.springmvc.dto;

public class AddressDTO {
	
	private String name;
	private String village;
	private String city;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "AddressDTO [name=" + name + ", village=" + village + ", city="
				+ city + ", country=" + country + "]";
	}
}
