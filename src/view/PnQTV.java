package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;

import controller.ControllerQuanTriVien;
import model.bean.QuanTriVien;
import utils.ButtonGroupAdmin;
import utils.ValidateDbQTV;

@SuppressWarnings("all")
public class PnQTV extends JPanel {

	/**
	 * Create the panel.
	 */
	// Control + 7 => Structure Code Following Application
	private JSplitPane qtv;
	// Left
	private JPanel qtvleft;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel4;
	private JLabel jLabel6;
	
	private JTextField tfId;
	private JTextField tfUser;
	private JTextField tfPass;
	private JTextField tfName;
	
	private JPanel qtvsearch;
	private JLabel jLabel3;
	private JTextField tfUserF;
	
	private JPanel qtvsearchbtn;
	private JButton btTimKiemF;
	private JButton btNhapLaiF;
		
	private JPanel qtvcheckbox;
	private JButton btThem;
	private JButton btSua;
	private JButton btNhaplai;
	private JButton btXoa;
	
	private JLabel jLabel5;
	private JCheckBox jCheckBox1;
	private JCheckBox jCheckBox2;
	
	private JPanel qtvright;
	private JScrollPane jScrollPane1;
	private JTable tbMain;
	
	private ButtonGroup btnAdmin;
	private ControllerQuanTriVien controller;
	
	public PnQTV() {
		initComponents();
		controller = new ControllerQuanTriVien(tbMain);
		controller.loadTable();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		btnAdmin = new javax.swing.ButtonGroup();
        qtv = new javax.swing.JSplitPane();
        qtvleft = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfUser = new javax.swing.JTextField();
        tfPass = new javax.swing.JTextField();
        qtvsearch = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfUserF = new javax.swing.JTextField();
        qtvsearchbtn = new javax.swing.JPanel();
        btTimKiemF = new javax.swing.JButton();
        btNhapLaiF = new javax.swing.JButton();
        qtvcheckbox = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btNhaplai = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        qtvright = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMain = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setLayout(new java.awt.BorderLayout());

        qtv.setBackground(new java.awt.Color(242, 242, 242));
        qtv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        qtv.setOneTouchExpandable(true);

        qtvleft.setBackground(new java.awt.Color(242, 242, 242));
        qtvleft.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin quản trị viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(33,65,90))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("STT:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tên đăng nhập:(*)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Mật khẩu:(*)");

        tfId.setEditable(false);
        tfId.setPreferredSize(new java.awt.Dimension(59, 24));

        tfUser.setPreferredSize(new java.awt.Dimension(59, 24));

        tfPass.setPreferredSize(new java.awt.Dimension(59, 24));

        qtvsearch.setBackground(new java.awt.Color(242, 242, 242));
        qtvsearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên Đăng Nhập:");

        tfUserF.setPreferredSize(new java.awt.Dimension(59, 24));

        qtvsearchbtn.setBackground(new java.awt.Color(242, 242, 242));

        btTimKiemF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btTimKiemF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iSearch.png"))); // NOI18N
        btTimKiemF.setText("Tìm kiếm");
        btTimKiemF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemFActionPerformed(evt);
            }
        });
        qtvsearchbtn.add(btTimKiemF);

        btNhapLaiF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNhapLaiF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iReset.png"))); // NOI18N
        btNhapLaiF.setText("Nhập lại");
        btNhapLaiF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhapLaiFActionPerformed(evt);
            }
        });
        qtvsearchbtn.add(btNhapLaiF);

        javax.swing.GroupLayout qtvsearchLayout = new javax.swing.GroupLayout(qtvsearch);
        qtvsearch.setLayout(qtvsearchLayout);
        qtvsearchLayout.setHorizontalGroup(
            qtvsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qtvsearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfUserF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
            .addComponent(qtvsearchbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        qtvsearchLayout.setVerticalGroup(
            qtvsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qtvsearchLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(qtvsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfUserF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(qtvsearchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.gif"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        qtvcheckbox.add(btThem);

        btSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-icon.gif"))); // NOI18N
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });
        qtvcheckbox.add(btSua);

        btNhaplai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNhaplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.gif"))); // NOI18N
        btNhaplai.setText("Nhập lại");
        btNhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhaplaiActionPerformed(evt);
            }
        });
        qtvcheckbox.add(btNhaplai);

        btXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.gif"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        qtvcheckbox.add(btXoa);
        

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Admin:(*)");

        btnAdmin.add(jCheckBox1);
        jCheckBox1.setText("Không");

        btnAdmin.add(jCheckBox2);
        jCheckBox2.setText("Có");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Họ và tên:");

        tfName.setPreferredSize(new java.awt.Dimension(59, 24));

        javax.swing.GroupLayout qtvleftLayout = new javax.swing.GroupLayout(qtvleft);
        qtvleft.setLayout(qtvleftLayout);
        qtvleftLayout.setHorizontalGroup(
            qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qtvsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(qtvcheckbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(qtvleftLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(qtvleftLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(76, 76, 76)
                        .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(qtvleftLayout.createSequentialGroup()
                        .addGroup(qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, qtvleftLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jCheckBox2)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(qtvleftLayout.createSequentialGroup()
                                .addGroup(qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(qtvleftLayout.createSequentialGroup()
                                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))))
        );
        qtvleftLayout.setVerticalGroup(
            qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qtvleftLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(qtvleftLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, qtvleftLayout.createSequentialGroup()
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel5))
                .addGap(17, 17, 17)
                .addComponent(qtvcheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(qtvsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        qtv.setLeftComponent(qtvleft);

        qtvright.setBackground(new java.awt.Color(242, 242, 242));
        qtvright.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh sách quản trị viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(33,65,90))); // NOI18N
        qtvright.setLayout(new java.awt.BorderLayout());

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

        qtvright.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        qtv.setRightComponent(qtvright);

        add(qtv, java.awt.BorderLayout.CENTER);
		
	}

	protected void btThemActionPerformed(ActionEvent evt) {
    	try{
            String tenDangNhap = tfUser.getText();
            String matKhau = tfPass.getText();
            String hoTen = tfName.getText();
            Boolean isAdmin = new ButtonGroupAdmin().isSelect(btnAdmin);
            QuanTriVien obj  = new QuanTriVien(0, tenDangNhap, matKhau, hoTen, isAdmin);
            if(isValid(obj, "add")){
                if(!new ValidateDbQTV().tenDangNhap_exist(tenDangNhap)){
                    int result = controller.addItem(obj);
                    if(result > 0){
                        this.ResetForm();
                        JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:blue; font-weight:bold;\">Thêm quản trị viên thành công!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                    }else{
                        JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Thêm quản trị viên  thất bại!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Quản trị viên tồn tại trong hệ thống!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Vui lòng nhập thông tin vào trường!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
        }	
	}
	protected void btSuaActionPerformed(ActionEvent evt) {
		 int row = tbMain.getSelectedRow();
	        if(row >= 0){
	            try{
	              int idqtv = Integer.parseInt(tfId.getText());
	              String tenDangNhap = tfUser.getText();
	              String matKhau = tfPass.getText();
	              String hoTen = tfName.getText();
	              Boolean isAdmin = new ButtonGroupAdmin().isSelect(btnAdmin);
	              QuanTriVien obj  = new QuanTriVien(idqtv, tenDangNhap, matKhau, hoTen, isAdmin);
					if(isValid(obj, "edit")){
					    if(!new ValidateDbQTV().tenDangNhap_existver(obj.getTenDangNhap(),idqtv)){
					        int result = controller.editItem(obj,row);
					        if(result > 0){
					            this.ResetForm();
					            JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:blue; font-weight:bold;\">Cập nhật quản trị viên thành công!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
					        }else{
					            JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Cập nhật quản trị viên thất bại!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
					        }
					    }else{
					        JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Quản trị viên tồn tại trong hệ thống!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
					    }
					}
	            }catch(NumberFormatException ex){
	                JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Vui lòng nhập thông tin vào trường trống!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
	            }
	        }else{
	            JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Bạn chưa chọn dòng để cập nhật!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
	        }		
	}

	protected void btNhaplaiActionPerformed(ActionEvent evt) {
		ResetForm();
	}

	protected void btXoaActionPerformed(ActionEvent evt) {
		int row = tbMain.getSelectedRow();
        if(row >= 0){
            // When i delete new from table, way to good to delete get id from textfield
            int id = Integer.parseInt(tfId.getText());
            if(controller.delItem(id,row)>0){
                JOptionPane.showMessageDialog(new PnQTV(), "<html><p style=\"color:blue; font-weight:bold;\">Xóa quản trị viên thành công!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Xóa quản trị viên thất bại!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Bạn chưa chọn dòng để xóa!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
	}
	
    protected void btTimKiemFActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
    	TableRowSorter sorter = new TableRowSorter(tbMain.getModel());
    	tbMain.setRowSorter(sorter);
    	
    	ArrayList<RowFilter<AbstractTableModel,Object>> alFilter = new ArrayList<>();
    	
        String tenDangNhap = tfUserF.getText();
        RowFilter<AbstractTableModel,Object> filterUser = RowFilter.regexFilter(tenDangNhap, 1);
        alFilter.add(filterUser);
        
        RowFilter<AbstractTableModel,Object> filterAnd = RowFilter.andFilter(alFilter);
        sorter.setRowFilter(filterAnd);
	}

	protected void btNhapLaiFActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		controller.loadTable();
	}
	
	protected void tbMainMousePressed(MouseEvent evt) {
		this.setForm();
	}

	
	protected void tbMainKeyReleased(KeyEvent evt) {
		this.setForm();
	}
	private void ResetForm(){
		tfId.setText("");
		tfUser.setText("");
		tfPass.setText("");
		tfName.setText("");
	}
	private void setForm() {
		// TODO Auto-generated method stub
		int row = tbMain.getSelectedRow();
		int id = Integer.parseInt(tbMain.getValueAt(row, 0).toString());
		String tenDangNhap = tbMain.getValueAt(row, 1).toString();
		String hoTen = tbMain.getValueAt(row, 2).toString();
	    Boolean isAdmin = (Boolean) tbMain.getValueAt(row, 3);
		
		tfId.setText(id+"");
		tfUser.setText(tenDangNhap);
		
		tfName.setText(hoTen);
		if (isAdmin) {
			jCheckBox2.setSelected(true);
		}else {
			jCheckBox1.setSelected(true);
		}	
	}


	
	 private boolean isValid(QuanTriVien obj, String function) {
	        boolean result = true;
	        switch(function){
	            case "add":
	                break;
	            case "edit":
	                break;
	            case "del":
	                if(obj.getIdqtv()<0){
	                    JOptionPane.showConfirmDialog(new PnUser(), "<html><p style=\"color:red; font-weight:bold;\">Bạn chưa chọn dòng để xóa!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
	                    result = false;
	                }
	                break;
	        }
	        return result;
	    }
	
}
