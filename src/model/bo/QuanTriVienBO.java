package model.bo;

import java.util.ArrayList;

import model.bean.QuanTriVien;
import model.dao.QuanTriVienDAO;

public class QuanTriVienBO {
	public ArrayList<QuanTriVien> getList() {
        return new QuanTriVienDAO().getList();
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
}
