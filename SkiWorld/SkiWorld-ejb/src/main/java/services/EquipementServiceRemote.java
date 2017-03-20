package services;

import java.util.List;

import javax.ejb.Remote;

import entity.Course;
import entity.Equipement;

@Remote
public interface EquipementServiceRemote {
	void addEquipement (Equipement equipement);
	List<Equipement>findAllEquipements();
	void deleteEquipement(Equipement equipement);
	void updateEquipement(Equipement equipement);
	Equipement findEquipementById(Integer id);
}
