package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;

import controller.ControllerMay;
import model.bean.May;
import utils.ButtonGroupTT;
import utils.ValidateDbMay;
import utils.render.TinhTrangComboboxModel;

@SuppressWarnings("all")
public class PnMay extends JPanel {

	/**
	 * Create the panel.
	 */
	
	// Control + 7 => Structure Code Following Application
	private JSplitPane jSplitPane1;
	// Left
	private JPanel mayleft;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel7;
	
	private JTextField tfName;
	private JTextField tfId;
	private JComboBox<String> cbTinhTrang;
	private JScrollPane jScrollPane2;
	private JTextArea txtGhiChu;
	
	private JPanel jPanel6;
	private JButton btnThem;
	private JButton btnSua;
	private JButton btnNhaplai;
	private JButton btnXoa;
	private JCheckBox jCheckBox1;
	private JCheckBox jCheckBox2;
	private JTextField tfDongia;
	
	private JPanel mayright;
	private JPanel jPanel1;
	private JPanel jPanel3;
	
	private JPanel jPanel4;
	private JLabel jLabel8;
	private JTextField tfIdF;
	private JLabel jLabel9;
	private JTextField tfNameF;
	private JLabel jLabel10;
	private JLabel jLabel12;
	private JComboBox<String> cbTinhTrangF;
	private JLabel jLabel13;
	private JTextField tfDongiaF;
	private JCheckBox jCheckBox3;
	private JCheckBox jCheckBox4;
	private JButton btTT;
	
	private JPanel jPanel5;
	private JButton btnbtnbtnbtnTimKiemF;
	private JButton btnbtnbtnNhapLaiF;
	private JButton btnbtnCloseF;
	
	private JPanel jPanel2;
	private JScrollPane jScrollPane1;
	private JTable tbMain;
	
	private ButtonGroup btTrangThai;
	private ButtonGroup btTrangThaiF;
	
	private ControllerMay controller;
	
	public PnMay() {
		initComponents();
		controller = new ControllerMay(tbMain);
		controller.loadTable();
		cbTinhTrang.setModel(new TinhTrangComboboxModel());
		cbTinhTrangF.setModel(new TinhTrangComboboxModel());
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		btTrangThai = new ButtonGroup();
		btTrangThaiF = new ButtonGroup();
        jSplitPane1 = new JSplitPane();
        mayleft = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel7 = new JLabel();
        tfName = new JTextField();
        tfId = new JTextField();
        cbTinhTrang = new JComboBox<>();
        jScrollPane2 = new JScrollPane();
        txtGhiChu = new JTextArea();
        jPanel6 = new JPanel();
        btnThem = new JButton();
        btnSua = new JButton();
        btnNhaplai = new JButton();
        btnXoa = new JButton();
        jCheckBox1 = new JCheckBox();
        jCheckBox2 = new JCheckBox();
        tfDongia = new JTextField();
        mayright = new JPanel();
        jPanel1 = new JPanel();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        jLabel8 = new JLabel();
        tfIdF = new JTextField();
        jLabel9 = new JLabel();
        tfNameF = new JTextField();
        jLabel10 = new JLabel();
        jLabel12 = new JLabel();
        cbTinhTrangF = new JComboBox<>();
        jLabel13 = new JLabel();
        tfDongiaF = new JTextField();
        jCheckBox3 = new JCheckBox();
        jCheckBox4 = new JCheckBox();
        btTT = new JButton();
        jPanel5 = new JPanel();
        btnbtnbtnbtnTimKiemF = new JButton();
        btnbtnbtnNhapLaiF = new JButton();
        btnbtnCloseF = new JButton();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        tbMain = new JTable();
        
        setBackground(new java.awt.Color(242, 242, 242));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(242, 242, 242));
        jSplitPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSplitPane1.setDividerSize(6);
        jSplitPane1.setForeground(new java.awt.Color(0, 102, 255));
        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane1.setOneTouchExpandable(true);

        mayleft.setBackground(new java.awt.Color(242, 242, 242));
        mayleft.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin chi tiết máy", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(33,65,90))); // NOI18N
        mayleft.setMinimumSize(new java.awt.Dimension(325, 478));
        mayleft.setPreferredSize(new java.awt.Dimension(500, 538));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Số thứ tự:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Trạng thái:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên máy:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tình trạng:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Đơn giá:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Ghi chú:");

        tfName.setPreferredSize(new java.awt.Dimension(59, 24));

        tfId.setEditable(false);
        tfId.setPreferredSize(new java.awt.Dimension(59, 24));

        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTinhTrang.setPreferredSize(new java.awt.Dimension(56, 24));

        txtGhiChu.setColumns(20);
        txtGhiChu.setLineWrap(true);
        txtGhiChu.setRows(5);
        txtGhiChu.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtGhiChu);

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.gif"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel6.add(btnThem);

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-icon.gif"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel6.add(btnSua);

        btnNhaplai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNhaplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.gif"))); // NOI18N
        btnNhaplai.setText("Nhập lại");
        btnNhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaplaiActionPerformed(evt);
            }
        });
        jPanel6.add(btnNhaplai);

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.gif"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel6.add(btnXoa);

        btTrangThai.add(jCheckBox1);
        jCheckBox1.setText("ON");

        btTrangThai.add(jCheckBox2);
        jCheckBox2.setText("OFF");

        tfDongia.setPreferredSize(new java.awt.Dimension(59, 24));

        javax.swing.GroupLayout mayleftLayout = new javax.swing.GroupLayout(mayleft);
        mayleft.setLayout(mayleftLayout);
        mayleftLayout.setHorizontalGroup(
            mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mayleftLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)))
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mayleftLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mayleftLayout.createSequentialGroup()
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mayleftLayout.createSequentialGroup()
                                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfDongia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbTinhTrang, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46))))
                    .addGroup(mayleftLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jCheckBox1)
                        .addGap(35, 35, 35)
                        .addComponent(jCheckBox2)
                        .addContainerGap())))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mayleftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(46, 46, 46))
        );
        mayleftLayout.setVerticalGroup(
            mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mayleftLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(17, 17, 17)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(mayleft);

        mayright.setBackground(new java.awt.Color(242, 242, 242));
        mayright.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh sách máy", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(33,65,90))); // NOI18N
        mayright.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(242, 242, 242));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("STT:");

        tfIdF.setPreferredSize(new java.awt.Dimension(59, 24));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Tên máy:");

        tfNameF.setPreferredSize(new java.awt.Dimension(59, 24));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Tình trạng:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Trạng thái:");

        cbTinhTrangF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", " " }));
        cbTinhTrangF.setPreferredSize(new java.awt.Dimension(56, 24));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Đơn giá:");

        tfDongiaF.setPreferredSize(new java.awt.Dimension(59, 24));

        btTrangThaiF.add(jCheckBox3);
        jCheckBox3.setText("ON");

        btTrangThaiF.add(jCheckBox4);
        jCheckBox4.setText("OFF");

        btTT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btTT.setForeground(new java.awt.Color(51, 255, 0));
        btTT.setText("V");
        btTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tfIdF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9)
                                .addGap(132, 132, 132))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbTinhTrangF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDongiaF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tfNameF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jCheckBox3)
                        .addGap(29, 29, 29)
                        .addComponent(jCheckBox4)
                        .addGap(389, 389, 389)
                        .addComponent(btTT)))
                .addGap(9, 9, 9))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfIdF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfNameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbTinhTrangF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(tfDongiaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(btTT))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(242, 242, 242));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(242, 242, 242)));
        jPanel5.setLayout(new java.awt.GridLayout(3, 1, 15, 15));

        btnbtnbtnbtnTimKiemF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbtnbtnbtnTimKiemF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iSearch.png"))); // NOI18N
        btnbtnbtnbtnTimKiemF.setText("Tìm kiếm ");
        btnbtnbtnbtnTimKiemF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemFActionPerformed(evt);
            }
        });
        jPanel5.add(btnbtnbtnbtnTimKiemF);

        btnbtnbtnNhapLaiF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbtnbtnNhapLaiF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iReset.png"))); // NOI18N
        btnbtnbtnNhapLaiF.setText("Nhập lại");
        btnbtnbtnNhapLaiF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapLaiFActionPerformed(evt);
            }
        });
        jPanel5.add(btnbtnbtnNhapLaiF);

        btnbtnCloseF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbtnCloseF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iClose.png"))); // NOI18N
        btnbtnCloseF.setText("Đóng");
        btnbtnCloseF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseFActionPerformed(evt);
            }
        });
        jPanel5.add(btnbtnCloseF);

        jPanel3.add(jPanel5, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        mayright.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tbMain.setAutoCreateRowSorter(true);
        tbMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        mayright.add(jPanel2, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(mayright);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
	}

	protected void btnThemActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		try{
            String tenMay = tfName.getText();
            String tinhTrang = (String) new TinhTrangComboboxModel().getElementAt(cbTinhTrang.getSelectedIndex());
            Boolean trangThai = new ButtonGroupTT().isSelected(btTrangThai);
            String moTa = txtGhiChu.getText();
            int donGia = Integer.parseInt(tfDongia.getText());
            May obj = new May(0, tenMay, tinhTrang, trangThai, moTa, donGia);
            if(isValid(obj, "add")){
                if(!new ValidateDbMay().tenmay_exist(obj.getTenMay())){
                    int result = controller.addItem(obj);
                    if(result > 0){
                        this.resetForm();
                        JOptionPane.showConfirmDialog(new PnMay(), "<html><p style=\"color:blue; font-weight:bold;\">Thêm máy thành công!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                    }else{
                        JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Thêm máy thất bại!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showConfirmDialog(new PnQTV(), "<html><p style=\"color:red; font-weight:bold;\">Tên máy tồn tại trong hệ thống!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(new PnUser(), "<html><p style=\"color:red; font-weight:bold;\">Vui lòng nhập thông tin vào trường!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
	}

	protected void btnSuaActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		int row = tbMain.getSelectedRow();
        if(row >= 0){
            try{
                int idm = Integer.parseInt(tfId.getText());
            	String tenMay = tfName.getText();
            	String tinhTrang = (String) new TinhTrangComboboxModel().getElementAt(cbTinhTrang.getSelectedIndex());
                Boolean trangThai = new ButtonGroupTT().isSelected(btTrangThai);
                String moTa = txtGhiChu.getText();
                int donGia = Integer.parseInt(tfDongia.getText());
                May obj = new May(idm, tenMay, tinhTrang, trangThai, moTa, donGia);
                
                if(isValid(obj, "edit")){
                    if(!new ValidateDbMay().tenmay_existver(obj.getTenMay(),idm)){
                        int result = controller.editItem(obj,row);
                        if(result > 0){
                            this.resetForm();
                            JOptionPane.showConfirmDialog(new PnMay(), "<html><p style=\"color:blue; font-weight:bold;\">Cập nhật máy thành công!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                        }else{
                            JOptionPane.showConfirmDialog(new PnMay(), "<html><p style=\"color:red; font-weight:bold;\">Cập nhật máy thất bại!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                        }
                    }else{
                        JOptionPane.showConfirmDialog(new PnMay(), "<html><p style=\"color:red; font-weight:bold;\">Tên máy tồn tại trong hệ thống!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                    }
                }
            }catch(NumberFormatException ex){
                JOptionPane.showConfirmDialog(new PnMay(), "<html><p style=\"color:red; font-weight:bold;\">Vui lòng nhập thông tin vào trường trống!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showConfirmDialog(new PnMay(), "<html><p style=\"color:red; font-weight:bold;\">Bạn chưa chọn dòng để cập nhật!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
	}

	protected void btnNhaplaiActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		resetForm();
	}

	protected void btnXoaActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		int row = tbMain.getSelectedRow();
        if(row >= 0){
            // When i delete new from table, way to good to delete get id from textfield
            int id = Integer.parseInt(tfId.getText());
            if(controller.delItem(id,row)>0){
                JOptionPane.showMessageDialog(new PnMay(), "<html><p style=\"color:blue; font-weight:bold;\">Xóa máy thành công!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(new PnMay(), "<html><p style=\"color:red; font-weight:bold;\">Xóa máy thất bại!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(new PnMay(), "<html><p style=\"color:red; font-weight:bold;\">Bạn chưa chọn dòng để xóa!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
	}

	protected void btnTimKiemFActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		TableRowSorter sorter = new TableRowSorter(tbMain.getModel());
    	tbMain.setRowSorter(sorter);
    	
    	ArrayList<RowFilter<AbstractTableModel,Object>> alFilter = new ArrayList<>();
    	
        String id = tfIdF.getText();
        RowFilter<AbstractTableModel,Object> filterID = RowFilter.regexFilter(id, 0);
        alFilter.add(filterID);
        
        String tenMay = tfNameF.getText();
        RowFilter<AbstractTableModel,Object> filterName = RowFilter.regexFilter(tenMay, 1);
        alFilter.add(filterName);
        
        String donGia = tfDongiaF.getText();
        RowFilter<AbstractTableModel,Object> filterDonGia = RowFilter.regexFilter(donGia, 5);
        alFilter.add(filterDonGia);
        
        String tinhTrang = (String) new TinhTrangComboboxModel().getElementAt(cbTinhTrangF.getSelectedIndex());
        if(!tinhTrang.isEmpty()){
            RowFilter<AbstractTableModel,Object> filterTT = new RowFilter<AbstractTableModel, Object>() {
                @Override
                public boolean include(RowFilter.Entry<? extends AbstractTableModel, ? extends Object> entry) {
                    return tinhTrang.equals(String.valueOf(entry.getValue(2)));
                }
            };
            alFilter.add(filterTT);
        }
        
        if(!"X".equals(btTT.getText())){
            Boolean active = new ButtonGroupTT().isSelected(btTrangThaiF);
            RowFilter<AbstractTableModel,Object> filterTT = new RowFilter<AbstractTableModel, Object>() {
            @Override
            public boolean include(RowFilter.Entry<? extends AbstractTableModel, ? extends Object> entry) {
                    /** Đi sâu vào RowFilter **/
                    if(active==(boolean)entry.getValue(3)){
                        return true;
                    }
                    return false; 
                }
            };
            alFilter.add(filterTT);
        }
        
        RowFilter<AbstractTableModel,Object> filterAnd = RowFilter.andFilter(alFilter);
        sorter.setRowFilter(filterAnd);  
	}

	protected void btnCloseFActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		jPanel3.setVisible(false);
	}

	protected void btnNhapLaiFActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		controller.loadTable();
	}

	protected void tbMainKeyReleased(KeyEvent evt) {
		// TODO Auto-generated method stub
		this.setForm();
	}	

	protected void tbMainMousePressed(MouseEvent evt) {
		// TODO Auto-generated method stub
		this.setForm();
		
	}
	
	protected void btTTActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		if("V".equals(btTT.getText())){
            btTT.setText("X");
            btTT.setForeground(Color.RED);
            jCheckBox3.setEnabled(false);
            jCheckBox4.setEnabled(false);
        }else{
            btTT.setText("V");
            btTT.setForeground(Color.GREEN);
            jCheckBox3.setEnabled(true);
            jCheckBox4.setEnabled(true);
        }
	}
	
	private void setForm() {
		// TODO Auto-generated method stub
		int row = tbMain.getSelectedRow();
		int id = Integer.parseInt(tbMain.getValueAt(row, 0).toString());
		String tenMay = tbMain.getValueAt(row, 1).toString();
		cbTinhTrang.setModel(new TinhTrangComboboxModel((String) tbMain.getValueAt(row, 2)));
		Boolean trangThai = (Boolean) tbMain.getValueAt(row, 3);
		String moTa = tbMain.getValueAt(row, 4).toString();
		int donGia = Integer.parseInt(tbMain.getValueAt(row, 5).toString());
		
		tfId.setText(id+"");
		tfName.setText(tenMay);
		if(trangThai){
			jCheckBox1.setSelected(true);
		}else{
			jCheckBox2.setSelected(true);
		}
		
		txtGhiChu.setText(moTa);
		tfDongia.setText(donGia+"");
	}
	private void resetForm(){
		tfId.setText("");
		tfName.setText("");
		jCheckBox1.setSelected(true);
		jCheckBox1.setSelected(false);
		txtGhiChu.setText("");
		tfDongia.setText("");
		cbTinhTrang.setModel(new TinhTrangComboboxModel());
	}
	
	private boolean isValid(May obj, String function) {
        boolean result = true;
        switch(function){
            case "add":
                break;
            case "edit":
                break;
            case "del":
                if(obj.getIdm()<0){
                    JOptionPane.showConfirmDialog(new PnMay(), "<html><p style=\"color:red; font-weight:bold;\">Bạn chưa chọn dòng để xóa!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
                    result = false;
                }
                break;
        }
        return result;
    }
}
