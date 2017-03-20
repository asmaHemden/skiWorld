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
//coach.setId(8);

coach.setNom("ines");
coach.setPrenom("wanen");
coach.setCIN(123456);
coach.setEmail("asmaa@gmail.cim");
coach.setPasswold("loaol");
coach.setSalary(12532);
//UserServiceRemote
proxy.addCoach(coach);


//subscriptionServiceRemote.addUser(student);

	}

}
