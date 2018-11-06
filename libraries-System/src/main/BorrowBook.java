package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class BorrowBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrowBook frame = new BorrowBook();
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
	public BorrowBook() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(BorrowBook.class.getResource("/main/icon.png")));
		setTitle("\u501F\u9605\u56FE\u4E66");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 402, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5F53\u524D\u501F\u9605\u8BC1\u53F7\uFF1A");
		label.setBounds(10, 10, 93, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(113, 10, 311, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u501F\u9605\u56FE\u4E66\u68C0\u7D22\u53F7");
		label_1.setBounds(29, 56, 99, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(149, 53, 196, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u501F\u9605\u56FE\u4E66");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "ÇëÔÚËÑË÷¿òÖÐÌîÈë¼ìË÷ºÅ", "ËÑË÷¿òÎª¿Õ£¡", JOptionPane.ERROR_MESSAGE);
				} else {
					//Êý¾Ý¿âÖÐÐÞ¸ÄÍ¼Êé×´Ì¬
				}
			}
		});
		button.setBounds(29, 122, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(252, 122, 93, 23);
		contentPane.add(button_1);
	}

}
