package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.bean.May;
import model.bean.PhienNguoiDung;
import utils.db.LibraryConnectDb;

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
            	May may = new MayDAO().getItem(rs.getInt("idm"));
                alItem.add(new PhienNguoiDung(rs.getInt("id"),may.getIdm(),may.getTenMay(),may.getTinhTrang(),may.getTrangThai(),rs.getTimestamp("thoiGianBatDau"),rs.getTimestamp("thoiGianKetThuc"),rs.getString("thoiGianChoi"),may.getDonGia()+""));
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
            	May may = new MayDAO().getItem(rs.getInt("idm"));
            	String thanhTien = 3000+"";
                c = new PhienNguoiDung(rs.getInt("id"),may.getIdm(),may.getTenMay(),may.getTinhTrang(),may.getTrangThai(),rs.getTimestamp("thoiGianBatDau"),rs.getTimestamp("thoiGianKetThuc"),rs.getString("thoiGianChoi"),thanhTien);
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
     
    public PhienNguoiDung getItemCom(int idm) {
    	conn = lcdb.getConnectMySQL();
        PhienNguoiDung c = null;
        String sql = "SELECT * FROM "+table+" WHERE idm = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idm);
            rs = pst.executeQuery();
            if (rs.next()) {
            	May may = new MayDAO().getItem(rs.getInt("idm"));
            	String thanhTien = 3000+"";
                c = new PhienNguoiDung(rs.getInt("id"),may.getIdm(),may.getTenMay(),may.getTinhTrang(),may.getTrangThai(),rs.getTimestamp("thoiGianBatDau"),rs.getTimestamp("thoiGianKetThuc"),rs.getString("thoiGianChoi"),thanhTien);
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
        String sql = "INSERT INTO "+table+"(idm,trangthai,thoigianbatdau,thoigianketthuc,thoigianchoi,thanhtien) VALUES (?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setInt(1,item.getIdmay());
            pst.setBoolean(2, item.getTrangThai());
            pst.setTimestamp(3, item.getThoiGianBatDau());
            pst.setTimestamp(4, item.getThoiGianKetThuc());
            pst.setString(5, item.getThoiGianChoi());
            pst.setString(6, item.getThanhTien());
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
        String sql = "UPDATE "+table+" SET trangthai = ?,thoigianbatdau = ?,thoigianketthuc = ?,thoigianchoi = ?,thanhtien = ? WHERE idm = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setBoolean(1, item.getTrangThai());
            pst.setTimestamp(2, item.getThoiGianBatDau());
            pst.setTimestamp(3, item.getThoiGianKetThuc());
            pst.setString(4, item.getThoiGianChoi());
            pst.setString(5,item.getThanhTien());
            pst.setInt(6,item.getIdmay());
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
    
    public int editItemTime(PhienNguoiDung item) {
    	int result = 0;  	
        conn = lcdb.getConnectMySQL();
        String sql = "UPDATE "+table+" SET trangthai = ?,thoigianbatdau = ?,thoigianketthuc = ?,thoigianchoi = ?,thanhtien = ? WHERE idm = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setBoolean(1, item.getTrangThai());
            pst.setTimestamp(2, item.getThoiGianBatDau());
            pst.setTimestamp(3, item.getThoiGianKetThuc());
            pst.setString(4, item.getThoiGianChoi());
            pst.setString(5,item.getThanhTien());
            pst.setInt(6,item.getIdmay());
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

