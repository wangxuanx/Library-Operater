package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.Toolkit;

public class TopFram extends JFrame {
	private JTextField textField;
    private JPasswordField passwordField;
    
    private String str1;         // = textField.getText();               //获取用户名
    public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}
	private String str2;           // = String.valueOf(passwordField.getPassword());         //获取密码
	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		refreshTop();
	}

	/**
	 * Create the frame.
	 */
	public TopFram() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TopFram.class.getResource("/main/icon.png")));
		/*ImageIcon topimage = new ImageIcon("C:\\Users\\mujing\\Desktop\\图片素材\\top.jpg");
		JLabel jlabel = new JLabel(topimage);*/
		
		setResizable(false);
		setTitle("\u56FE\u4E66\u7BA1\u7406\u7CFB\u7EDF\u767B\u9646\u754C\u9762 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 275);
		JPanel contentPane = new JPanel(){  
            @Override  
            protected void paintComponent(Graphics g) {  
                ImageIcon icon = new ImageIcon(TopFram.class.getResource("/main/top.png"));  
                Image img = icon.getImage();  
                g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());  
            }  
        };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(164, 53, 119, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(84, 56, 54, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6    \u7801");
		label_1.setBounds(84, 107, 54, 15);
		contentPane.add(label_1);
		
		ImageIcon icon = new ImageIcon(TopFram.class.getResource("/main/button.png"));
		JButton button = new JButton("\u767B\u9646")/*{  
            @Override  
            protected void paintComponent(Graphics g) {  
                ImageIcon icon = new ImageIcon(TopFram.class.getResource("/main/button.png"));  
                Image img = icon.getImage();  
                g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());  
            }  
        }*/;
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBounds(71, 190, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u6CE8\u518C");
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {           //注册界面
			public void actionPerformed(ActionEvent e) {
				NewUser newuser = new NewUser();
				newuser.setLocationRelativeTo(null);
				newuser.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(204, 190, 93, 23);
		contentPane.add(button_1);
		
		JRadioButton radioButton = new JRadioButton("\u5B66\u751F");
		radioButton.setContentAreaFilled(false);
		radioButton.setBounds(42, 151, 66, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u56FE\u4E66\u7BA1\u7406\u5458");
		radioButton_1.setContentAreaFilled(false);
		radioButton_1.setBounds(134, 151, 101, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u7CFB\u7EDF\u7BA1\u7406\u5458");
		radioButton_2.setContentAreaFilled(false);
		radioButton_2.setBounds(237, 151, 101, 23);
		contentPane.add(radioButton_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(164, 104, 119, 21);
		contentPane.add(passwordField);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton);
		group.add(radioButton_1);
		group.add(radioButton_2);            //将三个添加在一个群组中使其只能选择一个
		
		button.addActionListener(new ActionListener() {             //登陆界面
			public void actionPerformed(ActionEvent e) {
				setStr1(textField.getText());            //获取用户名
				setStr2(String.valueOf(passwordField.getPassword()));         //获取密码
				dispose();
				
				boolean flag = false;
				
				if(getStr1().equals("") || str2.equals("")) {
					JOptionPane.showMessageDialog(null, "请输入正确的用户名及密码", "登陆错误", JOptionPane.ERROR_MESSAGE);
					refreshTop();
				} else {
					Connection con = DBUTill.open();
					try {
						Statement state = con.createStatement();
						if(radioButton.isSelected()) {          //选中学生
							String sql = "select name,password from user";
							ResultSet rs = state.executeQuery(sql);
							while(rs.next()){
								String name = rs.getString(1);
								String pwd = rs.getString(2);
								if(pwd.equals(str2)&&name.equals(getStr1())){
									StudFram stu = new StudFram();
									stu.setLocationRelativeTo(null);
									stu.setVisible(true);
									flag = true;
								}
							}
							if(!flag){
								JOptionPane.showMessageDialog(null, "请输入正确的用户名及密码", "登陆错误", JOptionPane.ERROR_MESSAGE);
								refreshTop();
							}
							
						} else if(radioButton_1.isSelected()) {           //选择图书管理员
							String sql = "select name,password from labrarian";
							ResultSet rs = state.executeQuery(sql);
							while(rs.next()){
								String name = rs.getString(1);
								String pwd = rs.getString(2);
								if(pwd.equals(str2)&&name.equals(getStr1())){
									BookOperater booker = new BookOperater();
									booker.setLocationRelativeTo(null);
									booker.setVisible(true);
									flag = true;
								}
							}
							if(!flag){
								JOptionPane.showMessageDialog(null, "请输入正确的用户名及密码", "登陆错误", JOptionPane.ERROR_MESSAGE);
								refreshTop();
							}			
							
						} else if(radioButton_2.isSelected()) {          //选择系统管理员
							String sql = "select name,password from system_manager";
							ResultSet rs = state.executeQuery(sql);
							while(rs.next()){
								String name = rs.getString(1);
								String pwd = rs.getString(2);
								if(pwd.equals(str2)&&name.equals(getStr1())){
									SystemOperater systemer = new SystemOperater();
									systemer.setLocationRelativeTo(null);
									systemer.setVisible(true);
									flag = true;
								}
							}
							if(!flag){
								JOptionPane.showMessageDialog(null, "请输入正确的用户名及密码", "登陆错误", JOptionPane.ERROR_MESSAGE);
								refreshTop();
							}
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					finally{
						DBUTill.close(con);
					}
				}
			}
		});
	}

	static void refreshTop() {          //刷新登陆界面
		TopFram top = new TopFram();
		top.setLocationRelativeTo(null);
		top.setVisible(true);
		top.setLocationRelativeTo(null);
		top.setVisible(true);
	}
}
