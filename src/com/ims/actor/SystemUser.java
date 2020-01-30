package com.ims.actor;

import com.ims.data.SystemUsersHolder;
import com.ims.entity.Address;

public class SystemUser {
	
	private String id;
	private String name;
	private Address address;
	private String emailId;
	protected boolean loggedIn;
	private String[] notificationIds = new String[1000];
	private static int currentNotificationIndex = 1;
	
	public SystemUser() {
		super();
		String id = SystemUsersHolder.saveSystemUser(this);
		this.id = id;
	}

	public SystemUser(String name, Address address, boolean loggedIn) {
		super();
		String id = SystemUsersHolder.saveSystemUser(this);
		this.id = id;
		this.name = name;
		this.address = address;
		this.loggedIn = loggedIn;
	}
	
	public void checkProfileDashboard() {
		
		if(!loggedIn) {
			System.out.println("Please login to check profile dashboard !");
			return;
		}		
		
		System.out.println("Profile Details!!");
		System.out.println("Name: "+ getName());
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public void notifyMe(String notificationId) {
		System.out.println(name + " received a new notification with id:"+notificationId);
		notificationIds[currentNotificationIndex]=id;
		currentNotificationIndex = currentNotificationIndex +1;
	}
	
	public void checkUnreadNotifications() {
		// Implement the functionality
	}
	
}
