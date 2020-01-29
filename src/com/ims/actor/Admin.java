package com.ims.actor;

import com.ims.entity.Address;

class Admin {

	private String id;
	private String name;
	private Address address;
	private boolean loggedIn;
	private Supplier[] suppliers = new Supplier[100];
	private InventoryManager[] inventoryManagers = new InventoryManager[100];
	private int imcount;
	private int supcount;
	
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
		System.out.println("Name: "+ name);
		System.out.println("addressLine1: "+ address.getAddressLine1());
		System.out.println("addressLine2: "+ address.getAddressLine2());
		System.out.println("city: "+ address.getCity());
		System.out.println("pincode: "+ address.getPincode());
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
	}
}
