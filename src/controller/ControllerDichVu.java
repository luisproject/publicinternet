package controller;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import model.bean.DichVu;
import model.bo.DichVuBO;

@SuppressWarnings("all")
public class ControllerDichVu extends AbstractTableModel{
	
	private JTable table;
    private DichVuBO model;
    private String[] cols = {
        "<html><center><p style='color:#00434a;font-weight:bold;'>STT</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Tên Dịch Vụ</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Đơn Giá</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Đơn Vị</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Số Lượng</p></center></html>"
            
    };
    private ArrayList<DichVu> alItem = new ArrayList<DichVu>();
    
    public ControllerDichVu(JTable table) {
    	this.table = table;
        model = new DichVuBO();
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
		DichVu Item = alItem.get(rowIndex);
        Object object = null;
        switch(columnIndex){
            case 0:
                object = Item.getId();
                break;
            case 1:
                object = Item.getTenDichVu();
                break;
            case 2:
                object = Item.getDonGia();
                break;
            case 3:
                object = Item.getDonVi();
                break;
            case 4:
            	object = Item.getSoLuong();
            	break;
        }
        return object;
	}
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		if(columnIndex == 0){
            return Integer.class;
        }else if(columnIndex == 2){
            return Integer.class;
        }else if(columnIndex == 4){
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
    }
	public int addItem(DichVu obj) {
        // thêm vào database
        int result = model.addItem(obj);
        // thêm vào model
        obj.setId(result);
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

    public int editItem(DichVu obj, int row) {
        // sửa trong database
        int id = model.editItem(obj);
        // sửa trong model
        obj.setId(id);
        int rowModel=table.convertRowIndexToModel(row);
        alItem.set(rowModel,obj);
        this.fireTableDataChanged();
        return id;
    }
}
