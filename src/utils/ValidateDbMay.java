package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import utils.db.LibraryConnectDb;

public class ValidateDbMay {
	public boolean tenmay_exist(String tenMay){
        boolean isExist = false;
        int count = 0;
        Connection conn = new LibraryConnectDb().getConnectMySQL();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT COUNT(*) AS CHECKA FROM may WHERE tenmay = ?");
            pst.setString(1, tenMay);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                count = rs.getInt("CHECKA");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ValidateDbMay.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(count > 0){
            isExist = true;
        }
        return isExist;
    }
    public boolean tenmay_existver(String tenMay,int id){
        boolean isExist = false;
        int count = 0;
        Connection conn = new LibraryConnectDb().getConnectMySQL();
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement("SELECT COUNT(*) AS CHECKB FROM may WHERE tenmay = ? AND idm NOT IN(?)");
            pst.setString(1, tenMay);
            pst.setInt(2, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                count = rs.getInt("CHECKB");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ValidateDbMay.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(count > 0){
            isExist = true;
        }
        return isExist;
    }
}
