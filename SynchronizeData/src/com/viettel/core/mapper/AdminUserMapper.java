package com.viettel.core.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.viettel.core.dbconnection.DbConnectionService;
import com.viettel.core.dto.ActionLog;
import com.viettel.core.dto.AdminUser;

public class AdminUserMapper extends DBMapper{
    public AdminUserMapper() throws Exception {
        super();
    }

    public List<AdminUser> GetListAdminUsers() {
        String query = "Select * from AdminUser";
        List<AdminUser> list = new ArrayList<AdminUser>();
            Connection connection = getConnection();
            PreparedStatement ps;
			try {
				ps = connection.prepareStatement(query);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                int UserID = rs.getInt("UserID");
	                int DepID  = rs.getInt("DepID");
	                String LoginName = rs.getString("LoginName");
	 
	                AdminUser user = new AdminUser(UserID, DepID, LoginName);
	                list.add(user);
	            }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        return list;
    }
    
    public boolean AddNewAdminUser(ActionLog actionLog) {
        String sql = "Insert Into ACTION_LOG(ACTION_LOG_ID, USER_ID,USER_NAME,ACTION_NAME,MODUN,OBJECT_ID,OBJECT_TYPE,"
        		+ "ACTION_DATE,OBJECT_TITLE,ACTION_TYPE,DEPT_ID,IP,DEPT_NAME,ACTION_ORDER,IDENTIFY_CODE,FULL_NAME,ACTION_NAME_TEXT,PARENT_ID,IS_LINKUNIT)" 
        		+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection connection = DbConnectionService.getJDBCConnectionOracle();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, actionLog.getActionLogID());
            ps.setInt(2, actionLog.getUserID());
            ps.setString(3, actionLog.getUserName());
            ps.setString(4, actionLog.getActionName());
            ps.setInt(5, actionLog.getModun());
            ps.setInt(6, actionLog.getObjectID());
            ps.setInt(7, actionLog.getObjectType()));
            ps.setBoolean(8, actionLog.isIsActive());
            ps.setString(9, actionLog.getName());
            ps.setBoolean(10, actionLog.isIsActive());
            ps.setString(11, actionLog.getName());
            ps.setBoolean(12, actionLog.isIsActive());
            ps.setString(13, actionLog.getName());
            ps.setBoolean(14, actionLog.isIsActive());
            ps.setString(15, actionLog.getName());
            ps.setBoolean(16, actionLog.isIsActive());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
