package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entity.Coach;
import entity.Equipement;
import services.CourseServiceRemote;
import services.EquipementServiceRemote;
import services.UserServiceRemote;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class AddEquipementFrame extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEquipementFrame frame = new AddEquipementFrame();
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
	public AddEquipementFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLabel = new JLabel("Label:");
		lblLabel.setBounds(60, 106, 46, 14);
		contentPane.add(lblLabel);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(60, 143, 46, 14);
		contentPane.add(lblGender);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(60, 184, 46, 14);
		contentPane.add(lblSize);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(60, 223, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblLicense = new JLabel("License:");
		lblLicense.setBounds(60, 264, 46, 14);
		contentPane.add(lblLicense);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(60, 308, 46, 14);
		contentPane.add(lblPrice);
		
		text1 = new JTextField();
		text1.setBounds(112, 103, 131, 26);
		contentPane.add(text1);
		text1.setColumns(10);
		
		JComboBox combo1 = new JComboBox();
		combo1.setToolTipText("");
		combo1.setBounds(116, 140, 127, 30);
		contentPane.add(combo1);
		
		JComboBox combo2 = new JComboBox();
		combo2.setBounds(116, 181, 127, 26);
		contentPane.add(combo2);
		
		JComboBox combo3 = new JComboBox();
		combo3.setBounds(114, 220, 129, 26);
		contentPane.add(combo3);
		
		text2 = new JTextField();
		text2.setBounds(111, 261, 132, 26);
		contentPane.add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setBounds(116, 298, 127, 27);
		contentPane.add(text3);
		text3.setColumns(10);
		combo1.addItem("men");
		combo1.addItem("women");
		combo1.addItem("children");
		combo2.addItem("S");
		combo2.addItem("M");
		combo2.addItem("L");
		combo2.addItem("XL");
		combo2.addItem("XXL");
		combo3.addItem("Red");
		combo3.addItem("Orange");
		combo3.addItem("Yellow");
		combo3.addItem("Green");
		combo3.addItem("Blue");
		combo3.addItem("Black");
		combo3.addItem("White");
		combo3.addItem("Pink");
		combo3.addItem("Brown");
		combo3.addItem("Purple");
		
		JButton btnAdd = new JButton("Add+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Context context;
				try {
					 context = new InitialContext();
					EquipementServiceRemote proxy = (EquipementServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/EquipementService!services.EquipementServiceRemote");
					Equipement equipement =new Equipement();
					
		equipement.setColor((String)combo3.getSelectedItem());
		equipement.setGender((String)combo1.getSelectedItem());
		equipement.setLabel(text1.getText());
		equipement.setLiscense(text2.getText());
		equipement.setPrice(Float.valueOf(text3.getText()));
		equipement.setSize((String)combo2.getSelectedItem());
		proxy.addEquipement(equipement);
					} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		btnAdd.setBounds(391, 304, 89, 23);
		contentPane.add(btnAdd);
		
		JComboBox com1 = new JComboBox();
		com1.setBounds(406, 140, 131, 35);
		contentPane.add(com1);
		
		
		Context context;
try {
	context = new InitialContext();
	EquipementServiceRemote proxy = (EquipementServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/EquipementService!services.EquipementServiceRemote");
	
	entity.Equipement coach=new entity.Equipement();
	List<Equipement> coachs= proxy.findAllEquipements();
	for (int i = 0; i < coachs.size(); i++) {
		//String cin = Integer.valueOf(coachs.get(i).getCIN());
	//	String ss  = coachs.get(i).getNom().concat(" ").concat(coachs.get(i).getCIN());
		com1.addItem(coachs.get(i).getColor());

	}
	
} catch (Exception e) {
	e.printStackTrace();
}
		

		
	}
}
