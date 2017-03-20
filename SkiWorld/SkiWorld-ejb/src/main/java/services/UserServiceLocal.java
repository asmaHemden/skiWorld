package services;

import java.util.List;

import javax.ejb.Local;

import entity.Coach;
import entity.User;

@Local
public interface UserServiceLocal {

	 boolean addCoach ( User u);


	Coach findCoachById(Integer id);
}
