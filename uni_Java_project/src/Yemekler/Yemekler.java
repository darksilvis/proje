package Yemekler;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java_projesi.homecik;
import Yemekler.*;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;

public class Yemekler extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {
					Yemekler frame = new Yemekler();
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
	public Yemekler() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100, 100, 700, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ARA SICAKLAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ara_Sicak a = null;
				try {
					a = new Ara_Sicak();
				} catch (SQLException e1) { 
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 10, 148, 67);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ANA YEMEKLER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ana_Yemek a = null;
				try {
					a = new Ana_Yemek();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 296, 148, 77);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("TATLILAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tatlilar t = null;
				try {
					t = new Tatlilar();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				t.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(545, 10, 131, 67);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("MEZELER");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mezeler m = null;
				try {
					m = new Mezeler();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				m.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(545, 296, 131, 77);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Geri");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homecik h=new homecik();
				h.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(307, 10, 85, 21);
		contentPane.add(btnNewButton_4);
	}

}
