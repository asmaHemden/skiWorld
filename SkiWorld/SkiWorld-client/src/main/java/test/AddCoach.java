package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AddCoach {

	public static void main(String[] args) throws NamingException{
		// TODO Auto-generated method stub
		Context context =new InitialContext();

		//UserServiceRemote proxy = (UserServiceRemote)
	//	UserServiceRemote proxy = (UserServiceRemote) context.lookup("/SkiWorld-ear/SkiWorld-ejb/UserService!services.UserServiceRemote");

		// proxy.salutation("Asma");
	}

}
