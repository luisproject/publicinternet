package model.bo;

import java.util.ArrayList;

import model.bean.May;
import model.dao.MayDAO;

public class MayBO {
	public ArrayList<May> getList() {
        return new MayDAO().getList();
    }
	
	public May getItem(int cid) {
		return new MayDAO().getItem(cid);
	}
    public int addItem(May obj) {
        return new MayDAO().addItem(obj);
    }

    public int delItem(int id) {
        return new MayDAO().delItem(id);
    }

    public int editItem(May obj) {
        return new MayDAO().editItem(obj);
    }
    
    public May getItemName(String tenMay) {
		return new MayDAO().getItemName(tenMay);
	}
}
