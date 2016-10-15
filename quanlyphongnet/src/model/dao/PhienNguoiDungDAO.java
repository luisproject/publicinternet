package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.LibraryConnectDb;
import model.bean.PhienNguoiDung;

@SuppressWarnings("all")
public class PhienNguoiDungDAO {
	private LibraryConnectDb lcdb;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection conn;
    private String table = "phiennguoidung";
    
    public PhienNguoiDungDAO(){
        lcdb = new LibraryConnectDb();
    }
    
    public ArrayList<PhienNguoiDung> getList(){
        ArrayList<PhienNguoiDung> alItem = new ArrayList<>();
        String sql = "SELECT * FROM "+table;

        conn = lcdb.getConnectMySQL();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                alItem.add(new PhienNguoiDung(rs.getInt("id"),rs.getInt("idm"),rs.getTimestamp("thoigianbatdau"),rs.getTimestamp("tongthoigian"),rs.getTimestamp("thoigianchoi")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhienNguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhienNguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return alItem;
    }
    
     public PhienNguoiDung getItem(int id) {
        conn = lcdb.getConnectMySQL();
        PhienNguoiDung c = null;
        String sql = "SELECT * FROM "+table+" WHERE id = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                c = new PhienNguoiDung(rs.getInt("id"),rs.getInt("idm"),rs.getTimestamp("thoigianbatdau"),rs.getTimestamp("tongthoigian"),rs.getTimestamp("thoigianchoi"));
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
     
    public int addItem(PhienNguoiDung item) {
        int result = 0;
        conn = lcdb.getConnectMySQL();

        String sql = "INSERT INTO "+table+"(idm,thoigianbatdau,tongthoigian,thoigianchoi) VALUES (?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setInt(1,item.getIdmay());
            pst.setTimestamp(2, item.getThoiGianBatDau());
            pst.setTimestamp(3, item.getTongThoiGian());
            pst.setTimestamp(4, item.getThoiGianKetThuc());
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
    
    public int editItem(PhienNguoiDung item) {
        int result = 0;
        conn = lcdb.getConnectMySQL();
        String sql = "UPDATE "+table+" SET idm = ?,thoigianbatdau = ?,tongthoigian = ?,thoigianchoi = ? WHERE id = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1,item.getIdmay());
            pst.setTimestamp(2, item.getThoiGianBatDau());
            pst.setTimestamp(3, item.getTongThoiGian());
            pst.setTimestamp(4, item.getThoiGianKetThuc());
            pst.setInt(5,item.getId());
            pst.executeUpdate();
            result = item.getId();
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

        String sql = "DELETE FROM "+table+" WHERE id = ? LIMIT 1";
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
