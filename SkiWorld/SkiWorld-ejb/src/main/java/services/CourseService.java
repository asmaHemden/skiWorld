package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Course;

/**
 * Session Bean implementation class CourseService
 */
@Stateless
@LocalBean
public class CourseService implements CourseServiceRemote, CourseServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public CourseService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		entityManager.persist(course);
	}

}
