package Delegate;

import entity.Course;
import entity.User;
import services.CourseServiceRemote;
import test.ServiceLocator;

public class AddCourseServiceDelegate {
	private static final String JNDI = "SkiWorld-ear/SkiWorld-ejb/CourseService!services.CourseServiceRemote";

	private static CourseServiceRemote getProxy() {
		return (CourseServiceRemote) ServiceLocator.getInstance().getProxy(JNDI);
	}

	/*public static Boolean doAddUser(User user) {
		return; //getProxy().saveOrUpdateUser(user);
	}*/

	public static void doAddCourse(Course course) {
		getProxy().saveOrUpdateCourse(course);
	}
}
