package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class SearchInformation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchInformation frame = new SearchInformation();
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
	public SearchInformation() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SearchInformation.class.getResource("/main/icon.png")));
		setResizable(false);
		setTitle("\u501F\u9605\u4FE1\u606F\u67E5\u8BE2");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5F53\u524D\u501F\u9605\u8BC1\u53F7\uFF1A");
		label.setBounds(10, 10, 96, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(116, 10, 308, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label \u501F\u9605\u4FE1\u606F");
		lblNewLabel_1.setBounds(10, 35, 414, 172);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE\u4E0A\u5C42");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnNewButton.setBounds(331, 228, 93, 23);
		contentPane.add(btnNewButton);
	}

}
