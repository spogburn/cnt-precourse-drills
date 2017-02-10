package com.galvanize;
import java.util.ArrayList;

public abstract class Business implements Addressable {
	private String name;
	private ArrayList<Address> addresses = new ArrayList<Address>();
	
	public void addAddress(String street, String city, String state, String zip){
		Address address = new Address(street, city, state, zip);
		addresses.add(address);
	}
	
	public ArrayList<Address> getAddresses(String[] addresses){
		for (int i = 0; i < addresses.length; i++){
			System.out.println(addresses.get(i));
		}
	}
	public String getName(){
		return name;
	}
	
	Business(String _name){
		name = _name;
	}
}
