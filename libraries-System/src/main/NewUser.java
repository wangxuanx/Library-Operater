package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static TopFram topframe = new TopFram();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUser frame = new NewUser();
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
		setTitle("\u6CE8\u518C\u65B0\u7528\u6237");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		button.addActionListener(new ActionListener() {           //×¢²áÕË»§
			public void actionPerformed(ActionEvent arg0) {
				String str1, str2, str3;
				str1 = textField.getText();
				str2 = textField_1.getText();
				str3 = textField_2.getText();
				File DATA = new File();
			}
		});
		button.setBounds(70, 200, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {           //È¡Ïû×¢²á
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				topframe.setVisible(true);
			}
		});
		button_1.setBounds(241, 200, 93, 23);
		contentPane.add(button_1);
	}

}
