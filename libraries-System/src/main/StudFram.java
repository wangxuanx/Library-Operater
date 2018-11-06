package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class StudFram extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudFram frame = new StudFram();
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
	public StudFram() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudFram.class.getResource("/main/icon.png")));
		setResizable(false);
		setTitle("\u5B66\u751F\u64CD\u4F5C");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u59D3         \u540D\uFF1A");
		label.setBounds(14, 26, 69, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u7CFB         \u522B\uFF1A");
		label_1.setBounds(14, 51, 69, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u501F\u9605\u8BC1\u53F7\uFF1A");
		label_2.setBounds(14, 76, 69, 15);
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("3");
		lblNewLabel.setBounds(93, 76, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("1");
		label_3.setBounds(93, 26, 54, 15);
		contentPane.add(label_3);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setBounds(93, 51, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton button = new JButton("\u67E5\u8BE2\u56FE\u4E66");
		button.setContentAreaFilled(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StuSeekBook ssb = new StuSeekBook();
				ssb.setLocationRelativeTo(null);
				ssb.setVisible(true);
			}
		});
		button.setBounds(64, 168, 119, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u6CE8\u9500\u8D26\u6237");
		button_1.setContentAreaFilled(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				TopFram.refreshTop();
			}
		});
		button_1.setBounds(308, 35, 93, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u9000\u51FA\u7CFB\u7EDF");
		button_2.setContentAreaFilled(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setBounds(308, 90, 93, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u9884\u7EA6\u56FE\u4E66");
		button_3.setContentAreaFilled(false);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuSubscribeBook ssb = new StuSubscribeBook();
				ssb.setLocationRelativeTo(null);
				ssb.setVisible(true);
			}
		});
		button_3.setBounds(238, 169, 119, 23);
		contentPane.add(button_3);
	}
}
