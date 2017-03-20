package test;

import java.util.List;

import entity.Course;
import entity.Equipement;
import services.CourseServiceRemote;
import services.EquipementServiceRemote;

public class AffichageEquipementDelegate {

	private static final String JNDI = "SkiWorld-ear/SkiWorld-ejb/EquipementService!services.EquipementServiceRemote"; 


	private static EquipementServiceRemote getProxy() {
		return (EquipementServiceRemote) ServiceLocator.getInstance().getProxy(JNDI);
	}

	public static List<Equipement> display() {
		return getProxy().findAllEquipements();
	}
}
