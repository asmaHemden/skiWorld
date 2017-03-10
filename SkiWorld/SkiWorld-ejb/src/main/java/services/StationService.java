package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.SkiStation;

/**
 * Session Bean implementation class StationService
 */
@Stateless
@LocalBean
public class StationService implements StationServiceRemote, StationServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public StationService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addStation(SkiStation station) {
		
		entityManager.persist(station);
	}

	@Override
	public SkiStation findStationById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(SkiStation.class, id);
	}
	@Override
	public void deleteStationById(Integer id) {
     
		entityManager.remove(findStationById(id));
	}


	

	
}
