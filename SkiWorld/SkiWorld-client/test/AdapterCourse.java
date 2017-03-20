package test;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import entity.Course;

public class AdapterCourse extends AbstractTableModel{

	 String[] headers={"StartingHour","FinishingHour","capacity","category","date","price"};
	    List<Course> Cours = new ArrayList<>();
	    public AdapterCourse() { 	 
	 	   Cours =  AffichageCourseDelegate.display();
		     System.out.println("ok"+Cours);
	        
		} 
	        
	       
	  
	public int getColumnCount() {
		  return headers.length;
	}

	public int getRowCount() {
		 return Cours.size();
	}

 public String getColumnName(int i ){
     return headers[i];
 }
	public Object getValueAt(int rowIndex, int columnIndex) {
		 switch (columnIndex) {
     
     

     case 0:
    	 return Cours.get(rowIndex).getStartingHour();
         
     case 1:
         
    	 return Cours.get(rowIndex).getFinishingHour();
      case 2:
         return Cours.get(rowIndex).getCapacity();
      case 3:
          return Cours.get(rowIndex).getCategory();
      case 4:
          return Cours.get(rowIndex).getDate();
      case 5:
          return Cours.get(rowIndex).getPrice();
      
  
     default:
         return null;
}

	}
}
