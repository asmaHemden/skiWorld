package test;

import java.util.List;

import entity.Course;
import services.CourseServiceRemote;

public class AffichageCourseDelegate {

	private static final String JNDI = "SkiWorld-ear/SkiWorld-ejb/CourseService!services.CourseServiceRemote"; 


	private static CourseServiceRemote getProxy() {
		return (CourseServiceRemote) ServiceLocator.getInstance().getProxy(JNDI);
	}

	public static List<Course> display() {
		return getProxy().findAllCourses();
	}
}
