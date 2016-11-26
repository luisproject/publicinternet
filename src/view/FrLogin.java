package view;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import model.bean.Member;
import model.bo.QuanTriVienBO;
import utils.MessageBundle;

@SuppressWarnings("all")
public class FrLogin extends JFrame{
	private JPanel jPanel1;
	
	private JPanel jPanel3;
	private JLabel jLabel1;
	private JLabel jLabel2;
	
	private JPanel jPanel4;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	
	private JPanel jPanel2;
	
	private JTextField tfUser;
	private JPasswordField tfPass;
	private JButton btnLogin;
	private JButton btnCancel;
	
	private JLabel jLabel7;
	private JFrame demo;
	private int lastX,lastY;
	private QuanTriVienBO qtvBO;
	private FrInitial frInitial;
	
	public FrLogin(FrInitial frInitial){
		initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        tfPass.setEchoChar('•');
        tfUser.requestFocus();
        demo = this;
        this.frInitial = frInitial;
        qtvBO = new QuanTriVienBO();
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                lastX = e.getXOnScreen();
                lastY = e.getYOnScreen();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                demo.setLocation(getLocationOnScreen().x + x - lastX, getLocationOnScreen().y + y - lastY);
                lastX = x;
                lastY = y;
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                
            }
        });
        tfUser.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                tfUser.setText("");
                //
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        tfPass.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                tfPass.setText("");
                //
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
    }

	private void initComponents() {
		// TODO Auto-generated method stub
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jPanel4 = new JPanel();
        jLabel6 = new JLabel();
        jLabel5 = new JLabel();
        jLabel4 = new JLabel();
        jPanel1 = new JPanel();
        tfUser = new JTextField();
        tfPass = new JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new JButton();
        jLabel7 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jPanel3.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Đăng nhập");
        jPanel3.add(jLabel2);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel4.add(jLabel6);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maximize.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel4.add(jLabel5);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closemize.png"))); // NOI18N
        jPanel4.add(jLabel4);

        jPanel2.add(jPanel4);

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        tfUser.setBorder(null);
        tfUser.setPreferredSize(new java.awt.Dimension(59, 24));

        tfPass.setBorder(null);
        tfPass.setPreferredSize(new java.awt.Dimension(111, 24));

        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setContentAreaFilled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginClient.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel7)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jLabel7)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
	}

	protected void btnLoginActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String tenDangNhap = tfUser.getText();
        if(tenDangNhap.isEmpty()){
        	JOptionPane.showConfirmDialog(new FrLogin(this.frInitial), "<html><p style=\"color:red; font-weight:bold;\">Tên đăng nhập không được bỏ trống!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
        	return;
        }else{	
        	if(!MessageBundle.isUsername(tenDangNhap)){
            	if(tenDangNhap.length() < 3 || tenDangNhap.length() > 13){
            		if(tenDangNhap.length() < 3){
            			JOptionPane.showConfirmDialog(new FrLogin(this.frInitial), "<html><p style=\"color:red; font-weight:bold;\">Tên đăng nhập quá ngắn(>= 6)!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
            		}
            		if(tenDangNhap.length() > 13){
            			JOptionPane.showConfirmDialog(new FrLogin(this.frInitial), "<html><p style=\"color:red; font-weight:bold;\">Tên đăng nhập quá dài(<= 20)!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
            		}
            		return;
            	}
            	JOptionPane.showConfirmDialog(new FrLogin(this.frInitial), "<html><p style=\"color:red; font-weight:bold;\">Không chứa ký tự đặc biệt!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
            	return;
            }
        }
        
        String matKhau = String.valueOf(tfPass.getPassword());
        if(matKhau.isEmpty()){
        	JOptionPane.showConfirmDialog(new FrLogin(this.frInitial), "<html><p style=\"color:red; font-weight:bold;\">Mật khẩu không được bỏ trống!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
        	return;
        }
        if(qtvBO.getItemByUser(tenDangNhap)){
        	FrMain frMain = new FrMain(tenDangNhap);
        	frMain.setLocation(getLocation());
        	frMain.setVisible(true);
        	this.frInitial.setVisible(false);
        	this.dispose();
        }else{
        	JOptionPane.showConfirmDialog(new FrLogin(this.frInitial), "<html><p style=\"color:red; font-weight:bold;\">Tên đăng nhập hoặc mật khẩu không đúng!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
        }
	}
	protected void btnCancelActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		setState(FrLogin.DISPOSE_ON_CLOSE);
	}

	protected void jLabel4MousePressed(MouseEvent evt) {
		// TODO Auto-generated method stub
		setState(FrLogin.EXIT_ON_CLOSE);
	}

	protected void jLabel5MousePressed(MouseEvent evt) {
		// TODO Auto-generated method stub
		setState(FrLogin.MAXIMIZED_BOTH);
	}

	protected void jLabel6MousePressed(MouseEvent evt) {
		// TODO Auto-generated method stub
		setState(FrLogin.ICONIFIED);
	}
	
}
