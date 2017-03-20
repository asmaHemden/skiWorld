package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.CourseServiceRemote;

public class TestCourseAdd {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		Context context;
	
			context = new InitialContext();
			CourseServiceRemote proxy = (CourseServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/CourseService!services.CourseServiceRemote");
			
			entity.Course course=new entity.Course();
			//course.setDate(2012-02-12);
			course.setCategory("asma");
			proxy.addCourse(course);

	}

}
