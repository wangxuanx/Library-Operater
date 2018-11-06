package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class ManageUse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageUse frame = new ManageUse();
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
	public ManageUse() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ManageUse.class.getResource("/main/icon.png")));
		setTitle("\u7BA1\u7406\u501F\u9605\u8005");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 451, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u53D6\u6D88\u64CD\u4F5C");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(307, 189, 93, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u9700\u8981\u64CD\u4F5C\u7684\u501F\u9605\u8005\u501F\u9605\u8BC1\u53F7");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		label.setBounds(10, 10, 414, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u501F\u9605\u8BC1\u53F7\uFF1A");
		label_1.setBounds(22, 66, 71, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(103, 63, 297, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("\u6DFB\u52A0\u501F\u9605\u8005");
		button_1.setContentAreaFilled(false);
		button_1.setBounds(22, 132, 108, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u5220\u9664\u501F\u9605\u8005");
		button_2.setContentAreaFilled(false);
		button_2.setBounds(158, 132, 108, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u4FEE\u6539\u501F\u9605\u8005");
		button_3.setContentAreaFilled(false);
		button_3.setBounds(292, 132, 108, 23);
		contentPane.add(button_3);
	}

}
