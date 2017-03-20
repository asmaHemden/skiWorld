package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.Coach;
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
@Override
public Coach findCoachById(Integer id) {
	// TODO Auto-generated method stub
	return em.find(Coach.class, id);
}
@Override
public List<Coach> findAllCoachs() {
	// TODO Auto-generated method stub
	return em.createQuery("select c from User c ").getResultList();
}
@Override
public void deleteCoach(Coach coach) {
	em.remove(em.merge(coach));

	
}
@Override
public void updateCoach(Coach coach) {
	em.merge(coach);
	
}
@Override
public Boolean saveOrUpdateUser(User user) {
	Boolean b = false;
	try {
		em.merge(user);
		b = true;
	} catch (Exception e) {

		System.err.println("problem in subscription ...");
	}
	return b;
}
@Override
public Coach findCoachByEmail(String email) {
	// TODO Auto-generated method stub
	Query query= em.createQuery("select c from User c where c.email=:email");
	query.setParameter("email", email);
	Coach coach=(Coach)query.getSingleResult();
	return coach;
}
	

    
}
