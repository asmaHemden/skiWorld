package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Course;
import entity.Equipement;

/**
 * Session Bean implementation class EquipementService
 */
@Stateless
@LocalBean
public class EquipementService implements EquipementServiceRemote, EquipementServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public EquipementService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addEquipement(Equipement equipement) {
		entityManager.persist(equipement);
		
	}

	@Override
	public List<Equipement> findAllEquipements() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select e from Equipement e ").getResultList();
	}

	@Override
	public void deleteEquipement(Equipement equipement) {
		entityManager.remove(entityManager.merge(equipement));
		
	}

	@Override
	public void updateEquipement(Equipement equipement) {
		entityManager.merge(equipement);
		
	}

	@Override
	public Equipement findEquipementById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Equipement.class, id);
	}

}
