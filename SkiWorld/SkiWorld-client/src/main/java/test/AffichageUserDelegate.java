package test;

import java.util.List;

import entity.Coach;
import entity.Course;
import entity.User;
import services.CourseServiceRemote;
import services.UserServiceRemote;

public class AffichageUserDelegate {

	private static final String JNDI = "SkiWorld-ear/SkiWorld-ejb/UserService!services.UserServiceRemote"; 


	private static UserServiceRemote getProxy() {
		return (UserServiceRemote) ServiceLocator.getInstance().getProxy(JNDI);
	}

	public static List<Coach> display() {
		return getProxy().findAllCoachs();
	}
}
