package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Coach management");
		btnNewButton.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoachFrame coach =new CoachFrame();
				coach.setVisible(true);
				  
				frame.setVisible(false);		
				
			}
		});
		btnNewButton.setBounds(427, 193, 220, 63);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Equipment management");
		btnNewButton_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

EquipementFrame equipement =new EquipementFrame();
equipement.setVisible(true);
  
frame.setVisible(false);

			}
		});
		btnNewButton_1.setBounds(427, 63, 211, 68);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Courses management");
		btnNewButton_2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCourseFrame cours =new AddCourseFrame();
				cours.setVisible(true);
				  
				frame.setVisible(false);
				
			}
		});
		btnNewButton_2.setBounds(427, 311, 220, 63);
		contentPane.add(btnNewButton_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\ski_001.gif"));
		label_1.setBounds(200, 311, 177, 154);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\profite.gif"));
		label_2.setBounds(10, 11, 264, 187);
		contentPane.add(label_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\menu.png"));
		label.setBounds(-12, 0, 949, 480);
		contentPane.add(label);
	}

}
