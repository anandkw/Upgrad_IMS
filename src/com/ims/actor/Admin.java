package com.ims.actor;

import com.ims.entity.Address;

class Admin extends SystemUser {

	
	private Supplier[] suppliers = new Supplier[100];
	private InventoryManager[] inventoryManagers = new InventoryManager[100];
	private int imcount;
	private int supcount;
	
    public Admin() {

	}
	
    public Admin(String id, String name) {
    	super(id, name, null, false);
	}

    public Admin(String id, String name, Address address) {
		super(id, name, address, false);
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

	public void addInventoryManager(InventoryManager inventoryManager) {
		if(imcount<100) {
			inventoryManagers[imcount++] = inventoryManager;
			System.out.println("Inventory Manager added successfully");
			return;
		}
		System.out.println("System allows addition of only 100 inventory Managers");
	}
	
	public void addSupplier(Supplier supplier) {
		if(supcount < 100) {
			suppliers[supcount++] = supplier;
			System.out.println("Supplier added successfully");
			return;
		}
		System.out.println("System allows addition of only 100 Suppliers");
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
