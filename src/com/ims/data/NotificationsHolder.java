package com.ims.data;

import com.ims.entity.Notification;

public class NotificationsHolder {

	private static Notification[] notifications = new Notification[1000];
	private static int currentId = 1;

	public static String addNotifications(Notification notification) {
		String id = String.valueOf(currentId);
		notification.setId(id);
		notifications[currentId] = notification;
		currentId = currentId + 1;
		return id;
	}

}
