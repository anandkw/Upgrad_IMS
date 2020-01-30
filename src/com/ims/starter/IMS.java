package com.ims.starter;

import com.ims.actor.Admin;
import com.ims.actor.InventoryManager;
import com.ims.actor.Supplier;
import com.ims.entity.Order;

public class IMS {
	public static void main(String[] args) {
		
		Admin admin = new Admin("Rajesh");
		
		Supplier supplier1 = new Supplier("Kamlesh");
		String supplierId1 = admin.addSupplier(supplier1);
		
		InventoryManager im1 = new InventoryManager("Ankit", null);
		admin.addInventoryManager(im1);			
		
		im1.login("test", "password");
		
		Order o1 = new Order("Shoe", 1, supplierId1);
		im1.placeOrder(o1);
	}
}
