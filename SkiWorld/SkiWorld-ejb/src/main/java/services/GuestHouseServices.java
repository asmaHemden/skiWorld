package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.GuestHouse;

/**
 * Session Bean implementation class GuestHouseServices
 */
@Stateless
public class GuestHouseServices implements GuestHouseServicesRemote, GuestHouseServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public GuestHouseServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addGuestHouse(GuestHouse G) {
		entityManager.persist(G);		
	}

}
