package com.galvanize;
import java.util.ArrayList;

public class Business implements Addressable {
	private String name;
	private ArrayList<Address> addresses = new ArrayList<Address>();
	
	public void addAddress(String address){
		addresses.add(new Address);
	}
	
	public String[] getAddresses(){
		return addresses;
	}
	public String getName(){
		return name;
	}
	
	Business(String _name){
		name = _name;
	}
}
