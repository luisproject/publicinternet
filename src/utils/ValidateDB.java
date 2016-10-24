package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import utils.db.LibraryConnectDb;

@SuppressWarnings("all")
public class ValidateDB {
	public boolean sophong_exist(int soPhong){
        boolean isExist = false;
        int count = 0;
        Connection conn = new LibraryConnectDb().getConnectMySQL();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT COUNT(*) AS CHECKA FROM phong WHERE sophong = ?");
            pst.setInt(1, soPhong);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                count = rs.getInt("CHECKA");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ValidateDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(count > 0){
            isExist = true;
        }
        return isExist;
    }
    public boolean sophong_existver(int soPhong,int id){
        boolean isExist = false;
        int count = 0;
        Connection conn = new LibraryConnectDb().getConnectMySQL();
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement("SELECT COUNT(*) AS CHECKB FROM phong WHERE sophong = ? AND map NOT IN(?)");
            pst.setInt(1, soPhong);
            pst.setInt(2, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                count = rs.getInt("CHECKB");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ValidateDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(count > 0){
            isExist = true;
        }
        return isExist;
    }
    public boolean typeroom_exist(String tenphong){
        boolean isExist = false;
        int count = 0;
        Connection conn = new LibraryConnectDb().getConnectMySQL();
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT COUNT(*) AS CHECKA FROM loaiphong WHERE tenphong = ?");
            pst.setString(1, tenphong);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                count = rs.getInt("CHECKA");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ValidateDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        isExist = ((count > 0)?true:false);
        return isExist;
    }
    public boolean typeroom_existver(String tenPhong,int id){
        boolean isExist = false;
        int count = 0;
        Connection conn = new LibraryConnectDb().getConnectMySQL();
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement("SELECT COUNT(*) AS CHECKB FROM loaiphong WHERE tenphong = ? AND malp NOT IN(?)");
            pst.setString(1, tenPhong);
            pst.setInt(2, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                count = rs.getInt("CHECKB");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ValidateDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(count > 0){
            isExist = true;
        }
        return isExist;
    }
}
