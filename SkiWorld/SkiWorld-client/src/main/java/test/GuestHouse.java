package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class GuestHouse extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuestHouse frame = new GuestHouse();
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
	public GuestHouse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 460);
		getContentPane().setLayout(null);
		
		JLabel lblGuestHouseManagment = new JLabel("Guest House Managment");
		lblGuestHouseManagment.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGuestHouseManagment.setBounds(283, 11, 426, 20);
		getContentPane().add(lblGuestHouseManagment);
		
		table = new JTable();
		table.setBounds(64, 152, 645, 217);
		getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(119, 77, 105, 31);
		getContentPane().add(btnNewButton);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHome.setBounds(10, 77, 99, 31);
		getContentPane().add(btnHome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\fond.jpg"));
		lblNewLabel.setBounds(0, 0, 806, 421);
		getContentPane().add(lblNewLabel);
	}
	public void updateTable(){
		
		String sql="select l from guesthouse l ";
		
		
	}
}
