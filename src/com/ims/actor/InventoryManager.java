package com.ims.actor;

import com.ims.entity.Address;

public class InventoryManager {

	String id;
	String name;
	Address address;
	boolean loggedIn;
	
	InventoryManager() {

	}

	InventoryManager(String id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void login(String userName, String password) {
		if(userName == "test" && password == "password") {
			loggedIn = true;
			System.out.println("Login Successful !");
			return;
		}
		loggedIn = false;
		System.out.println("Invalid credentials !!");
	}
	
	void logout() {
		loggedIn = false;
		System.out.println("LoggedOut Successfully!!");
	}
	
	void checkProfileDashboard() {
		
		if(!loggedIn) {
			System.out.println("Please login to check profile dashboard !");
			return;
		}
		
		System.out.println("Profile Details!!");
		System.out.println("Name: "+ name);
		// Address details not - accessible
		System.out.println("addressLine1: "+ address.addressLine1);
		System.out.println("addressLine2: "+ address.addressLine2);
		System.out.println("city: "+ address.city);
		System.out.println("pincode: "+ address.pincode);
	}

}
