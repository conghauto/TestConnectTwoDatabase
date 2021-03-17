package com.viettel.core.dto;

import java.util.Date;

public class ActionLog {
	private int ActionLogID;
	private int UserID;
	private String UserName;
	private String ActionName;
	private int Modun;
	private int ObjectID;
	private int ObjectType;
	private Date ActionDate;
	private String ObjectTitle;
	private int ActionType;
	private int DeptID;
	private String IP;
	private String DeptName;
	private int ActionOrder;
	private String IdentifyCode;
	private String FullName;
	private String ActionNameText;
	private int ParentId;
	private int IsLinkUnit;

	public int getActionLogID() {
		return ActionLogID;
	}

	public void setActionLogID(int actionLogID) {
		ActionLogID = actionLogID;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getActionName() {
		return ActionName;
	}

	public void setActionName(String actionName) {
		ActionName = actionName;
	}

	public int getModun() {
		return Modun;
	}

	public void setModun(int modun) {
		Modun = modun;
	}

	public int getObjectID() {
		return ObjectID;
	}

	public void setObjectID(int objectID) {
		ObjectID = objectID;
	}

	public int getObjectType() {
		return ObjectType;
	}

	public void setObjectType(int objectType) {
		ObjectType = objectType;
	}

	public Date getActionDate() {
		return ActionDate;
	}

	public void setActionDate(Date actionDate) {
		ActionDate = actionDate;
	}

	public String getObjectTitle() {
		return ObjectTitle;
	}

	public void setObjectTitle(String objectTitle) {
		ObjectTitle = objectTitle;
	}

	public int getActionType() {
		return ActionType;
	}

	public void setActionType(int actionType) {
		ActionType = actionType;
	}

	public int getDeptID() {
		return DeptID;
	}

	public void setDeptID(int deptID) {
		DeptID = deptID;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	public int getActionOrder() {
		return ActionOrder;
	}

	public void setActionOrder(int actionOrder) {
		ActionOrder = actionOrder;
	}

	public String getIdentifyCode() {
		return IdentifyCode;
	}

	public void setIdentifyCode(String identifyCode) {
		IdentifyCode = identifyCode;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getActionNameText() {
		return ActionNameText;
	}

	public void setActionNameText(String actionNameText) {
		ActionNameText = actionNameText;
	}

	public int getParentId() {
		return ParentId;
	}

	public void setParentId(int parentId) {
		ParentId = parentId;
	}

	public int getIsLinkUnit() {
		return IsLinkUnit;
	}

	public void setIsLinkUnit(int isLinkUnit) {
		IsLinkUnit = isLinkUnit;
	}

	public ActionLog(int actionLogID, int userID, String userName, String actionName, int modun, int objectID,
			int objectType, Date actionDate, String objectTitle, int actionType, int deptID, String iP, String deptName,
			int actionOrder, String identifyCode, String fullName, String actionNameText, int parentId,
			int isLinkUnit) {
		super();
		ActionLogID = actionLogID;
		UserID = userID;
		UserName = userName;
		ActionName = actionName;
		Modun = modun;
		ObjectID = objectID;
		ObjectType = objectType;
		ActionDate = actionDate;
		ObjectTitle = objectTitle;
		ActionType = actionType;
		DeptID = deptID;
		IP = iP;
		DeptName = deptName;
		ActionOrder = actionOrder;
		IdentifyCode = identifyCode;
		FullName = fullName;
		ActionNameText = actionNameText;
		ParentId = parentId;
		IsLinkUnit = isLinkUnit;
	}

}
