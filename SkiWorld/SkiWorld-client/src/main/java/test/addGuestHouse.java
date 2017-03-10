package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class addGuestHouse extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addGuestHouse frame = new addGuestHouse();
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
	public addGuestHouse() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("logout");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(486, 67, 115, 31);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guest House");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(134, 68, 120, 31);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Deal");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(256, 67, 115, 32);
		getContentPane().add(btnNewButton_2);
		
		JButton btnCourse = new JButton("Course");
		btnCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCourse.setBounds(378, 67, 105, 32);
		getContentPane().add(btnCourse);
		
		JButton btnNewButton_3 = new JButton("Equipment");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(10, 68, 120, 32);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblConnectEnTant = new JLabel("Connecté en tant que: ");
		lblConnectEnTant.setBounds(10, 11, 179, 22);
		getContentPane().add(lblConnectEnTant);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\fond.jpg"));
		lblNewLabel.setBounds(-4, 0, 605, 420);
		getContentPane().add(lblNewLabel);
	}
}
