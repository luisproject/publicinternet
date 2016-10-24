package view;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.ControllerDichVu;
import utils.render.DonViComboboxModel;

@SuppressWarnings("all")
public class PnDichVu extends JPanel {

	/**
	 * Create the panel.
	 */
	private JSplitPane dv;
	
	private JPanel dvleft;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JTextField tfId;
	private JTextField tfName;
	private JPanel dvsearch;
	private JLabel jLabel3;
	private JTextField tfNameF;
	private JPanel jPanel1;
	private JButton jButton1;
	private JButton jButton2;
	private JLabel jLabel4;
	private JPanel jPanel2;
	private JButton btnThem;
	private JButton btnSua;
	private JButton btnNhaplai;
	private JButton btnXoa;
	private JSpinner spDongia;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JSpinner spSoluong;
	private JComboBox<String> cbDonvi;
	
	private JPanel dvright;
	private JScrollPane jScrollPane1;
	private JTable tbMain;
	
	private ControllerDichVu controller;
    
	public PnDichVu() {
		initComponents();
		controller = new ControllerDichVu(tbMain);
        controller.loadTable();
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		dv = new JSplitPane();
        dvleft = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        tfId = new JTextField();
        tfName = new JTextField();
        dvsearch = new JPanel();
        jLabel3 = new JLabel();
        tfNameF = new JTextField();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel4 = new JLabel();
        jPanel2 = new JPanel();
        btnThem = new JButton();
        btnSua = new JButton();
        btnNhaplai = new JButton();
        btnXoa = new JButton();
        spDongia = new JSpinner();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        spSoluong = new JSpinner();
        cbDonvi = new JComboBox<>();
        dvright = new JPanel();
        jScrollPane1 = new JScrollPane();
        tbMain = new JTable();
        
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setLayout(new java.awt.BorderLayout());

        dv.setBackground(new java.awt.Color(242, 242, 242));
        dv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dv.setOneTouchExpandable(true);

        dvleft.setBackground(new java.awt.Color(242, 242, 242));
        dvleft.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin chi tiết dịch vụ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("STT:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tên dịch vụ:");

        tfId.setEditable(false);
        tfId.setPreferredSize(new java.awt.Dimension(59, 24));

        tfName.setPreferredSize(new java.awt.Dimension(59, 24));

        dvsearch.setBackground(new java.awt.Color(242, 242, 242));
        dvsearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên dịch vụ:");

        tfNameF.setPreferredSize(new java.awt.Dimension(59, 24));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iSearch.png"))); // NOI18N
        jButton1.setText("Tìm kiếm");
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iReset.png"))); // NOI18N
        jButton2.setText("Nhập lại");
        jPanel1.add(jButton2);

        javax.swing.GroupLayout dvsearchLayout = new javax.swing.GroupLayout(dvsearch);
        dvsearch.setLayout(dvsearchLayout);
        dvsearchLayout.setHorizontalGroup(
            dvsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dvsearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfNameF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dvsearchLayout.setVerticalGroup(
            dvsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dvsearchLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(dvsearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Đơn giá:");

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.gif"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem);

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-icon.gif"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSua);

        btnNhaplai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNhaplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.gif"))); // NOI18N
        btnNhaplai.setText("Nhập lại");
        btnNhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaplaiActionPerformed(evt);
            }
        });
        jPanel2.add(btnNhaplai);

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.gif"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoa);

        spDongia.setPreferredSize(new java.awt.Dimension(29, 24));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Đơn vị:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Số lượng:");

        spSoluong.setPreferredSize(new java.awt.Dimension(29, 24));

        cbDonvi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDonvi.setPreferredSize(new java.awt.Dimension(56, 24));

        javax.swing.GroupLayout dvleftLayout = new javax.swing.GroupLayout(dvleft);
        dvleft.setLayout(dvleftLayout);
        dvleftLayout.setHorizontalGroup(
            dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dvsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dvleftLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dvleftLayout.createSequentialGroup()
                        .addGroup(dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dvleftLayout.createSequentialGroup()
                                .addComponent(tfId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(100, 100, 100))
                            .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spDongia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(dvleftLayout.createSequentialGroup()
                        .addGroup(dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spSoluong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbDonvi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        dvleftLayout.setVerticalGroup(
            dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dvleftLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spDongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbDonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(dvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(dvsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dv.setLeftComponent(dvleft);

        dvright.setBackground(new java.awt.Color(242, 242, 242));
        dvright.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh sách các dịch vụ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        dvright.setLayout(new java.awt.BorderLayout());

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

        dvright.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        dv.setRightComponent(dvright);

        add(dv, java.awt.BorderLayout.CENTER);
	}

	protected void btnThemActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void btnSuaActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void btnNhaplaiActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void btnXoaActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
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
        String tenDichVu = tbMain.getValueAt(row, 1).toString();        
        int donGia = Integer.parseInt(tbMain.getValueAt(row, 2).toString());
        String donVi = tbMain.getValueAt(row, 3).toString();
        int soLuong = Integer.parseInt(tbMain.getValueAt(row, 4).toString());
        
        
        tfId.setText(String.valueOf(id));
        tfName.setText(tenDichVu);
        spDongia.setValue(donGia);
        cbDonvi.setModel(new DonViComboboxModel((String)tbMain.getValueAt(row, 3)));
        spSoluong.setValue(soLuong);
	}
}
