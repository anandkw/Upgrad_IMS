package com.ims.notification;

import com.ims.actor.SystemUser;
import com.ims.data.NotificationsHolder;
import com.ims.data.SystemUsersHolder;
import com.ims.entity.Notification;

public class DashboardNotificationService implements INotificationService{

	@Override
	public void notify(String fromUserId, String toUserId, String message) {
		String notificationId = NotificationsHolder.addNotifications(new Notification(fromUserId, toUserId, message));
		SystemUser systemUser = SystemUsersHolder.getSystemUser(toUserId);
		systemUser.notifyMe(notificationId);
	}
	
}
