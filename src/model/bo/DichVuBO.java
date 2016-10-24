package model.bo;

import java.util.ArrayList;

import model.bean.DichVu;
import model.dao.DichVuDAO;

public class DichVuBO {
	public ArrayList<DichVu> getList() {
        return new DichVuDAO().getList();
    }

    public int addItem(DichVu obj) {
        return new DichVuDAO().addItem(obj);
    }

    public int delItem(int id) {
        return new DichVuDAO().delItem(id);
    }

    public int editItem(DichVu obj) {
        return new DichVuDAO().editItem(obj);
    }
}
