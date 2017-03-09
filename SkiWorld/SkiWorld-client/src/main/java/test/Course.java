package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.CourseServiceRemote;

public class Course {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		Context context =new InitialContext();

	CourseServiceRemote proxy = (CourseServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/CourseService!services.CourseServiceRemote");
	}

}
