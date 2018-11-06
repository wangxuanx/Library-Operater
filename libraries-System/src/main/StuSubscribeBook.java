package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class StuSubscribeBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuSubscribeBook frame = new StuSubscribeBook();
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
	public StuSubscribeBook() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(StuSubscribeBook.class.getResource("/main/icon.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u9700\u8981\u9884\u7EA6\u7684\u56FE\u4E66\u68C0\u7D22\u53F7");
		label.setFont(new Font("微软雅黑", Font.BOLD, 16));
		label.setBounds(24, 40, 242, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(24, 90, 230, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u9884\u7EA6\u56FE\u4E66");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {          //预约图书
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "请在搜索框中填入检索号", "搜索框为空！", JOptionPane.ERROR_MESSAGE);
				} else {
					//在数据库中更改相应的图书状态
				}
			}
		});
		button.setBounds(320, 89, 93, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("New label\u663E\u793A\u501F\u9605\u4FE1\u606F");
		lblNewLabel.setBounds(24, 148, 389, 65);
		contentPane.add(lblNewLabel);
		
		JButton button_1 = new JButton("\u53D6\u6D88\u64CD\u4F5C");
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {         //取消操作
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(320, 223, 93, 23);
		contentPane.add(button_1);
	}

}
