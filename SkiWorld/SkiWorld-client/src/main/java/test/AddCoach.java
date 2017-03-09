package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entity.Coach;
import services.UserServiceRemote;

public class AddCoach {

	public static void main(String[] args) throws NamingException{
		// TODO Auto-generated method stub
		Context context =new InitialContext();

	UserServiceRemote proxy = (UserServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/UserService!services.UserServiceRemote");
Coach coach=new Coach();
coach.setId(5);
coach.setNom("asma");
coach.setPrenom("new");
coach.setEmail("asma@gmail.cim");
coach.setPasswold("lool");
coach.setSalary(1253);
//UserServiceRemote
proxy.addCoach(coach);


//subscriptionServiceRemote.addUser(student);

	}

}
