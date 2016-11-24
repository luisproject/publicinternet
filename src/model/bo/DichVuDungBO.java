package model.bo;

import java.util.ArrayList;

import model.bean.DichVuDung;
import model.dao.DichVuDungDAO;

public class DichVuDungBO {
	public ArrayList<DichVuDung> getList(int idm) {
        return new DichVuDungDAO().getList(idm);
    }
    public int editItem(DichVuDung obj) {
        return new DichVuDungDAO().editItem(obj);
    }
}
