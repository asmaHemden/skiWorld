package services;

import javax.ejb.Local;

import entity.Course;
import entity.SkiStation;

@Local
public interface StationServiceLocal {
	
		void addStation (SkiStation station);
		public SkiStation findStationById(Integer id) ;
		public void deleteStationById(Integer id);


}
