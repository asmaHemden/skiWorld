package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import com.lavantech.gui.comp.CalendarPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.print.DocFlavor.READER;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;

import entity.Coach;
import entity.Equipement;
import services.EquipementServiceRemote;
import services.UserServiceRemote;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import java.awt.Font;

public class CoachFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	private JTextField text6;
	private JLabel label;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoachFrame frame = new CoachFrame();
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
	public CoachFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(91, 47, 742, 143);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
		        AbstractTableModel model = (AbstractTableModel)table.getModel();
			     text1.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),0)));
			     text2.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),1)));
			     text3.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),2)));
			     text4.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),3)));
			   //  text5.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),4)));
			     text6.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),4)));
			}
			
			
		});
		scrollPane.setViewportView(table);
		
		text1 = new JTextField();
		text1.setBounds(225, 228, 180, 31);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(225, 281, 180, 31);
		contentPane.add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setBounds(225, 340, 180, 31);
		contentPane.add(text3);
		text3.setColumns(10);
		
		text4 = new JTextField();
		text4.setBounds(605, 228, 180, 31);
		contentPane.add(text4);
		text4.setColumns(10);
		
		text5 = new JTextField();
		text5.setBounds(604, 281, 181, 31);
		contentPane.add(text5);
		text5.setColumns(10);
		
		text6 = new JTextField();
		text6.setBounds(604, 340, 181, 31);
		contentPane.add(text6);
		text6.setColumns(10);
		

		/*****Ajouter Coach***********/
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		btnAdd.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\add1.png"));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InitialContext context;
				
				try {
					
						context = new InitialContext();
						UserServiceRemote proxy = (UserServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/UserService!services.UserServiceRemote");
						
						Coach coach=new Coach(); 
						if (text1.getText().equals("")|text1.getText().equals("")|text2.getText().equals("")|text3.getText().equals("")
								|text4.getText().equals("")|text5.getText().equals("")|text6.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null, "please complete all fields");
						}
						else {
							
							coach.setNom(text1.getText());
							coach.setPrenom(text2.getText());
							coach.setCIN(Integer.valueOf(text3.getText()));
							coach.setEmail(text4.getText());
							coach.setPasswold(text5.getText());
							coach.setSalary(Float.valueOf(text6.getText()));
							//UserServiceRemote
							proxy.addCoach(coach);
							table.setModel(new AdapterCoach());
							text1.setText("");
							text2.setText("");
							text3.setText("");
							text4.setText("");
							text5.setText("");
							text6.setText("");
						
							JOptionPane.showMessageDialog(null, "Coach added");
						}
				
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
			}
		});
		btnAdd.setBounds(132, 416, 150, 40);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\up.png"));
		
		/****Update*******/
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Coach coachrow = null;
				int index = table.getSelectedRow();

				if (index != -1) {

				
				try {
					
	Context context;
					
					context = new InitialContext();
					UserServiceRemote proxy = (UserServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/UserService!services.UserServiceRemote");
					
			
					//Coach coachh=new Coach();
					List<Coach> coachs = proxy.findAllCoachs();
				
					coachrow=coachs.get(index);
					
					Coach coach = proxy.findCoachById(coachrow.getId());
					 
					coach.setNom(text1.getText());
					coach.setPrenom(text2.getText());
					coach.setCIN(Integer.valueOf(text3.getText()));
					coach.setEmail(text4.getText());
					coach.setPasswold(text5.getText());
					coach.setSalary(Float.valueOf(text6.getText()));
			proxy.updateCoach(coach);
			text1.setText("");
			text2.setText("");
			text3.setText("");
			text4.setText("");
			text5.setText("");
			text6.setText("");

			table.setModel(new AdapterCoach());
				} catch (Exception e2) {
					e2.printStackTrace();
				}

				} else {
					JOptionPane.showMessageDialog(null, "Please select coach to update");
				}
			}
			
		});
		btnUpdate.setBounds(397, 416, 150, 40);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		btnDelete.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\supp.png"));
		/*****Delete********/
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Equipement equipementrow = null;
				int index = table.getSelectedRow();
				
				Coach coachrow = null;
				

				if (index != -1) {

				
				try {
					
	Context context;
					
					context = new InitialContext();
					UserServiceRemote proxy = (UserServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/UserService!services.UserServiceRemote");
					
					List<Coach> coachs = proxy.findAllCoachs();
					
					coachrow=coachs.get(index);
					Coach coach = proxy.findCoachById(coachrow.getId());
					 
			proxy.deleteCoach(coach);
			text1.setText("");
			text2.setText("");
			text3.setText("");
			text4.setText("");
			text5.setText("");
			text6.setText("");
			table.setModel(new AdapterCoach());
				} catch (Exception e2) {
					e2.printStackTrace();
				}

				} else {
					JOptionPane.showMessageDialog(null, "Please select a course to remove");
				}
				
			}
		});
		btnDelete.setBounds(661, 416, 150, 40);
		contentPane.add(btnDelete);
		table.setModel(new AdapterCoach());
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu menu =new Menu();
				menu.setVisible(true);

				CoachFrame coach =new CoachFrame();
				  
				coach.setVisible(false);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\fleche_209.gif"));
		button.setBounds(0, 455, 89, 40);
		contentPane.add(button);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\Coach.png"));
		label.setBounds(0, 0, 863, 495);
		contentPane.add(label);
	}
}
