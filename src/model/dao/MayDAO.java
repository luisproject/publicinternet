package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.bean.May;
import utils.db.LibraryConnectDb;

@SuppressWarnings("all")
public class MayDAO {
	private LibraryConnectDb lcdb;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection conn;
    private String table = "may";
    public MayDAO(){
    	lcdb = new LibraryConnectDb();
    }
    public ArrayList<May> getList(){
        ArrayList<May> alItem = new ArrayList<>();
        String sql = "SELECT * FROM "+table;
        conn = lcdb.getConnectMySQL();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                alItem.add(new May(rs.getInt("idm"), rs.getString("tenmay"), rs.getString("tinhtrang"), rs.getBoolean("trangthai"), rs.getString("mota"), rs.getInt("dongia")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MayDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MayDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return alItem;
    }
    
     public May getItem(int cid) {
        conn = lcdb.getConnectMySQL();
        May c = null;
        String sql = "SELECT * FROM "+table+" WHERE idm = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cid);
            rs = pst.executeQuery();
            if (rs.next()) {
                c = new May(rs.getInt("idm"), rs.getString("tenmay"), rs.getString("tinhtrang"), rs.getBoolean("trangthai"), rs.getString("mota"), rs.getInt("dongia"));
            }
        } catch (SQLException e) {
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return c;
    }
     
    public int addItem(May item) {
        int result = 0;
        conn = lcdb.getConnectMySQL();

        String sql = "INSERT INTO "+table+"(tenmay,tinhtrang,trangthai,mota,dongia) VALUES (?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, item.getTenMay());
            pst.setString(2, item.getTinhTrang());
            pst.setBoolean(3, item.getTrangThai());
            pst.setString(4, item.getMoTa());
            pst.setInt(5, item.getDonGia());
            pst.executeUpdate();
            rs = pst.getGeneratedKeys();
            if(rs.next()){
                result = rs.getInt(1);
            }
        } catch (SQLException e) {
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return result;
    }
    
    public int editItem(May c) {
        int result = 0;
        conn = lcdb.getConnectMySQL();
        String sql = "UPDATE "+table+" SET tenmay = ?,tinhtrang = ?,trangthai = ?,mota = ?,dongia = ? WHERE idm = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, c.getTenMay());
            pst.setString(2, c.getTinhTrang());
            pst.setBoolean(3, c.getTrangThai());
            pst.setString(4, c.getMoTa());
            pst.setInt(5, c.getDonGia());
            pst.setInt(6, c.getIdm());
            pst.executeUpdate();
            result = c.getIdm();
        } catch (SQLException e) {
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return result;
    }
    
    public int delItem(int cid) {
        int result = 0;
        conn = lcdb.getConnectMySQL();

        String sql = "DELETE FROM "+table+" WHERE idm = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cid);
            pst.executeUpdate();
            result = 1;
        } catch (SQLException e) {
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return result;
    }
	public May getItemName(String tenMay) {
		conn = lcdb.getConnectMySQL();
        May c = null;
        String sql = "SELECT * FROM "+table+" WHERE tenmay = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tenMay);
            rs = pst.executeQuery();
            if (rs.next()) {
                c = new May(rs.getInt("idm"), rs.getString("tenmay"), rs.getString("tinhtrang"), rs.getBoolean("trangthai"), rs.getString("mota"), rs.getInt("dongia"));
            }
        } catch (SQLException e) {
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return c;
	}
}
