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

public class ManageBook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageBook frame = new ManageBook();
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
	public ManageBook() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ManageBook.class.getResource("/main/icon.png")));
		setTitle("\u7BA1\u7406\u56FE\u4E66");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 455, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u70B9\u51FB\u4E0B\u9762\u6309\u94AE\u6765\u8FDB\u884C\u76F8\u5E94\u7684\u64CD\u4F5C");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		label.setBounds(10, 10, 414, 15);
		contentPane.add(label);
		
		JButton button = new JButton("\u6DFB\u52A0\u56FE\u4E66");
		button.setContentAreaFilled(false);
		button.setBounds(53, 65, 93, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u5220\u9664\u56FE\u4E66");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBounds(273, 65, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("\u67E5\u8BE2\u56FE\u4E66");
		button_1.setContentAreaFilled(false);
		button_1.setBounds(53, 145, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u4FEE\u6539\u56FE\u4E66");
		button_2.setContentAreaFilled(false);
		button_2.setBounds(273, 145, 93, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u53D6\u6D88\u64CD\u4F5C");
		button_3.setContentAreaFilled(false);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_3.setBounds(331, 208, 93, 23);
		contentPane.add(button_3);
	}

}
