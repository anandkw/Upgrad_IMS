package com.ims.data;

import com.ims.entity.Order;

public class OrdersHolder {
	private static Order[] orders = new Order[1000];
	private static int currentId=1;
	
	public static String placeOrder(Order order) {
		String id = String.valueOf(currentId);
		order.setId(id);
		orders[currentId]= order;
		currentId = currentId+1;
		return id;
	}
}
