package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import utils.db.LibraryConnectDb;

public class ValidateDbQTV {
	public boolean tenDangNhap_exist(String tenDangNhap){
        boolean isExist = false;
        int count = 0;
        Connection conn = new LibraryConnectDb().getConnectMySQL();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT COUNT(*) AS CHECKA FROM quantrivien WHERE tendangnhap = ?");
            pst.setString(1, tenDangNhap);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                count = rs.getInt("CHECKA");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ValidateDbQTV.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(count > 0){
            isExist = true;
        }
        return isExist;
    }
    public boolean tenDangNhap_existver(String tenDangNhap,int id){
        boolean isExist = false;
        int count = 0;
        Connection conn = new LibraryConnectDb().getConnectMySQL();
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement("SELECT COUNT(*) AS CHECKB FROM quantrivien WHERE tenDangNhap = ? AND idqt NOT IN(?)");
            pst.setString(1, tenDangNhap);
            pst.setInt(2, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                count = rs.getInt("CHECKB");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ValidateDbQTV.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(count > 0){
            isExist = true;
        }
        return isExist;
    }
}
