package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import entity.Course;
import entity.Equipement;
import services.CourseServiceRemote;
import services.EquipementServiceRemote;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class EquipementFrame extends JFrame {

	private JPanel contentPane;
	private JScrollPane jtable;
	private JTable table;
	private JTextField text1;
	private JComboBox combo1;
	private JComboBox combo2;
	private JComboBox combo3;
	private JTextField text2;
	private JTextField text3;
	private JLabel label;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EquipementFrame frame = new EquipementFrame();
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
	public EquipementFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//table1.setModel(new AdapterEquipement());
		
		jtable = new JScrollPane();

		jtable.setBounds(89, 47, 742, 144);
		contentPane.add(jtable);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			/*	int row =table.getSelectedRow();
				String clique = table.getModel().getValueAt(row, 0).toString();
				text1.setText(clique);*/
		        AbstractTableModel model = (AbstractTableModel)table.getModel();
			     text1.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),0)));
			     text2.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),1)));
			     text3.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),5)));
			    /* combo1.setSelectedItem((String)(model.getValueAt(table.getSelectedRow(),3)));
			     combo2.setSelectedItem((String)(model.getValueAt(table.getSelectedRow(),4)));
			     combo3.setSelectedItem((String)(model.getValueAt(table.getSelectedRow(),5)));*/

				/*****/
			}
		});
		jtable.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setModel(new AdapterEquipement());
		
		text1 = new JTextField();
		text1.setBounds(226, 232, 181, 33);
		contentPane.add(text1);
		text1.setColumns(10);
		
		combo1 = new JComboBox();
		combo1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		combo1.setBounds(604, 227, 181, 33);
		contentPane.add(combo1);
		
		combo2 = new JComboBox();
		combo2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		combo2.setBounds(604, 285, 181, 28);
		contentPane.add(combo2);
		
		combo3 = new JComboBox();
		combo3.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		combo3.setBounds(604, 343, 181, 28);
		contentPane.add(combo3);
		
		text2 = new JTextField();
		text2.setBounds(226, 283, 181, 33);
		contentPane.add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setBounds(226, 340, 181, 34);
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
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		btnAjouter.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\add1.png"));
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				Context context;
				try {
					 context = new InitialContext();
					EquipementServiceRemote proxy = (EquipementServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/EquipementService!services.EquipementServiceRemote");
					Equipement equipement =new Equipement();
					if (text1.getText().equals("")|text1.getText().equals("")|text2.getText().equals("")|text3.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "please complete all fields");
					}
					
					else{
						equipement.setColor((String)combo3.getSelectedItem());
						equipement.setGender((String)combo1.getSelectedItem());
						equipement.setLabel(text1.getText());
						equipement.setLiscense(text2.getText());
						equipement.setPrice(Float.valueOf(text3.getText()));
						equipement.setSize((String)combo2.getSelectedItem());
					
						proxy.addEquipement(equipement);
						text1.setText("");
						text2.setText("");
						text3.setText("");
						table.setModel(new AdapterEquipement());
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		btnAjouter.setBounds(136, 421, 153, 35);
		contentPane.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		btnModifier.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\up.png"));
		btnModifier.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				//////****Modifier******/


				Equipement equipementrow = null;
				int index = table.getSelectedRow();

				if (index != -1) {

				
				try {
					
	Context context;
					
					context = new InitialContext();
					EquipementServiceRemote proxy = (EquipementServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/EquipementService!services.EquipementServiceRemote");
					
			
					Equipement equipement=new Equipement();
					List<Equipement> equipements = proxy.findAllEquipements();
				//	Courserow = hotelmodel.hotellist.get(index);
					equipementrow=equipements.get(index);
					
					Equipement eq = proxy.findEquipementById(equipementrow.getId());
					eq.setColor((String)combo3.getSelectedItem());
					eq.setGender((String)combo1.getSelectedItem());
					eq.setLabel(text1.getText());
					eq.setLiscense(text2.getText());
					eq.setPrice(Float.valueOf(text3.getText()));
					eq.setSize((String)combo2.getSelectedItem());
			proxy.updateEquipement(eq);
			
			text1.setText("");
			text2.setText("");
			text3.setText("");
			

			table.setModel(new AdapterEquipement());
				} catch (Exception e2) {
					e2.printStackTrace();
				}

				} else {
					JOptionPane.showMessageDialog(null, "Please select a course to update");
				}
			}
		});
		btnModifier.setBounds(393, 421, 159, 37);
		contentPane.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Delete");
		btnSupprimer.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		btnSupprimer.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\supp.png"));
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Equipement equipementrow = null;
				int index = table.getSelectedRow();

				if (index != -1) {

				
				try {
					
	Context context;
					
					context = new InitialContext();
					EquipementServiceRemote proxy = (EquipementServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/EquipementService!services.EquipementServiceRemote");
					
					entity.Course course=new entity.Course();
					List<Equipement> equipements = proxy.findAllEquipements();
				
					equipementrow=equipements.get(index);
					
					Equipement eq = proxy.findEquipementById(equipementrow.getId());
			proxy.deleteEquipement(eq);
			text1.setText("");
			text2.setText("");
			text3.setText("");
			table.setModel(new AdapterEquipement());
				} catch (Exception e2) {
					e2.printStackTrace();
				}

				} else {
					JOptionPane.showMessageDialog(null, "Please select a course to remove");
				}
			}
		});
		btnSupprimer.setBounds(657, 421, 159, 37);
		contentPane.add(btnSupprimer);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu =new Menu();
				menu.setVisible(true);
				EquipementFrame eq=new EquipementFrame();
				eq.setVisible(false);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\fleche_209.gif"));
		button.setBounds(0, 451, 89, 33);
		contentPane.add(button);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\equipement.png"));
		label.setBounds(0, 0, 913, 501);
		contentPane.add(label);
	}
}
