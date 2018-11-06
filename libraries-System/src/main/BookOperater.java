package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Toolkit;

public class BookOperater extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String StuNumber;             //学生借阅证号

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookOperater frame = new BookOperater();
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
	public BookOperater() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(BookOperater.class.getResource("/main/icon.png")));
		setTitle("\u56FE\u4E66\u7BA1\u7406\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u5728\u4E0B\u6846\u4E2D\u586B\u5165\u501F\u9605\u8BC1\u53F7\u6765\u8FDB\u884C\u64CD\u4F5C");
		label.setFont(new Font("微软雅黑", Font.BOLD, 16));
		label.setBounds(19, 74, 260, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u501F\u9605\u8BC1\u53F7\uFF1A");
		label_1.setBounds(19, 110, 69, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(98, 107, 181, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u501F\u9605\u56FE\u4E66");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {          //借阅图书
			public void actionPerformed(ActionEvent e) {
				BorrowBook bb = new BorrowBook();
				bb.setLocationRelativeTo(null);
				bb.setVisible(true);
			}
		});
		btnNewButton.setBounds(19, 152, 112, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u5F52\u8FD8\u56FE\u4E66");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {         //归还图书
			public void actionPerformed(ActionEvent e) {
				ReturnBook rb = new ReturnBook();
				rb.setLocationRelativeTo(null);
				rb.setVisible(true);
			}
		});
		button.setBounds(160, 152, 112, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u67E5\u8BE2\u501F\u9605\u4FE1\u606F");
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {          //查询借阅信息
			public void actionPerformed(ActionEvent e) {
				SearchInformation si = new SearchInformation();
				si.setLocationRelativeTo(null);
				si.setVisible(true);
			}
		});
		button_1.setBounds(301, 152, 112, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u6CE8\u9500\u8D26\u6237");
		button_2.setContentAreaFilled(false);
		button_2.addActionListener(new ActionListener() {          //注销账户
			public void actionPerformed(ActionEvent e) {
				dispose();
				TopFram.refreshTop();
			}
		});
		button_2.setBounds(217, 208, 93, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u9000\u51FA\u7CFB\u7EDF");
		button_3.setContentAreaFilled(false);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);           //退出系统
			}
		});
		button_3.setBounds(320, 208, 93, 23);
		contentPane.add(button_3);
		
		JLabel label_2 = new JLabel("\u59D3    \u540D\uFF1A");
		label_2.setBounds(10, 10, 54, 15);
		contentPane.add(label_2);
		
		JLabel lblid = new JLabel("\u7528\u6237ID\uFF1A");
		lblid.setBounds(10, 38, 54, 15);
		contentPane.add(lblid);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(74, 10, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(74, 38, 54, 15);
		contentPane.add(lblNewLabel_1);
	}
}
