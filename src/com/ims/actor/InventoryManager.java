package com.ims.actor;

import com.ims.entity.Address;

public class InventoryManager {

	private String id;
	private String name;
	private Address address;
	private boolean loggedIn;
	
	public InventoryManager() {

	}

	public InventoryManager(String id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void login(String userName, String password) {
		if(userName == "test" && password == "password") {
			loggedIn = true;
			System.out.println("Login Successful !");
			return;
		}
		loggedIn = false;
		System.out.println("Invalid credentials !!");
	}
	
	public void logout() {
		loggedIn = false;
		System.out.println("LoggedOut Successfully!!");
	}
	
	public void checkProfileDashboard() {
		
		if(!loggedIn) {
			System.out.println("Please login to check profile dashboard !");
			return;
		}
		
		System.out.println("Profile Details!!");
		System.out.println("Name: "+ name);
		System.out.println("addressLine1: "+ address.getAddressLine1());
		System.out.println("addressLine2: "+ address.getAddressLine2());
		System.out.println("city: "+ address.getCity());
		System.out.println("pincode: "+ address.getPincode());
	}

}
