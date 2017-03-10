package services;

import javax.ejb.Remote;

import entity.Course;
import entity.SkiStation;

@Remote
public interface StationServiceRemote {
	void addStation (SkiStation station);
	public SkiStation findStationById(Integer id) ;
	public void deleteStationById(Integer id);
}
