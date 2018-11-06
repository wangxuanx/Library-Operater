package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ReturnBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnBook frame = new ReturnBook();
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
	public ReturnBook() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ReturnBook.class.getResource("/main/icon.png")));
		setResizable(false);
		setTitle("\u5F52\u8FD8\u56FE\u4E66");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5F53\u524D\u501F\u9605\u8BC1\u53F7\uFF1A");
		label.setBounds(10, 10, 95, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(115, 10, 298, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label \u663E\u793A\u6240\u6709\u7684\u501F\u9605\u56FE\u4E66");
		lblNewLabel_1.setBounds(10, 35, 414, 121);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u9700\u8981\u5F52\u8FD8\u7684\u56FE\u4E66\u68C0\u7D22\u53F7");
		lblNewLabel_2.setBounds(10, 166, 133, 15);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(153, 163, 260, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u5F52\u8FD8\u56FE\u4E66");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {           //归还图书
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "请在搜索框中填入需要归还图书的检索号", "搜索框为空！", JOptionPane.ERROR_MESSAGE);
				} else {
					//实现归还操作
				}
			}
		});
		button.setBounds(50, 211, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88\u64CD\u4F5C");
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {       //取消操作
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(284, 211, 93, 23);
		contentPane.add(button_1);
	}
}
