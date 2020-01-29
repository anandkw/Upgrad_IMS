package com.ims.actor;

import com.ims.entity.Address;

class Admin {

	String id;
	String name;
	Address address;
	boolean loggedIn;
	Supplier[] suppliers;
	InventoryManager[] inventoryManagers;
	
    public Admin() {

	}
	
    public Admin(String id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

    public Admin(String id, String name, Address address) {
		this(id, name);
		// Address constructor not accessible
		this.address = address;
	}
    
    public Admin(String id, String name, Address address, Supplier[] suppliers, InventoryManager[] inventoryManagers) {
		this(id, name, address);
		// Address constructor not accessible
		this.suppliers = suppliers;
		this.inventoryManagers = inventoryManagers;
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
		
		// Address Constructor not accessible
		Address address = new Address( "15-A J&K Block", "Laxmi nagar", "110092", "Delhi");
		
		Admin admin = new Admin("a13", "Ankit",address);
		admin.login("test", "password");
		admin.checkProfileDashboard();
	}
}
