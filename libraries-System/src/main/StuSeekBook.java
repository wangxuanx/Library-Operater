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

public class StuSeekBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuSeekBook frame = new StuSeekBook();
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
	public StuSeekBook() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(StuSeekBook.class.getResource("/main/icon.png")));
		setResizable(false);
		setTitle("\u67E5\u8BE2\u56FE\u4E66");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u60F3\u8981\u67E5\u8BE2\u7684\u56FE\u4E66\u4E66\u540D\u6216\u4F5C\u8005");
		label.setFont(new Font("微软雅黑", Font.BOLD, 16));
		label.setBounds(28, 38, 299, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(28, 76, 216, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "请在搜索框中填入书名或作者", "搜索框为空！", JOptionPane.ERROR_MESSAGE);
				} else {
					//从数据库中查询信息，并显示在label中
				}
			}
		});
		btnNewButton.setBounds(314, 75, 93, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label \u663E\u793A\u67E5\u8BE2\u5230\u7684\u4FE1\u606F");
		lblNewLabel.setBounds(28, 122, 379, 88);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("\u53D6\u6D88\u64CD\u4F5C");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {         //取消操作
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(314, 213, 93, 23);
		contentPane.add(button);
	}

}
