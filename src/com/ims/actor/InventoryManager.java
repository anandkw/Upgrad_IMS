package com.ims.actor;

import com.ims.entity.Address;

public class InventoryManager extends SystemUser {

	
	public InventoryManager() {

	}

	public InventoryManager(String id, String name, Address address) {
		super(id, name,address,false);
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
	}
	
	
	
}
