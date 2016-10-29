package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.bean.QuanTriVien;
import utils.LibraryString;
import utils.db.LibraryConnectDb;

@SuppressWarnings("all")
public class QuanTriVienDAO {
	private LibraryConnectDb lcdb;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection conn;
    private String table = "quantrivien";
    public QuanTriVienDAO(){
    	lcdb = new LibraryConnectDb();
    }
    public ArrayList<QuanTriVien> getList(){
        ArrayList<QuanTriVien> alItem = new ArrayList<>();
        String sql = "SELECT * FROM "+table;
        conn = lcdb.getConnectMySQL();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                alItem.add(new QuanTriVien(rs.getInt("idqt"),rs.getString("tendangnhap"),rs.getString("matkhau"),rs.getString("hoten"),rs.getBoolean("isadmin")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanTriVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanTriVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return alItem;
    }
    
     public QuanTriVien getItem(int cid) {
        conn = lcdb.getConnectMySQL();
        QuanTriVien c = null;
        String sql = "SELECT * FROM "+table+" WHERE idqt = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cid);
            rs = pst.executeQuery();
            if (rs.next()) {
                c = new QuanTriVien(rs.getInt("idqt"),rs.getString("tendangnhap"),rs.getString("matkhau"),rs.getString("hoten"),rs.getBoolean("isadmin"));
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
     
    public int addItem(QuanTriVien item) {
        int result = 0;
        conn = lcdb.getConnectMySQL();

        String sql = "INSERT INTO "+table+"(tendangnhap,matkhau,hoten,isadmin) VALUES (?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1,item.getTenDangNhap());
            pst.setString(2, new LibraryString().md5(item.getMatKhau()));
            pst.setString(3, item.getHoTen());
            pst.setBoolean(4, item.isAdmin());
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
    
    public int editItem(QuanTriVien c) {
        int result = 0;
        conn = lcdb.getConnectMySQL();
        String sql = "UPDATE "+table+" SET tendangnhap = ?,matkhau = ?,hoten = ?,isadmin = ? WHERE idqt = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,c.getTenDangNhap());
            pst.setString(2, new LibraryString().md5(c.getMatKhau()));
            pst.setString(3, c.getHoTen());
            pst.setBoolean(4, c.isAdmin());
            pst.setInt(5, c.getIdqtv());
            pst.executeUpdate();
            result = c.getIdqtv();
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

        String sql = "DELETE FROM "+table+" WHERE idqt = ? LIMIT 1";
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
