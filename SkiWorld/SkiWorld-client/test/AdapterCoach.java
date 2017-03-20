package test;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import entity.Coach;
import entity.Course;
import entity.User;

public class AdapterCoach extends AbstractTableModel{

	 String[] headers={"name","last Name","CIN","Email","salary"};
	    List<Coach> Coachs = new ArrayList<>();
	    public AdapterCoach() { 	 
	 	   Coachs =  AffichageUserDelegate.display();
		     System.out.println("ok"+Coachs);
	        
		} 
	        
	       
	  
	public int getColumnCount() {
		  return headers.length;
	}

	public int getRowCount() {
		 return Coachs.size();
	}

 public String getColumnName(int i ){
     return headers[i];
 }
	public Object getValueAt(int rowIndex, int columnIndex) {
		 switch (columnIndex) {
     
     

     case 0:
         return Coachs.get(rowIndex).getNom();
     case 1:
         return Coachs.get(rowIndex).getPrenom();
    
      case 2:
         return Coachs.get(rowIndex).getCIN();
      case 3:
          return Coachs.get(rowIndex).getEmail();
      case 4:
          return Coachs.get(rowIndex).getSalary();

  
     default:
         return null;
}

	}
}
