package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;

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
	private JTextField tfId;
	private JTextField tfUser;
	private JTextField tfPass;
	
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
	
	public PnQTV() {
		btnAdmin = new ButtonGroup();
        qtv = new JSplitPane();
        qtvleft = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        tfId = new JTextField();
        tfUser = new JTextField();
        tfPass = new JTextField();
        qtvsearch = new JPanel();
        jLabel3 = new JLabel();
        tfUserF = new JTextField();
        qtvsearchbtn = new JPanel();
        btTimKiemF = new JButton();
        btNhapLaiF = new JButton();
        qtvcheckbox = new JPanel();
        btThem = new JButton();
        btSua = new JButton();
        btNhaplai = new JButton();
        btXoa = new JButton();
        jLabel5 = new JLabel();
        jCheckBox1 = new JCheckBox();
        jCheckBox2 = new JCheckBox();
        qtvright = new JPanel();
        jScrollPane1 = new JScrollPane();
        tbMain = new JTable();
        
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setLayout(new java.awt.BorderLayout());

        qtv.setBackground(new java.awt.Color(242, 242, 242));
        qtv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        qtv.setOneTouchExpandable(true);

        qtvleft.setBackground(new java.awt.Color(242, 242, 242));
        qtvleft.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin quản trị viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

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
        jLabel3.setText("Ten Dang Nhap:");

        tfUserF.setPreferredSize(new java.awt.Dimension(59, 24));

        qtvsearchbtn.setBackground(new java.awt.Color(242, 242, 242));

        btTimKiemF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btTimKiemF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iSearch.png"))); // NOI18N
        btTimKiemF.setText("Tìm kiếm");
        qtvsearchbtn.add(btTimKiemF);

        btNhapLaiF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNhapLaiF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iReset.png"))); // NOI18N
        btNhapLaiF.setText("Nhập lại");
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

        javax.swing.GroupLayout qtvleftLayout = new javax.swing.GroupLayout(qtvleft);
        qtvleft.setLayout(qtvleftLayout);
        qtvleftLayout.setHorizontalGroup(
            qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qtvsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(qtvleftLayout.createSequentialGroup()
                .addGap(36, 36, 36)
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
                        .addContainerGap())))
            .addComponent(qtvcheckbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(qtvleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1))
                .addGap(17, 17, 17)
                .addComponent(qtvcheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(qtvsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        qtv.setLeftComponent(qtvleft);

        qtvright.setBackground(new java.awt.Color(242, 242, 242));
        qtvright.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh sách quản trị viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
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

	protected void btSuaActionPerformed(ActionEvent evt) {
		
		
	}

	protected void btNhaplaiActionPerformed(ActionEvent evt) {
		
		
	}

	protected void btXoaActionPerformed(ActionEvent evt) {
		
		
	}

	protected void tbMainMousePressed(MouseEvent evt) {
		
		
	}

	protected void tbMainKeyReleased(KeyEvent evt) {
		
		
	}

	protected void btThemActionPerformed(ActionEvent evt) {
		
	}

}