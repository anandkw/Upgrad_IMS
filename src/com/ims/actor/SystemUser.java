package com.ims.actor;

import com.ims.entity.Address;

public class SystemUser {
	
	private String id;
	private String name;
	private Address address;
	protected boolean loggedIn;
	
	public SystemUser() {
		super();
	}

	public SystemUser(String id, String name, Address address, boolean loggedIn) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.loggedIn = loggedIn;
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

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
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
}
