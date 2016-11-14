package model.bo;

import java.util.ArrayList;
import model.bean.PhienNguoiDung;
import model.dao.PhienNguoiDungDAO;

@SuppressWarnings("all")
public class PhienNguoiDungBO {
	
	public ArrayList<PhienNguoiDung> getList() {
        return new PhienNguoiDungDAO().getList();
    }

	public PhienNguoiDung getItem(int id){
		return new PhienNguoiDungDAO().getItem(id);
	}
	
	public PhienNguoiDung getItemCom(int idm){
		return new PhienNguoiDungDAO().getItemCom(idm);
	}
	
    public int addItem(PhienNguoiDung obj) {
        return new PhienNguoiDungDAO().addItem(obj);
    }

    public int delItem(int id) {
        return new PhienNguoiDungDAO().delItem(id);
    }

    public int editItem(PhienNguoiDung obj) {
        return new PhienNguoiDungDAO().editItem(obj);
    }
    
    public int editItemTime(PhienNguoiDung obj){
    	return new PhienNguoiDungDAO().editItemTime(obj);
    }
    
}
