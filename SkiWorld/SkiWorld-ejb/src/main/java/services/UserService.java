package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.User;

/**
 * Session Bean implementation class UserService
 */
@Stateless
@LocalBean
public class UserService implements UserServiceRemote, UserServiceLocal {
	@PersistenceContext
	EntityManager em ;
    /**
     * Default constructor. 
     */
    public UserService() {
        // TODO Auto-generated constructor stub
    }
@Override
	public boolean addCoach(User u) {
		// TODO Auto-generated method stub
		
	Boolean b = false;
	try {
		em.persist(u);
		b = true;
	} catch (Exception e) {

		System.err.println("problem in subscription ...");
	}
	return b;
	}

    
}
