package com.viettel.core.business;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.viettel.core.dto.AdminUser;
import com.viettel.core.mapper.AdminUserMapper;

public class AdminUserBO {
    public static List<AdminUser> GetListAdminUsers(){
        List<AdminUser> users = null;
        AdminUserMapper mapper = null;
        try {
            mapper = new AdminUserMapper();
            users = mapper.GetListAdminUsers();
        } catch (Exception ex) {
            Logger.getLogger(AdminUserBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                mapper.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(AdminUserBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return users;
    }
}
