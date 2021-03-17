package com.viettel.core.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.viettel.core.business.AdminUserBO;
import com.viettel.core.dbconnection.DbConnectionService;
import com.viettel.core.dto.AdminUser;
import com.viettel.core.utils.ManageFile;

public class ManageSolution {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//		List<AdminUser> list = AdminUserBO.GetListAdminUsers();
//		for (AdminUser adminUser : list) {
//			System.out.println(adminUser.getLoginName());
//		}
		ManageFile.ReadFile();

	}

}
