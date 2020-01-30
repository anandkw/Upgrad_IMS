package com.ims.actor;

import com.ims.data.SystemUsersHolder;
import com.ims.entity.Address;

public class Admin extends SystemUser {

	
	private String[] suppliers = new String[100];
	private String[] inventoryManagers = new String[100];
	private int imcount=0;
	private int supcount=0;
	
    public Admin() {
    	
	}
	
    public Admin(String name) {
    	super(name, null, false);
	}

    public Admin(String id, String name, Address address) {
		super(name, address, false);
	}
	
    /*
     * Method Overriden from the System User class
     */
	public void checkProfileDashboard() {

		if (!loggedIn) {
			System.out.println("Please login to check profile dashboard !");
			return;
		}

		System.out.println("Profile Details!!");
		System.out.println("Name: " + getName());
		System.out.println("addressLine1: " + super.getAddress().getAddressLine1());
		System.out.println("addressLine2: " + super.getAddress().getAddressLine2());
		System.out.println("city: " + super.getAddress().getCity());
		System.out.println("pincode: " + super.getAddress().getPincode());
		System.out.println("Suppliers:" + supcount);
		System.out.println("Inventory Managers:" + imcount);
	}
	
	/**
	 * Oveloaded method
	 */
	public void checkProfileDashboard(boolean noAddressDetails) {

		if (!loggedIn) {
			System.out.println("Please login to check profile dashboard !");
			return;
		}
		if(noAddressDetails) {
			System.out.println("Profile Details!!");
			System.out.println("Name: " + getName());
			System.out.println("Suppliers:" + supcount);
			System.out.println("Inventory Managers:" + imcount);
		} else {
			checkProfileDashboard();
		}
	}

	public String addInventoryManager(InventoryManager inventoryManager) {
		String inventoryManagerId = SystemUsersHolder.saveSystemUser(inventoryManager);
		inventoryManagers[imcount]=inventoryManagerId;
		System.out.println("Inventory Manager "+ inventoryManager.getName()+" added successfully !");
		imcount = imcount + 1;
		return inventoryManagerId;
	}
	
	public String addSupplier(Supplier supplier) {
		String supplierId = SystemUsersHolder.saveSystemUser(supplier);
		suppliers[supcount]=supplierId;
		System.out.println("Supplier "+ supplier.getName()+" added successfully !");
		supcount = supcount +1;
		return supplierId;
	}
	
	public static void main(String[] args) {
		// Create object of Admin class
		
		// Address Constructor not accessible
		Address address = new Address( "15-A J&K Block", "Laxmi nagar", "110092", "Delhi");
		
		Admin admin = new Admin("a13", "Ankit",address);
		admin.login("test", "password");
		admin.checkProfileDashboard();
		
		// Dynamic Polymorphism 
		SystemUser systemUser = new Admin("a13", "Ankit",address);
		admin.login("test", "password");
		admin.checkProfileDashboard();
		
		System.out.println("*********");
		
		admin.checkProfileDashboard(true);
	}
}
