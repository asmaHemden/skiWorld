package services;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.Coach;
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

	@Override
	public List<Course> findAllCourses() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select c from Course c ").getResultList();
	}

	@Override
	public void deleteCourse(Course course) {
		entityManager.remove(entityManager.merge(course));
		
	}

	@Override
	public void updateCourse(Course course) {
		entityManager.merge(course);
		
	}

	@Override
	public List<String> FindCategory() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select c.category from Course c ").getResultList();
	}

	@Override
	public Course findCourseById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Course.class, id);
	}

	@Override
	public void saveOrUpdateCourse(Course course) {
		entityManager.merge(course);
		
	}

	@Override
	public List<Course> findCourseByIdCoachAndDate(Coach coach, Date date) {
		
		Query query= entityManager.createQuery("select c from Course c where c.coach=:coach and c.date=:date");
		query.setParameter("coach",coach).setParameter("date", date);
	
		List<Course> courses=(List<Course>)query.getResultList();
	
		return courses;
	//return null;
	}

	@Override
	public Course findCourseByCoachId(Integer coach_id) {
		return entityManager.find(Course.class, coach_id);
		//return null;
	}

}
