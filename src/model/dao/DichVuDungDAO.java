package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.bean.DichVuDung;
import utils.db.LibraryConnectDb;

@SuppressWarnings("all")
public class DichVuDungDAO {
	private LibraryConnectDb lcdb;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection conn;
    private String table = "dichvudung";
    public DichVuDungDAO(){
    	lcdb = new LibraryConnectDb();
    }
    public ArrayList<DichVuDung> getList(int idm){
        ArrayList<DichVuDung> alItem = new ArrayList<>();
        String sql = "SELECT * FROM "+table+" WHERE idm = "+idm;
        conn = lcdb.getConnectMySQL();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                alItem.add(new DichVuDung(rs.getInt("id"), rs.getInt("idm"), rs.getString("tendichvu"), rs.getInt("dongia"), rs.getInt("soluong"),rs.getString("trangthai")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DichVuDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DichVuDungDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return alItem;
    }
    public int editItem(DichVuDung c) {
        int result = 0;
        conn = lcdb.getConnectMySQL();
        String sql = "UPDATE "+table+" SET trangthai = ? WHERE tendichvu = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, c.getTrangThai());
            pst.setString(2, c.getTenDichVu());
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
}
