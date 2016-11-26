package model.bo;

import java.util.ArrayList;

import model.bean.QuanTriVien;
import model.dao.QuanTriVienDAO;

public class QuanTriVienBO {
	public ArrayList<QuanTriVien> getList() {
        return new QuanTriVienDAO().getList();
    }

	public QuanTriVien getItem(int id){
		return new QuanTriVienDAO().getItem(id);
	}
	
    public int addItem(QuanTriVien obj) {
        return new QuanTriVienDAO().addItem(obj);
    }

    public int delItem(int id) {
        return new QuanTriVienDAO().delItem(id);
    }

    public int editItem(QuanTriVien obj) {
        return new QuanTriVienDAO().editItem(obj);
    }
    
    public boolean getItemByUser(String tenDangNhap) {
		return new QuanTriVienDAO().getItemByUser(tenDangNhap);
	}

	public QuanTriVien getItemByName(String tenDangNhap) {
		return new QuanTriVienDAO().getItemByName(tenDangNhap);
	}
}
