package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import entity.GuestHouse;
import services.GuestHouseServicesRemote;



public class addGuest {

	public static void main(String[] args) throws NamingException{
		// TODO Auto-generated method stub
		Context context =new InitialContext();
		GuestHouseServicesRemote proxy = (GuestHouseServicesRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/GuestHouseServices!services.GuestHouseServicesRemote");
GuestHouse G = new GuestHouse();
G.setNbrRoom(5);
G.setLongitude(555555555);
G.setLatitude(8888);
G.setPrice(500);
G.setDescription("maison bien équipé ");
proxy.addGuestHouse(G);

	}

}
