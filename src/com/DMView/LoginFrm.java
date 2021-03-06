/*
 * LoginFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.DMView;

import java.awt.Font;
import java.sql.Connection;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.DMModel.User;
import com.DMUtil.DMUtil;
import com.DMUtil.StringUtil;
import com.Dao.UserDao;

/**
 *
 * @author  __USER__
 */
public class LoginFrm extends javax.swing.JFrame {
	DMUtil dmutil = new DMUtil();
	UserDao userdao = new UserDao();

	/** Creates new form LoginFrm */
	public LoginFrm() {

		Font font = new Font("Dialog", Font.PLAIN, 12);
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource) {
				UIManager.put(key, font);
			}
		}
		initComponents();
		this.setLocationRelativeTo(null);
		this.filltable();
	}

	private void filltable() {
		User user1 = new User();
		User user2 = new User();
		user1.setUserName("学生");
		user2.setUserName("管理员");
		user1.setId(1 + "");
		user2.setId(2 + "");
		jcb_choose.addItem(user1);
		jcb_choose.addItem(user2);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
userNameTxt = new javax.swing.JTextField();
userPasswordTxt = new javax.swing.JPasswordField();
jb_login = new javax.swing.JButton();
jb_reset = new javax.swing.JButton();
jcb_choose = new javax.swing.JComboBox();
jLabel4 = new javax.swing.JLabel();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setTitle("\u5b66\u751f\u5bbf\u820d\u7ba1\u7406\u7cfb\u7edf\u767b\u9646");
setResizable(false);

jLabel1.setFont(new java.awt.Font("宋体", 0, 24));
//jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Administrator\\桌面\\20130918091536739_easyicon_net_128.png")); // NOI18N
jLabel1.setText("       \u5b66\u751f\u5bbf\u820d\u7ba1\u7406\u7cfb\u7edf");

//jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images1\\userName.png")); // NOI18N
jLabel2.setText("\u7528\u6237\u540d\uff1a");

//jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images1\\password.png")); // NOI18N
jLabel3.setText("\u5bc6  \u7801\uff1a");

userNameTxt.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
userNameTxtActionPerformed(evt);
}
});

//jb_login.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images4\\login.png")); // NOI18N
jb_login.setText("\u767b\u5f55");
jb_login.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jb_loginActionPerformed(evt);
}
});

//jb_reset.setIcon(new javax.swing.ImageIcon("D:\\Myelipse\\images4\\reset.png")); // NOI18N
jb_reset.setText("\u91cd\u7f6e");
jb_reset.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jb_resetActionPerformed(evt);
}
});


jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Administrator\\桌面\\用户类型.jpg")); // NOI18N
jLabel4.setText("\u7528\u6237\u7c7b\u578b\uff1a");

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(21, 21, 21)
.addComponent(jLabel1)
.addContainerGap(58, Short.MAX_VALUE))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jLabel4)
.addGap(42, 42, 42)
.addComponent(jcb_choose, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(103, 103, 103)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jLabel3)
.addComponent(jLabel2)))
.addGroup(layout.createSequentialGroup()
.addGap(104, 104, 104)
.addComponent(jb_login)))
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(42, 42, 42)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(userNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
.addComponent(userPasswordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jb_reset)
.addGap(25, 25, 25)))))
.addGap(79, 79, 79))
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(27, 27, 27)
.addComponent(jLabel1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(26, 26, 26)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel3)
.addComponent(userPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(26, 26, 26)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel4)
.addComponent(jcb_choose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(34, 34, 34)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jb_login)
.addComponent(jb_reset))
.addContainerGap(43, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

	//GEN-END:initComponents

	private void jb_loginActionPerformed(java.awt.event.ActionEvent evt) {
		String userName = userNameTxt.getText();
		String userPassword = new String(userPasswordTxt.getPassword());
		if (StringUtil.isEmpty(userName)) {
			JOptionPane.showMessageDialog(null, "用户名不能为空！");
			return;
		} else if (StringUtil.isEmpty(userPassword)) {
			JOptionPane.showMessageDialog(null, "密码不能为空!");
			return;
		}
		User user = new User(userName, userPassword);
		Connection con = null;
		try {
			con = dmutil.getCon();
			User currentuser = userdao.Login(con, user);
			if (currentuser != null) {
				User user1 = (User) jcb_choose.getSelectedItem();
				String userright = user1.getUserName();
				if (userright.equals("管理员")) {
					this.dispose();
					MainFrm main = new MainFrm();
					main.setVisible(true);
				} else if (userright.equals("学生")) {
					this.dispose();
					MainFrm2 main2 = new MainFrm2();
					main2.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "用户名密码错误!");
				}
			}
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "登陆失败");
			e.printStackTrace();
		}
	}

	private void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {
		this.userNameTxt.setText("");
		this.userPasswordTxt.setText("");
	}

	private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling cod
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginFrm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JButton jb_login;
	private javax.swing.JButton jb_reset;
	private javax.swing.JComboBox jcb_choose;
	private javax.swing.JTextField userNameTxt;
	private javax.swing.JPasswordField userPasswordTxt;
	// End of variables declaration//GEN-END:variables

}