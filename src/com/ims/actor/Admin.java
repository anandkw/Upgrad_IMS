package com.ims.actor;

class Admin {

	String id;
	String name;
	String addressLine1;
	String addressLine2;
	String pincode;
	String city;
	
	boolean login(String userName, String password) {
		if(userName == "test" && password == "password") {
			return true;
		}
		return false;
	}
	
	boolean logout() {
		System.out.println("logout");
		return false;
	}
	
	void checkProfileDashboard() {
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
		
		// Printing attributes values of Admin object
		System.out.println(admin.id);
		System.out.println(admin.name);
		System.out.println(admin.addressLine1);
		System.out.println(admin.addressLine2);
		System.out.println(admin.pincode);
		System.out.println(admin.city);
	}
}
