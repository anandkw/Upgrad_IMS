package com.ims.actor;

public class Supplier {
	String id;
	String name;
	String addressLine1;
	String addressLine2;
	String pincode;
	String city;
	boolean loggedIn;
	
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
