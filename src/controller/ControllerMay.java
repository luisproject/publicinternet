package controller;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import model.bean.DichVu;
import model.bean.May;
import model.bo.DichVuBO;
import model.bo.MayBO;


@SuppressWarnings("all")
public class ControllerMay extends AbstractTableModel{
	
	private JTable table;
    private MayBO model;
    private String[] cols = {
        "<html><center><p style='color:#00434a;font-weight:bold;'>STT</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Tên Máy</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Tình Trạng</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Trạng Thái</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Mô Tả</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Đơn Giá</p></center></html>"
    };
    private ArrayList<May> alItem = new ArrayList<May>();
    
    public ControllerMay(JTable table) {
    	this.table = table;
        model = new MayBO();
        alItem = model.getList();
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
		May Item = alItem.get(rowIndex);
        Object object = null;
        switch(columnIndex){
            case 0:
                object = Item.getIdm();
                break;
            case 1:
                object = Item.getTenMay();
                break;
            case 2:
                object = Item.getTinhTrang();
                break;
            case 3:
                object = Item.getTrangThai();
                break;
            case 4:
            	object = Item.getMoTa();
            	break;
            case 5:
            	object = Item.getDonGia();
            	break;
        }
        return object;
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		if(columnIndex == 0){
            return Integer.class;
        }else if(columnIndex == 3){
            return Boolean.class;
        }else if(columnIndex == 5){
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
        table.getColumnModel().getColumn(4).setPreferredWidth(100);
        table.getColumnModel().getColumn(5).setPreferredWidth(100);
    }
	
	public int addItem(May obj) {
        // thêm vào database
        int result = model.addItem(obj);
        // thêm vào model
        obj.setIdm(result);
        alItem.add(obj);
        this.fireTableDataChanged();
        table.scrollRectToVisible(table.getCellRect(this.getRowCount()-1, 0, true));
        return result;
    }

    public int delItem(int id, int row) {
        // xóa trong database
        int result = model.delItem(id);
        // xóa trong model
        int rowmodel = table.convertRowIndexToModel(row);
        alItem.remove(rowmodel);
        this.fireTableDataChanged();
        return result;
    }

    public int editItem(May obj, int row) {
        // sửa trong database
        int id = model.editItem(obj);
        // sửa trong model
        obj.setIdm(id);
        int rowModel=table.convertRowIndexToModel(row);
        alItem.set(rowModel,obj);
        this.fireTableDataChanged();
        return id;
    }
}
