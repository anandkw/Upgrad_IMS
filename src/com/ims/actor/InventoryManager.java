package com.ims.actor;

import com.ims.data.NotificationsHolder;
import com.ims.data.OrdersHolder;
import com.ims.data.SystemUsersHolder;
import com.ims.entity.Address;
import com.ims.entity.Notification;
import com.ims.entity.Order;
import com.ims.notification.DashboardNotificationService;
import com.ims.notification.INotificationService;

public class InventoryManager extends SystemUser {

	
	public InventoryManager() {

	}

	public InventoryManager(String name, Address address) {
		super(name,address,false);
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
	
	public void placeOrder(Order order) {
		String orderId = OrdersHolder.placeOrder(order);
		order.setInventoryManagerId(super.getId());
		System.out.println("Order placed !!");
		INotificationService notificationService = new DashboardNotificationService();
		notificationService.notify(this.getId(), order.getSupplierId(), "Order Received");
		// Notify
	}
	
}
