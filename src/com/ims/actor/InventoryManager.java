package com.ims.actor;

public class InventoryManager {

	String id;
	String name;
	String addressLine1;
	String addressLine2;
	String pincode;
	String city;
	boolean loggedIn;
	
	public InventoryManager() {

	}

	public InventoryManager(String id, String name, String addressLine1, String addressLine2, String pincode,
			String city, boolean loggedIn) {
		super();
		this.id = id;
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
		this.city = city;
		this.loggedIn = loggedIn;
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
		System.out.println("addressLine1: "+ addressLine1);
		System.out.println("addressLine2: "+ addressLine2);
		System.out.println("city: "+ city);
		System.out.println("pincode: "+ pincode);
	}

}
