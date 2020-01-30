package com.ims.notification;

/**
 * @author sahilgupta
 *
 */
public interface INotificationService {
	
	public void notify(String fromUserId, String toUserId, String message);
	
}
