package model.bo;

import java.util.ArrayList;

import model.bean.DichVuDung;
import model.dao.DichVuDungDAO;

public class DichVuDungBO {
	public ArrayList<DichVuDung> getList() {
        return new DichVuDungDAO().getList();
    }
    public int editItem(DichVuDung obj) {
        return new DichVuDungDAO().editItem(obj);
    }
}
