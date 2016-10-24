package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.bean.DichVu;
import utils.db.LibraryConnectDb;

@SuppressWarnings("all")
public class DichVuDAO {
	private LibraryConnectDb lcdb;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection conn;
    private String table = "dichvu";
    public DichVuDAO(){
    	lcdb = new LibraryConnectDb();
    }
    public ArrayList<DichVu> getList(){
        ArrayList<DichVu> alItem = new ArrayList<>();
        String sql = "SELECT * FROM "+table;
        conn = lcdb.getConnectMySQL();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                alItem.add(new DichVu(rs.getInt("iddv"), rs.getString("tendichvu"), rs.getInt("dongia"), rs.getString("donvi"), rs.getInt("soluong")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DichVuDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DichVuDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return alItem;
    }
    
     public DichVu getItem(int cid) {
        conn = lcdb.getConnectMySQL();
        DichVu c = null;
        String sql = "SELECT * FROM "+table+" WHERE idm = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cid);
            rs = pst.executeQuery();
            if (rs.next()) {
                c = new DichVu(rs.getInt("iddv"), rs.getString("tendichvu"), rs.getInt("dongia"), rs.getString("donvi"), rs.getInt("soluong"));
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
     
    public int addItem(DichVu item) {
        int result = 0;
        conn = lcdb.getConnectMySQL();

        String sql = "INSERT INTO "+table+"(tendichvu,dongia,donvi,soluong) VALUES (?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, item.getTenDichVu());
            pst.setInt(2, item.getDonGia());
            pst.setString(3, item.getDonVi());
            pst.setInt(4, item.getSoLuong());
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
    
    public int editItem(DichVu c) {
        int result = 0;
        conn = lcdb.getConnectMySQL();
        String sql = "UPDATE "+table+" SET tendichvu = ?,dongia = ?,donvi = ?,soluong = ? WHERE iddv = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, c.getTenDichVu());
            pst.setInt(2, c.getDonGia());
            pst.setString(3, c.getDonVi());
            pst.setInt(4, c.getSoLuong());
            pst.setInt(5, c.getId());
            pst.executeUpdate();
            result = c.getId();
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

        String sql = "DELETE FROM "+table+" WHERE iddv = ? LIMIT 1";
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
}
