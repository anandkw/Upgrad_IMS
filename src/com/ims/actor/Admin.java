package com.ims.actor;

class Admin {

	String id;
	String name;
	String addressLine1;
	String addressLine2;
	String pincode;
	String city;
	boolean loggedIn;
	
	public Admin() {

	}
	
	public Admin(String id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	public Admin(String id, String name, String addressLine1, String addressLine2, String pincode, String city) {
		this(id, name);
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
		this.city = city;
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
	
	public static void main(String[] args) {
		// Create object of Admin class
		Admin admin = new Admin();
		
		// populating attributes of Admin object
		admin.id="a12";
		admin.name = "Sahil";
		admin.addressLine1="14-A J&K Block";
		admin.addressLine2 = "Laxmi nagar";
		admin.pincode = "110092";
		admin.city="Delhi";
		
		// Attempt1 -> without logging in 
		admin.checkProfileDashboard();
		
		// Attempt2 -> login with wrong password
		admin.login("test", "test");
		admin.checkProfileDashboard();
		
		// Attempt3 -> access to profile dashboard successful after successful login
		admin.login("test", "password");
		admin.checkProfileDashboard();
		
		// Calling Parameterized Constructor to create object
		Admin newAdmin = new Admin("a13", "Ankit", "15-A J&K Block", "Laxmi nagar", "110092", "Delhi");
		newAdmin.login("test", "password");
		newAdmin.checkProfileDashboard();
	}
}
