package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class SystemOperater extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SystemOperater frame = new SystemOperater();
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
	public SystemOperater() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SystemOperater.class.getResource("/main/icon.png")));
		setResizable(false);
		setTitle("\u7CFB\u7EDF\u7BA1\u7406\u5458");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u9009\u62E9\u9700\u8981\u7BA1\u7406\u7684\u76F8\u5E94\u9879\u76EE\uFF1A");
		label.setFont(new Font("微软雅黑", Font.BOLD, 16));
		label.setBounds(11, 101, 210, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u59D3    \u540D\uFF1A");
		label_1.setBounds(11, 21, 54, 15);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(75, 19, 54, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237ID\uFF1A");
		lblNewLabel_1.setBounds(11, 46, 54, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(75, 48, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\u7BA1\u7406\u501F\u9605\u8005");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {          //管理借阅者信息
			public void actionPerformed(ActionEvent e) {
				ManageUse mu = new ManageUse();
				mu.setLocationRelativeTo(null);
				mu.setVisible(true);
			}
		});
		btnNewButton.setBounds(11, 156, 132, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u7BA1\u7406\u56FE\u4E66\u7BA1\u7406\u5458");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {           //管理图书管理员
			public void actionPerformed(ActionEvent e) {
				ManageOperator mo = new ManageOperator();
				mo.setLocationRelativeTo(null);
				mo.setVisible(true);
			}
		});
		button.setBounds(151, 156, 132, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u7BA1\u7406\u56FE\u4E66");
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {         //管理图书信息
			public void actionPerformed(ActionEvent e) {
				ManageBook mb = new ManageBook();
				mb.setLocationRelativeTo(null);
				mb.setVisible(true);
			}
		});
		button_1.setBounds(292, 156, 132, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u9000\u51FA\u7CFB\u7EDF");
		button_2.setContentAreaFilled(false);
		button_2.addActionListener(new ActionListener() {         //退出系统
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setBounds(335, 213, 88, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u6CE8\u9500\u8D26\u6237");
		button_3.setContentAreaFilled(false);
		button_3.addActionListener(new ActionListener() {          //注销账户
			public void actionPerformed(ActionEvent e) {
				dispose();
				TopFram.refreshTop();
			}
		});
		button_3.setBounds(233, 213, 90, 23);
		contentPane.add(button_3);
	}

}
