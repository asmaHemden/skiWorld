package test;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import entity.Equipement;

@SuppressWarnings("serial")
public class AdapterEquipement extends AbstractTableModel{

	 String[] headers={"Label","Licence","Gander","Size","Color","price"};
	    List<Equipement> equipements = new ArrayList<>();
	    public AdapterEquipement() { 	 
	    	equipements =  AffichageEquipementDelegate.display();
		     System.out.println("ok"+equipements);
	        
		} 
	        
	       
	  
	public int getColumnCount() {
		  return headers.length;
	}

	public int getRowCount() {
		 return equipements.size();
	}

 public String getColumnName(int i ){
     return headers[i];
 }
	public Object getValueAt(int rowIndex, int columnIndex) {
		 switch (columnIndex) {
     
     

     case 0:
         return equipements.get(rowIndex).getLabel();
     case 1:
         return equipements.get(rowIndex).getLiscense();
      case 2:
         return equipements.get(rowIndex).getGender();
      case 3:
          return equipements.get(rowIndex).getSize();
      case 4:
          return equipements.get(rowIndex).getColor();
      case 5:
          return equipements.get(rowIndex).getPrice();
  
     default:
         return null;
}

	}
}
