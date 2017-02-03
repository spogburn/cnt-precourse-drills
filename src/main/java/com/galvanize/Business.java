package com.galvanize;
import java.util.ArrayList;


public class Business implements Addressable {
	private String name;
	List addresses = new ArrayList();
	
	void addAddress(String address){
		addresses.add(address);
	}
	
	public String getAddresses(){
		return addresses;
	}
	public String getName(){
		return name;
	}
	
	Business(String _name){
		name = _name;
	}
}
