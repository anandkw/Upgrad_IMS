package com.ims.actor;

import com.ims.entity.Invoice;

public class Supplier extends SystemUser {
	
	private Invoice[] raisedInvoices = new Invoice[100];
	
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
		System.out.println("Name: "+ getName());
		System.out.println("addressLine1: "+ super.getAddress().getAddressLine1());
		System.out.println("addressLine2: "+ super.getAddress().getAddressLine2());
		System.out.println("city: "+ super.getAddress().getCity());
		System.out.println("pincode: "+ super.getAddress().getPincode());
		System.out.println("Invoices Raised: "+raisedInvoices.length);
		
	}
	
	public void checkRaisedInvoices() {
		// TODO - Implementation
	}
}
