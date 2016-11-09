package view;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.ControllerPhienNguoiDung;
import model.bean.May;
import model.bean.PhienNguoiDung;
import model.bo.MayBO;
import model.bo.PhienNguoiDungBO;
import model.dao.PhienNguoiDungDAO;
import utils.LibraryString;
import utils.render.TinhTrangComboboxModel;

@SuppressWarnings("all")
public class PnUser extends JPanel{
	/**
	 * Create the panel.
	 */
	// Control + 7 => Structure Code Following Application
	private JSplitPane jSplitPane1;
	// Left
	private JPanel jPanel1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	
	private JTextField tfId;
	private JTextField tfTenMay;
	
	private JSpinner spKetThuc;
	private JSpinner spChoi;
	
	private JLabel jLabel6;
	private JLabel jLabel7;
	
	private JCheckBox jCheckBox1;
	private JCheckBox jCheckBox2;
	
	private JSpinner spBatDau;
	
	private JLabel jLabel8;
	private JTextField tfThanhTien;
	
	private JPanel jPanel7;
	private JButton jButton5;
	private JButton jButton6;
	
	private JComboBox<String> cbTinhTrang;
	
	
	// Right
	private JPanel jPanel2;
	
	private JPanel jPanel4;
	private JPanel jPanel5;
	private JLabel jLabel9;
	private JTextField tfIdF;
	private JLabel jLabel10;
	private JTextField jTextField4;
	private JLabel jLabel11;
	private JComboBox<String> cbTinhTrangF;
	private JLabel jLabel12;
	private JCheckBox jCheckBox3;
	private JCheckBox jCheckBox4;
	private JButton btTT;
	
	
	private JPanel jPanel6;
	private JButton btTimKiemF;
	private JButton btNhapLaiF;
	private JButton btClose;
	
	private JPanel jPanel3;
	private JScrollPane jScrollPane1;
	private JTable tbMain;
	
	private ButtonGroup btTrangThai;
	private ButtonGroup btTrangThaiF;
	
	private ControllerPhienNguoiDung controller;
	
	public PnUser(){
		initComponents();
		
		controller = new ControllerPhienNguoiDung(tbMain);
		 controller.loadTable();
		cbTinhTrang.setModel(new TinhTrangComboboxModel());
		cbTinhTrangF.setModel(new TinhTrangComboboxModel());
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		btTrangThai = new ButtonGroup();
        btTrangThaiF = new ButtonGroup();
        jSplitPane1 = new JSplitPane();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        tfId = new JTextField();
        tfTenMay = new JTextField();
        spKetThuc = new JSpinner();
        spChoi = new JSpinner();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jCheckBox1 = new JCheckBox();
        jCheckBox2 = new JCheckBox();
        spBatDau = new JSpinner();
        jLabel8 = new JLabel();
        tfThanhTien = new JTextField();
        jPanel7 = new JPanel();
        jButton5 = new JButton();
        jButton6 = new JButton();
        cbTinhTrang = new JComboBox<>();
        jPanel2 = new JPanel();
        jPanel4 = new JPanel();
        jPanel5 = new JPanel();
        jLabel9 = new JLabel();
        tfIdF = new JTextField();
        jLabel10 = new JLabel();
        jTextField4 = new JTextField();
        jLabel11 = new JLabel();
        cbTinhTrangF = new JComboBox<>();
        jLabel12 = new JLabel();
        jCheckBox3 = new JCheckBox();
        jCheckBox4 = new JCheckBox();
        btTT = new JButton();
        jPanel6 = new JPanel();
        btTimKiemF = new JButton();
        btNhapLaiF = new JButton();
        btClose = new JButton();
        jPanel3 = new JPanel();
        jScrollPane1 = new JScrollPane();
        tbMain = new JTable();

        setBackground(new java.awt.Color(242, 242, 242));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSplitPane1.setOneTouchExpandable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết phiên người dùng", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("STT:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tên máy:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Thời gian kết thúc:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Thời gian bắt đầu:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Thời gian chơi:");

        tfId.setEditable(false);
        tfId.setPreferredSize(new java.awt.Dimension(6, 24));

        tfTenMay.setPreferredSize(new java.awt.Dimension(6, 24));

        spKetThuc.setModel(new javax.swing.SpinnerDateModel());
        spKetThuc.setEditor(new javax.swing.JSpinner.DateEditor(spKetThuc, "dd/MM/yyyy - HH:mm:ss"));
        spKetThuc.setPreferredSize(new java.awt.Dimension(29, 24));

        spChoi.setModel(new javax.swing.SpinnerDateModel());
        spChoi.setEditor(new javax.swing.JSpinner.DateEditor(spChoi, "HH:mm:ss"));
        spChoi.setPreferredSize(new java.awt.Dimension(29, 24));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Tình trạng:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Trạng thái:");

        btTrangThai.add(jCheckBox1);
        jCheckBox1.setText("ON");

        btTrangThai.add(jCheckBox2);
        jCheckBox2.setText("OFF");

        spBatDau.setModel(new javax.swing.SpinnerDateModel());
        spBatDau.setEditor(new javax.swing.JSpinner.DateEditor(spBatDau, "dd/MM/yyyy - HH:mm:ss"));
        spBatDau.setPreferredSize(new java.awt.Dimension(29, 24));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Thành tiền:");

        tfThanhTien.setPreferredSize(new java.awt.Dimension(6, 24));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 204));
        jButton5.setText("Dịch vụ dùng");
        jPanel7.add(jButton5);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 204));
        jButton6.setText("Thanh toán");
        jPanel7.add(jButton6);

        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTinhTrang.setPreferredSize(new java.awt.Dimension(56, 24));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfTenMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addComponent(cbTinhTrang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfThanhTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spChoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTenMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách phiên người dùng", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(242, 242, 242));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(242, 242, 242));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("STT:");

        tfIdF.setPreferredSize(new java.awt.Dimension(6, 24));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Tên máy:");

        jTextField4.setPreferredSize(new java.awt.Dimension(6, 24));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Tình trạng:");

        cbTinhTrangF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTinhTrangF.setPreferredSize(new java.awt.Dimension(56, 24));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Trạng thái:");

        btTrangThaiF.add(jCheckBox3);
        jCheckBox3.setText("OK");

        btTrangThaiF.add(jCheckBox4);
        jCheckBox4.setText("OFF");

        btTT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btTT.setForeground(new java.awt.Color(51, 204, 0));
        btTT.setText("V");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(33, 33, 33)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(162, 162, 162)
                        .addComponent(btTT))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tfIdF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cbTinhTrangF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfIdF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbTinhTrangF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(btTT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(242, 242, 242));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(242, 242, 242)));
        jPanel6.setLayout(new java.awt.GridLayout(3, 1, 15, 15));

        btTimKiemF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btTimKiemF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iSearch.png"))); // NOI18N
        btTimKiemF.setText("Tìm kiếm");
        jPanel6.add(btTimKiemF);

        btNhapLaiF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNhapLaiF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iReset.png"))); // NOI18N
        btNhapLaiF.setText("Nhập lại");
        jPanel6.add(btNhapLaiF);

        btClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iClose.png"))); // NOI18N
        btClose.setText("Đóng");
        jPanel6.add(btClose);

        jPanel4.add(jPanel6, java.awt.BorderLayout.EAST);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tbMain.setAutoCreateRowSorter(true);
        tbMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbMainMousePressed(evt);
            }
        });
        tbMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbMainKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbMain);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
	}

	protected void tbMainKeyReleased(KeyEvent evt) {
		// TODO Auto-generated method stub
		this.setForm();
	}

	protected void tbMainMousePressed(MouseEvent evt) {
		// TODO Auto-generated method stub
		this.setForm();
	}

	private void setForm() {
		// TODO Auto-generated method stub
		int row = tbMain.getSelectedRow();
		int id = Integer.parseInt(tbMain.getValueAt(row, 0).toString());
		String tenMay = tbMain.getValueAt(row, 1).toString();
		cbTinhTrang.setModel(new TinhTrangComboboxModel((String) tbMain.getValueAt(row, 2)));
		Boolean trangThai = (Boolean) tbMain.getValueAt(row, 3);
		Date thoiGianBatDau = null;
		Date thoiGianKetThuc = null;
		Date thoiGianChoi = null;
		Format formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
	    try {
			thoiGianBatDau = (Date) formatter.parseObject(tbMain.getValueAt(row, 4).toString());
			spBatDau.setValue(thoiGianBatDau);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			thoiGianKetThuc = (Date) formatter.parseObject(tbMain.getValueAt(row, 5).toString());
			spKetThuc.setValue(thoiGianKetThuc);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    thoiGianChoi = LibraryString.convertToTime(Math.abs(thoiGianKetThuc.getTime() - thoiGianBatDau.getTime())/1000);
	    spChoi.setValue(thoiGianChoi);
	    String thanhTien = tbMain.getValueAt(row, 7).toString();
	    
	    tfId.setText(id+"");
	    tfTenMay.setText(tenMay);
	    if(trangThai){
			jCheckBox1.setSelected(true);
		}else{
			jCheckBox2.setSelected(true);
		}
	    String money = LibraryString.operMoney(LibraryString.convertToTime(Math.abs(thoiGianKetThuc.getTime() - thoiGianBatDau.getTime())/1000), new MayBO().getItem(new PhienNguoiDungDAO().getItem(id).getIdmay()).getDonGia())+"";
	    tfThanhTien.setText(LibraryString.changeCurrencyVND(money)+" VND");
	    new PhienNguoiDungBO().editItem(new PhienNguoiDung(id, new MayBO().getItem(new PhienNguoiDungDAO().getItem(id).getIdmay()).getIdm(), tenMay, tbMain.getValueAt(row, 2).toString(), trangThai, new Timestamp(thoiGianBatDau.getTime()), new Timestamp(thoiGianKetThuc.getTime()), new Timestamp(thoiGianChoi.getTime()).toString(), money));	    
	}

	private boolean isValid(PhienNguoiDung obj, String function) {
        boolean result = true;
        switch(function){
            case "add":
                break;
            case "edit":
                break;
            case "del":
                if(obj.getId()<0){
                    JOptionPane.showConfirmDialog(new PnUser(), "<html><p style=\"color:red; font-weight:bold;\">Bạn chưa chọn dòng để xóa!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                    result = false;
                }
                break;
        }
        return result;
    }
}
