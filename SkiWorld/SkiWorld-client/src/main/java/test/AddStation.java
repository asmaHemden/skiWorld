package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entity.Coach;
import entity.SkiStation;
import services.StationServiceRemote;
import services.UserServiceRemote;

public class AddStation {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		Context context = null;
		try {
			context = new InitialContext();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    StationServiceRemote proxy = (StationServiceRemote) context.lookup("SkiWorld-ear/SkiWorld-ejb/StationService!services.StationServiceRemote");
	SkiStation station=new SkiStation();
	station.setId(1);
	station.setLabel("Alpe's station");
	station.setLatitude(45);
	station.setLongitude(30);
	station.setDescription("this station is really really recommented for xgames players");
	
	proxy.addStation(station);
	}

}
