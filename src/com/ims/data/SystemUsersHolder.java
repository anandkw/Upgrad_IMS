package com.ims.data;

import com.ims.actor.SystemUser;

public class SystemUsersHolder {
	
	private static SystemUser[] systemUsers = new SystemUser[1000];
	private static int currentId=1;
	
	public static String saveSystemUser(SystemUser systemUser) {
		String id = String.valueOf(currentId);
		systemUser.setId(id);
		systemUsers[currentId]= systemUser;
		currentId = currentId+1;
		return id;
	}
	
	public static SystemUser getSystemUser(String id) {
		SystemUser systemUser = systemUsers[Integer.parseInt(id)];
		return systemUser;
	}
}
