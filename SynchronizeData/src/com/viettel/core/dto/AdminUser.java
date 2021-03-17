package com.viettel.core.dto;

import java.io.Serializable;

public class AdminUser implements Serializable {
	private int UserID;
	private int DepID;
	private String LoginName;

	public AdminUser(int userID, int depID, String loginName) {
		UserID = userID;
		DepID = depID;
		LoginName = loginName;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public int getDepID() {
		return DepID;
	}

	public void setDepID(int depID) {
		DepID = depID;
	}

	public String getLoginName() {
		return LoginName;
	}

	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
}
