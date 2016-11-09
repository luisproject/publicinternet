package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import model.bean.May;
import model.bo.MayBO;
import model.dao.MayDAO;

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
	private JTextField jTextField1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JTextField jTextField2;
	private JSpinner jSpinner1;
	private JSpinner jSpinner2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private ArrayList<May> listMay = new ArrayList<May>();
	
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
            JButton btnRoom = new JButton();
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
            leftRow.add(btnRoom);
            btnRoom.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btnRoom.setIcon(new ImageIcon(getClass().getResource("/images/desktopuser.png")));
                }
            });
        }
	}
	
	private void initComponents() {
		// TODO Auto-generated method stub
		jSplitPane1 = new JSplitPane();
        jScrollPane1 = new JScrollPane();
        Left = new JPanel();
        Right = new JPanel();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jTextField2 = new JTextField();
        jSpinner1 = new JSpinner();
        jSpinner2 = new JSpinner();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();

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

        jTextField1.setPreferredSize(new java.awt.Dimension(59, 24));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên người dùng:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Thời gian bắt đầu:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Thời gian sử dụng:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Phí dịch vụ:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tổng tiền:");

        jTextField2.setPreferredSize(new java.awt.Dimension(59, 24));

        jSpinner1.setModel(new SpinnerDateModel());
        jSpinner1.setPreferredSize(new java.awt.Dimension(29, 24));

        jSpinner2.setPreferredSize(new java.awt.Dimension(29, 24));

        jTextField3.setPreferredSize(new java.awt.Dimension(59, 24));

        jTextField4.setPreferredSize(new java.awt.Dimension(59, 24));

        javax.swing.GroupLayout RightLayout = new GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(Right);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
	}

}
