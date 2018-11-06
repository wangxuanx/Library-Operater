package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	static String filePath = "E:\\eclispe-workspace\\MainData.txt";              //默认数据存放地址

	/**
	 * Launch the application.
	 */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUser frame = new NewUser();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewUser() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewUser.class.getResource("/main/icon.png")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setTitle("\u6CE8\u518C\u65B0\u7528\u6237");
		setBounds(100, 100, 424, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(166, 42, 120, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u59D3\u540D");
		label.setBounds(110, 45, 30, 15);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 90, 120, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("\u7CFB\u522B");
		label_1.setBounds(110, 93, 30, 15);
		contentPane.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 138, 120, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801");
		label_2.setBounds(110, 141, 30, 15);
		contentPane.add(label_2);
		
		JButton button = new JButton("\u6CE8\u518C");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {           //注册账户
			public void actionPerformed(ActionEvent arg0) {
				String str1, str2, str3;
				str1 = textField.getText();
				str2 = textField_1.getText();
				str3 = textField_2.getText();
				if(str1.equals("") || str2.equals("") || str3.equals("")) {
					JOptionPane.showMessageDialog(null, "请在空白对话框中填入信息", "信息输入有误", JOptionPane.ERROR_MESSAGE);
				}
				if(!str1.equals("") && !str2.equals("") && !str3.equals("")) {
					reFreshData(str1, str2, str3);
					JOptionPane.showMessageDialog(null, "  姓名: "+str1+"\n"+"  系别: "+str2+"\n"+"  借阅证号: "+str3, "注册借阅证成功", JOptionPane.CLOSED_OPTION);
					dispose();
					TopFram.refreshTop();
				}
			}
		});
		button.setBounds(70, 200, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {           //取消注册
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				TopFram.refreshTop();
			}
		});
		button_1.setBounds(241, 200, 93, 23);
		contentPane.add(button_1);
	}
	
	void reFreshData(String str1, String str2, String str3) {          //刷新文件中信息 
		File DATA = new File(filePath);         //创建储存信息的文件
		try {
			if(!DATA.exists()) {
			DATA.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileOutputStream out = new FileOutputStream(filePath);
			PrintStream ps = new PrintStream(out);
			ps.println(str1+" "+str2+" "+str3+"\n");
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
