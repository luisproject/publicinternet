package controller;

import java.awt.Dimension;
import java.awt.Font;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import model.bean.PhienNguoiDung;
import model.bo.PhienNguoiDungBO;

@SuppressWarnings("all")
public class ControllerPhienNguoiDung extends AbstractTableModel{
	private JTable table;
    private PhienNguoiDungBO model;
    private String[] cols = {
        "<html><center><p style='color:#00434a;font-weight:bold;'>STT</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Tên Máy</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Tình Trạng</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Trạng Thái</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Thời Gian Bắt Đầu</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Thời Gian Kết Thúc</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Thời Gian Chơi</p></center></html>",
        "<html><center><p style='color:#00434a;font-weight:bold;'>Thành Tiền</p></center></html>"
    };
    private ArrayList<PhienNguoiDung> alItem = new ArrayList<PhienNguoiDung>();
    
    public ControllerPhienNguoiDung(JTable table){
        this.table = table;
        model = new PhienNguoiDungBO();
        alItem = model.getList();
    }
    @Override
    public int getRowCount() {
        return alItem.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PhienNguoiDung Item = alItem.get(rowIndex);
        Object object = null;
        switch(columnIndex){
            case 0:
                object = Item.getId();
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
            	object = String.valueOf(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(Item.getThoiGianBatDau().getTime())));
                break;
            case 5:
            	object = String.valueOf(new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(Item.getThoiGianKetThuc().getTime())));
            	break;
            case 6:
            	object = Item.getThoiGianChoi();
            	break;
            case 7:
            	object = Integer.parseInt(Item.getThanhTien());
            	break;
        }
        return object;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 0){
            return Integer.class;
        }else if(columnIndex == 1){
            return String.class;
        }else if(columnIndex == 2){
            return String.class;
        }else if(columnIndex == 3){
            return Boolean.class;
        }else if(columnIndex == 4){
            return String.class;
        }else if(columnIndex == 5){
            return String.class;
        }else if(columnIndex == 6){
            return String.class;
        }else if(columnIndex == 7){
            return Integer.class;
        }
        return super.getColumnClass(columnIndex); 
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return super.isCellEditable(rowIndex, columnIndex); 
    }
    
    public void loadTable(){
        
        this.table.setModel(this);
        this.table.setAutoCreateRowSorter(true);
        
        table.getTableHeader().setPreferredSize(new Dimension(0, 30));
        table.getTableHeader().setFont(new Font("Tahoma",Font.BOLD, 12));
        table.setRowHeight(26);
        table.setFont(new Font("Tahoma",Font.PLAIN, 12));
        
        table.getColumnModel().getColumn(0).setPreferredWidth(40);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(2).setPreferredWidth(70);
        table.getColumnModel().getColumn(3).setPreferredWidth(70);
        table.getColumnModel().getColumn(4).setPreferredWidth(140);
        table.getColumnModel().getColumn(5).setPreferredWidth(140);
        table.getColumnModel().getColumn(6).setPreferredWidth(140);
        table.getColumnModel().getColumn(7).setPreferredWidth(80);
    }

    public int addItem(PhienNguoiDung obj) {
        // thêm vào database
        int result = model.addItem(obj);
        // thêm vào model
        obj.setId(result);
        alItem.add(obj);
        this.fireTableDataChanged();
        table.scrollRectToVisible(table.getCellRect(this.getRowCount()-1, 0, true));
        return result;
    }

    public int deleteItem(PhienNguoiDung obj, int row) {
        // xóa trong database
        int result = model.delItem(obj.getId());
        // xóa trong model
        int rowmodel = table.convertRowIndexToModel(row);
        alItem.remove(rowmodel);
        this.fireTableDataChanged();
        return result;
    }

    public int editItem(PhienNguoiDung obj, int row) {
        // sữa trong database
        int id = model.editItem(obj);
        // sữa trong model
        obj.setId(id);
        int rowModel=table.convertRowIndexToModel(row);
        alItem.set(rowModel,obj);
        this.fireTableDataChanged();
        return id;
    }
}
