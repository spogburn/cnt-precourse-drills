package com.galvanize;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public String getStreet(){
		return street;
	}
	public void setStreet(String newStreet){
		street = newStreet;
	}
	public String getCity(){
		return city;
	}
	public void setCity(String newCity){
		city = newCity;
	}
	public String getState(){
		return state;
	}
	public void setState(String newState){
		state = newState;
	}
	public String getZip(){
		return zip;
	}
	public void setZip(String newZip){
		zip = newZip;
	}
	
	Address(String _street, String _city, String _state, String _zip){
		street = _street;
		city = _city;
		state = _state;
		zip = _zip;
	}
}
