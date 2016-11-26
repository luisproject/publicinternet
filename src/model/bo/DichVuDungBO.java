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
    public DichVuDung getItem(String tenDichVuDung){
    	return new DichVuDungDAO().getItem(tenDichVuDung);
    }
	public int delItemCom(int idm) {
		return new DichVuDungDAO().delItemCom(idm);
	}
}
