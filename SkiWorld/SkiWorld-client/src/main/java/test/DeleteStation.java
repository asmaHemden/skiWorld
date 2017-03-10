package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.StationServiceRemote;

public class DeleteStation {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		Context context = null;
		try {
			context = new InitialContext();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StationServiceRemote stationServicesRemote = (StationServiceRemote) context.lookup(
			"SkiWorld-ear/SkiWorld-ejb/StationService!services.StationServiceRemote");

	stationServicesRemote.deleteStationById(1);

	}

}
