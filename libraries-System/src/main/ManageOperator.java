package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ManageOperator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageOperator frame = new ManageOperator();
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
	public ManageOperator() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ManageOperator.class.getResource("/main/icon.png")));
		setTitle("\u7BA1\u7406\u501F\u9605\u8005");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u9700\u8981\u8FDB\u884C\u64CD\u4F5C\u7684\u56FE\u4E66\u7BA1\u7406\u5458ID");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 10, 414, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblId = new JLabel("ID\uFF1A");
		lblId.setBounds(32, 65, 31, 15);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(73, 62, 210, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u589E\u52A0\u7BA1\u7406\u5458");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {    
			public void actionPerformed(ActionEvent e) {
				//添加管理员
			}
		});
		button.setBounds(23, 137, 108, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u5220\u9664\u7BA1\u7406\u5458");
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//删除管理员
			}
		});
		button_1.setBounds(160, 137, 108, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u4FEE\u6539\u7BA1\u7406\u5458");
		button_2.setContentAreaFilled(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//修改管理员信息
			}
		});
		button_2.setBounds(296, 137, 108, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u53D6\u6D88\u64CD\u4F5C");
		button_3.setContentAreaFilled(false);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_3.setBounds(311, 204, 93, 23);
		contentPane.add(button_3);
	}
}
