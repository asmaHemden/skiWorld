package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;

import com.toedter.calendar.JCalendar;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import com.toedter.components.JSpinField;

import Delegate.AddCourseServiceDelegate;
import entity.Coach;
import entity.Course;
import entity.Equipement;
import entity.User;
import services.CourseServiceRemote;
import services.EquipementServiceRemote;
import services.UserServiceRemote;

import com.lavantech.gui.comp.ClockPanel;
import com.lavantech.gui.comp.TimePanel;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.awt.event.ActionEvent;
import com.lavantech.gui.comp.DateTimePicker;
import com.toedter.components.JLocaleChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class AddCourseFrame extends JFrame {

	private JPanel contentPane;
	private JTextField text2;
	private JTextField text3;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCourseFrame frame = new AddCourseFrame();
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
	public AddCourseFrame() {
		setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCalendar calendar = new JCalendar();
		calendar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		calendar.setBounds(41, 231, 185, 121);
		contentPane.add(calendar);
		
		TimePanel timePanel = new TimePanel();
		timePanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		timePanel.setBounds(405, 224, 174, 128);
		contentPane.add(timePanel);
		
		TimePanel timePanel1 = new TimePanel();
		timePanel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		timePanel1.setBounds(236, 224, 159, 128);
		contentPane.add(timePanel1);
		
		text2 = new JTextField();
		text2.setBounds(716, 310, 143, 30);
		contentPane.add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setBounds(364, 368, 119, 37);
		contentPane.add(text3);
		text3.setColumns(10);
		JSpinner sp1 = new JSpinner();
		sp1.setBounds(214, 371, 69, 30);
		contentPane.add(sp1);

		JSpinner timeSpinner = new JSpinner( new SpinnerDateModel() );
		JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm:ss");
		timeSpinner.setEditor(timeEditor);
		timeSpinner.setValue(new Date());
		JButton btnAdd = new JButton(" Add");
		btnAdd.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		btnAdd.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\add1.png"));
		btnAdd.setBackground(new Color(255, 20, 147));
		JComboBox com1 = new JComboBox();
		com1.setBounds(635, 368, 224, 30);
		contentPane.add(com1);
		/////*Ajouter Cours****/
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				test.Mail mail = new test.Mail();
				Context context;
				try {
					context = new InitialContext();
					CourseServiceRemote proxy = (CourseServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/CourseService!services.CourseServiceRemote");
					
					entity.Course course=new entity.Course();
					UserServiceRemote userServiceRemote = (UserServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/UserService!services.UserServiceRemote");
					
					
				     course.setDate(calendar.getDate());
			course.setStartingHour((timePanel1.getCalendar().getTime()));
				    // course.setStartingHour(String.valueOf(timePanel.getDisplayDigital()));
				course.setFinishingHour((timePanel.getCalendar().getTime()));
					//course.setCapacity(Integer.valueOf(text1.getText()));
				
				course.setCapacity((Integer) sp1.getValue());
					course.setCategory(text2.getText());
					course.setPrice(Float.valueOf(text3.getText()));
					Coach coach=new Coach();
				String s=(String) com1.getSelectedItem();
					coach=userServiceRemote.findCoachByEmail(s);

					Course c = new Course(calendar.getDate(), (timePanel1.getCalendar().getTime()), timePanel.getCalendar().getTime(), ((Integer) sp1.getValue()), text2.getText(), (Float.valueOf(text3.getText())), coach);
					/**********Test Coach***********/
				List<Course> courses=	proxy.findCourseByIdCoachAndDate(coach, calendar.getDate());
									/*******************************/

				if (courses.size()>=2)
				{
					JOptionPane.showMessageDialog(null, "un coach ne peut avoir que 2 cours par jour");
				}
				else
				{
				/**************Calculer le nombre de minutes entre deux heures**********/

					AddCourseServiceDelegate.doAddCourse(c);	
					table.setModel(new AdapterCourse());

					try {
						mail.sendEmail(s, "New course", "You have a new course for more information Please call the station manager " );
						JDialog dialog2 = new JDialog();
						dialog2.setAlwaysOnTop(true);	
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
					/*
					 * 
					 * 
					 for (Course x:courses)
					{
						//System.out.println(c.getFinishingHour());
						Date h2=(timePanel1.getCalendar().getTime());
						Date h1=x.getFinishingHour();
						 long minute2= (h2.getHours())*60;
								 long minute1=(h2.getHours())*60;;
						
						 long min2=(h2.getMinutes());
						 long min1=(h1.getMinutes());
						 long time2=minute2+min2;
						 long time1=minute1+min1;
						 long diff=time2-time1;
						 System.out.printf("Nombre de Minute entre %tT et %tT est\n %d Minutes", h1, h2, (diff));
						 
						 if (diff<=30){
							 JOptionPane.showMessageDialog(null, "un coach doit prendre une pause inimume de 30 minute entre 2 cours");
							
						 }
						 else {
								AddCourseServiceDelegate.doAddCourse(c);	
								table.setModel(new AdapterCourse());
							
						 }
						 
			        }
					 */
	
			
				}
					

				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			}
		});
		btnAdd.setBounds(141, 427, 142, 41);
		contentPane.add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		scrollPane.setBounds(88, 46, 744, 147);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

		        AbstractTableModel model = (AbstractTableModel)table.getModel();
			calendar.setDate((Date)(model.getValueAt(table.getSelectedRow(),4)));
				text2.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),3)));
			     text3.setText(String.valueOf(model.getValueAt(table.getSelectedRow(),5)));
			   
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnUpdateCourse = new JButton("Update");
		btnUpdateCourse.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		btnUpdateCourse.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\up.png"));
		btnUpdateCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*****Update****/
				Course coursetrow = null;
				int index = table.getSelectedRow();

				if (index != -1) {

				
				try {
					
	Context context;
					
					context = new InitialContext();
					CourseServiceRemote proxy = (CourseServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/CourseService!services.CourseServiceRemote");
					
			
					Equipement equipement=new Equipement();
					List<Course> courses = proxy.findAllCourses();
				//	Courserow = hotelmodel.hotellist.get(index);
					coursetrow=courses.get(index);
					
					Course course = proxy.findCourseById(coursetrow.getId());
				     course.setDate(calendar.getDate());
			course.setStartingHour((timePanel.getCalendar().getTime()));
		
				course.setFinishingHour((timePanel1.getCalendar().getTime()));
					
				
				course.setCapacity((Integer) sp1.getValue());
					course.setCategory(text2.getText());
					course.setPrice(Float.valueOf(text3.getText()));
			proxy.updateCourse(course);
			

			table.setModel(new AdapterCourse());
				} catch (Exception e2) {
					e2.printStackTrace();
				}

				} else {
					JOptionPane.showMessageDialog(null, "Please select a course to update");
				}
			}
		});
		btnUpdateCourse.setBounds(404, 427, 142, 41);
		contentPane.add(btnUpdateCourse);
		
		JButton btnDeleteCourse = new JButton("Delete");
		btnDeleteCourse.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
		btnDeleteCourse.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\supp.png"));
		btnDeleteCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/******Delete******/
				
				Course Courserow = null;
				int index = table.getSelectedRow();

				if (index != -1) {

				
				try {
					
	Context context;
					
					context = new InitialContext();
					CourseServiceRemote proxy = (CourseServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/CourseService!services.CourseServiceRemote");
					
					entity.Course course=new entity.Course();
					List<Course> courses = proxy.findAllCourses();
				
					Courserow=courses.get(index);
					
					Course cc = proxy.findCourseById(Courserow.getId());
			proxy.deleteCourse(cc);
			table.setModel(new AdapterCourse());
				} catch (Exception e2) {
					e2.printStackTrace();
				}

				} else {
					JOptionPane.showMessageDialog(null, "Please select a course to remove");
				}
				
				
				
			}
		});
		btnDeleteCourse.setBounds(653, 427, 150, 41);
		contentPane.add(btnDeleteCourse);
		table.setModel(new AdapterCourse());
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu menu =new Menu();
				menu.setVisible(true);
				AddCourseFrame cours =new AddCourseFrame();
				  
				cours.setVisible(false);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\fleche_209.gif"));
		button.setBounds(0, 472, 74, 37);
		contentPane.add(button);
		
		JLabel lab = new JLabel("");
		lab.setIcon(new ImageIcon("C:\\Users\\asmaa\\Desktop\\4infoS2\\PDev\\Course.png"));
		lab.setBounds(0, 0, 907, 501);
		contentPane.add(lab);
		
		
		Context context;
try {
	context = new InitialContext();
	UserServiceRemote proxy = (UserServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/UserService!services.UserServiceRemote");
	
	//entity.Coach coach=new entity.Coach();
	List<Coach> coachs= proxy.findAllCoachs();
	for (int i = 0; i < coachs.size(); i++) {

//String cin =String.valueOf(coachs.get(i).getCIN());
	//	String ss  = coachs.get(i).getNom().concat("  ").concat(coachs.get(i).getPrenom().concat(" | ").concat(coachs.get(i).getEmail()));
		com1.addItem(coachs.get(i).getEmail());

	}
	
} catch (Exception e) {
	e.printStackTrace();
}
		
		

		

	}
}
