package controller;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import model.bean.DichVu;
import model.bean.DichVuDung;
import model.bean.May;
import model.bo.DichVuBO;
import model.bo.DichVuDungBO;

@SuppressWarnings("all")
public class ControllerDichVuDung extends AbstractTableModel{
	
	private JTable table;
    private DichVuDungBO model;
    private String[] cols = {
        "<html><center><p style='color:#00434a;font-weight:bold;'>Tên Dịch Vụ</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Đơn Giá</p></center></html>",        
        "<html><center><p style='color:#00434a;font-weight:bold;'>Số Lượng</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Trạng Thái</p></center></html>"
    };
    private ArrayList<DichVuDung> alItem = new ArrayList<DichVuDung>();
    
    public ControllerDichVuDung(JTable table,May item) {
    	this.table = table;
        model = new DichVuDungBO();
        alItem = model.getList(item.getIdm());
	}
    
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return cols.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return alItem.size();
	}

	@Override
	public String getColumnName(int column) {
		return cols[column];
	};
	
	@Override
	public boolean isCellEditable(int rowIndex,int columnIndex){
		return super.isCellEditable(rowIndex, columnIndex);
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		DichVuDung Item = alItem.get(rowIndex);
        Object object = null;
        switch(columnIndex){
            case 0:
                object = Item.getTenDichVu();
                break;
            case 1:
                object = Item.getDonGia();
                break;
            case 2:
                object = Item.getSoLuong();
                break;
            case 3:
            	if(Integer.parseInt(Item.getTrangThai()) == 0){
            		object = "Đang xử lý";
            	}else{
            		object = "Đã xử lý";
            	}
            	break;
        }
        return object;
	}
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		if(columnIndex == 1){
            return Integer.class;
        }else if(columnIndex == 2){
            return Integer.class;
        }
		return super.getColumnClass(columnIndex);
	}
	public void loadTable(){
        
        this.table.setModel(this);
        this.table.setAutoCreateRowSorter(true);
        
        table.getTableHeader().setPreferredSize(new Dimension(0, 30));
        table.getTableHeader().setFont(new Font("Tahoma",Font.BOLD, 12));
        table.setRowHeight(26);
        table.setFont(new Font("Tahoma",Font.PLAIN, 12));
        
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
    }
}
