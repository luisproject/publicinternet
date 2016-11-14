package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import model.bean.May;
import model.bean.PhienNguoiDung;
import model.bo.MayBO;
import model.bo.PhienNguoiDungBO;
import model.dao.MayDAO;
import utils.LibraryString;
import utils.MyTimesTamp;

@SuppressWarnings("all")
public class PnHome extends JPanel {

	/**
	 * Create the panel.
	 */
	// Control + 7 => Structure Code Following Application
	private JSplitPane jSplitPane1;
	private JScrollPane jScrollPane1;
	
	private JPanel Left;
	
	private JPanel Right;
	private JPanel jPanel1;
	private JLabel jLabel1;
	
	private JLabel jLabel2;
	private JTextField tfTenMay;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel10;
	private JLabel trangThailbl;
	private JLabel tinhTranglbl;
	private JTextField jTextField2;
	private JSpinner tfThoiGianBatDau;
	private JSpinner tfThoiGianKetThuc;
	private JSpinner jSpinner2;
	private JTextField tfPhiDichVu;
	private JTextField tfTongTien;
	
	
	private JPanel Controll;
	private JButton btnOn;
	private JButton btnOff;
	
	private JPanel Result;
	
	private JPopupMenu PopupUserSession;
	private JMenuItem miniOpen;
	private JMenuItem miniClose;
	private Separator linea;
	
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private ArrayList<May> listMay = new ArrayList<May>();
	
	private MayBO mayBO = new MayBO();
	private PhienNguoiDungBO phienNguoiDungBO = new PhienNguoiDungBO();
	
	private JButton btnRoom;
	
	public PnHome() {
		initComponents();
		listMay = new MayBO().getList();
		setRowList(new MayBO().getList().size());
		viewRoom(list);		
	}

	private void setRowList(int size){
		int dir = size/13;
		int mod = size%13;
		for(int i = 0; i < dir; i++){
			list.add(13);
		}
		if(mod != 0){
			list.add(mod);
		}
	}
	private void viewRoom(ArrayList<Integer> listRow) {
		int j = 0;
		for(int index = 0; index < listRow.size(); index++){
			JPanel leftRow = new JPanel();
			leftRow.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
		    Left.add(leftRow);
		    viewComputer(leftRow,listMay,listRow,index,j);
		    j += listRow.get(index);
		}
    }

	private void viewComputer(JPanel leftRow,ArrayList<May> temp,ArrayList<Integer> listTemp,int n,int m){
		for(int i = m; i < listTemp.get(n)+m; i++){
            btnRoom = new JButton();
            btnRoom.setFont(new Font("Tahoma",1,13));
            btnRoom.setForeground(new Color(51, 153, 0));
            btnRoom.setIcon(new ImageIcon(getClass().getResource("/images/desktop.png")));
            btnRoom.setText(temp.get(i).getTenMay());
            btnRoom.setBorder(BorderFactory.createEmptyBorder());
            btnRoom.setFocusable(false);
            btnRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            btnRoom.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            btnRoom.setName(i+"");
            btnRoom.setOpaque(false);
            btnRoom.setContentAreaFilled(false);
            btnRoom.setBorderPainted(false); 
            btnRoom.setComponentPopupMenu(PopupUserSession);
            if(temp.get(i).getTrangThai()==true){
            	btnRoom.setIcon(new ImageIcon(getClass().getResource("/images/desktopuser.png")));
            }else{
            	btnRoom.setIcon(new ImageIcon(getClass().getResource("/images/desktop.png")));
            }
            leftRow.add(btnRoom);
            int id = temp.get(i).getIdm();
            btnRoom.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getInfromationCom(id);
                }
            });
        }
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		miniOpen = new JMenuItem();
		miniClose = new JMenuItem();    
		linea = new Separator();
		PopupUserSession = new JPopupMenu();
		
		miniOpen.setText("Open");
		miniOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniOpenActionPerformed(evt);
            }
        });
        PopupUserSession.add(miniOpen);
        
        PopupUserSession.add(linea);
        
        miniClose.setText("Close");
        miniClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniCloseActionPerformed(evt);
            }
        });
        PopupUserSession.add(miniClose);
		
		jSplitPane1 = new JSplitPane();
        jScrollPane1 = new JScrollPane();
        Left = new JPanel();
        Right = new JPanel();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        tfTenMay = new JTextField();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        trangThailbl = new JLabel();
        tinhTranglbl = new JLabel();
        jTextField2 = new JTextField();
        tfThoiGianBatDau = new JSpinner();
        tfThoiGianKetThuc = new JSpinner();
        jSpinner2 = new JSpinner();
        tfPhiDichVu = new JTextField();
        tfTongTien = new JTextField();
        
        Controll = new JPanel();
        btnOn = new JButton();
        btnOff = new JButton();
        
        Result = new JPanel();
        
        setBackground(new java.awt.Color(242, 242, 242));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setName("Home"); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBorder(null);
        jSplitPane1.setOneTouchExpandable(true);

        jScrollPane1.setAutoscrolls(true);

        Left.setBackground(new java.awt.Color(242, 242, 242));
        Left.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Left.setLayout(new java.awt.GridLayout(14, 1));

        jScrollPane1.setViewportView(Left);

        jSplitPane1.setLeftComponent(jScrollPane1);

        Right.setBackground(new java.awt.Color(242, 242, 242));
        Right.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Thông tin chi tiết");
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tên máy:");

        tfTenMay.setPreferredSize(new java.awt.Dimension(59, 24));
        tfTenMay.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên người dùng:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Thời gian bắt đầu:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Phí dịch vụ:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tổng tiền:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Trạng thái:");
        
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Tình trạng:");
        
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Thời gian kết thúc:");
        
        trangThailbl.setFont(new java.awt.Font("Tahoma", 0, 12));
        trangThailbl.setForeground(Color.RED);
        
        tinhTranglbl.setFont(new java.awt.Font("Tahoma", 0, 12));
        tinhTranglbl.setForeground(Color.RED);
        
        jTextField2.setPreferredSize(new java.awt.Dimension(59, 24));

        tfThoiGianBatDau.setModel(new SpinnerDateModel());
        tfThoiGianBatDau.setModel(new javax.swing.SpinnerDateModel());
        tfThoiGianBatDau.setEditor(new javax.swing.JSpinner.DateEditor(tfThoiGianBatDau, "dd/MM/yyyy - HH:mm:ss"));
        tfThoiGianBatDau.setPreferredSize(new java.awt.Dimension(29, 24));
        tfThoiGianBatDau.setEnabled(false);

        tfThoiGianKetThuc.setModel(new javax.swing.SpinnerDateModel());
        tfThoiGianKetThuc.setDoubleBuffered(true);
        tfThoiGianKetThuc.setEditor(new javax.swing.JSpinner.DateEditor(tfThoiGianKetThuc, "dd/MM/yyyy - HH:mm:ss"));
        tfThoiGianKetThuc.setEnabled(false);
        tfThoiGianKetThuc.setPreferredSize(new java.awt.Dimension(29, 24));
        
        jSpinner2.setPreferredSize(new java.awt.Dimension(29, 24));

        tfPhiDichVu.setPreferredSize(new java.awt.Dimension(59, 24));
        tfPhiDichVu.setEditable(false);

        tfTongTien.setPreferredSize(new java.awt.Dimension(59, 24));
        tfTongTien.setEditable(false);

        btnOn.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        btnOn.setForeground(new java.awt.Color(51, 51, 255));
        btnOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/on.png"))); 
        btnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnActionPerformed(evt);
            }
        });
        Controll.add(btnOn);
        
        btnOff.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        btnOff.setForeground(new java.awt.Color(51, 51, 255));
        btnOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off.png"))); 
        btnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOffActionPerformed(evt);
            }
        });
        Controll.add(btnOff);
        
        Result.setLayout(new java.awt.BorderLayout());
        
        javax.swing.GroupLayout RightLayout = new GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Controll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfThoiGianKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfThoiGianBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPhiDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                            .addComponent(tfTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfTenMay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trangThailbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tinhTranglbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTenMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfThoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfThoiGianKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfPhiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(trangThailbl))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tinhTranglbl))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Controll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setRightComponent(Right);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
	}

	protected void btnOffActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
	}

	protected void btnOnActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		May item = mayBO.getItemName(tfTenMay.getText());
		if(tfTenMay.getText().equals("")){
			JOptionPane.showMessageDialog(new PnHome(), "<html><p style=\"color:red; font-weight:bold;\">Bạn chưa chọn máy!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
		}else{
			if(item.getTinhTrang().equals("Bảo Trì")){
				JOptionPane.showMessageDialog(new PnHome(), "<html><p style=\"color:red; font-weight:bold;\">Xin lỗi hiện tại máy đang bảo trì!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
			}else{
				if(item.getTrangThai()){
					JOptionPane.showMessageDialog(new PnHome(), "<html><p style=\"color:red; font-weight:bold;\">Đang có người sử dụng!</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(new PnHome(), "<html><p style=\"color:red; font-weight:bold;\">Bạn chắc sử dụng máy này không ?</p></html>","Thông báo",JOptionPane.WARNING_MESSAGE);
					item.setTrangThai(true);
					phienNguoiDungBO.addItem(new PhienNguoiDung(item.getIdm(),item.getTrangThai(),MyTimesTamp.getTimestampToDB(),MyTimesTamp.getTimestampToDB(),"00:00","1000"));
					mayBO.editItem(new May(item.getIdm(),item.getTenMay(),item.getTinhTrang(),item.getTrangThai(),item.getMoTa(),item.getDonGia()));
					new PnHome().revalidate();
				}
			}
		}
	}
	
	protected void getInfromationCom(int id) {
		// TODO Auto-generated method stub
		May item = mayBO.getItem(id);
		tfTenMay.setText(item.getTenMay());
		tfPhiDichVu.setText(LibraryString.changeCurrencyVND(String.valueOf(item.getDonGia()))+" VND");
		if(item.getTrangThai()){
			trangThailbl.setText("<html><p style=\"color:red; font-weight:bold; font-size: 11px;\">ĐANG ONLINE</p></html>");
		}else{
			trangThailbl.setText("<html><p style=\"color:red; font-weight:bold; font-size: 11px;\">KHÔNG ONLINE</p></html>");
			tfThoiGianBatDau.setValue("0000-00-00 00:00:00");
			tfThoiGianKetThuc.setValue("0000-00-00 00:00:00");
		}
		tinhTranglbl.setText("<html><p style=\"color:#00595c; font-weight:bold; font-size: 11px;\">"+item.getTinhTrang()+"</p></html>");
	}
	
	protected void miniCloseActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
	}

	protected void miniOpenActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
	}
}
