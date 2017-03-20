package services;

import java.util.List;

import javax.ejb.Remote;

import entity.Coach;
import entity.User;

@Remote
public interface UserServiceRemote {

	 boolean addCoach ( User u);
	Coach findCoachById(Integer id);
	List<Coach> findAllCoachs();
	void deleteCoach(Coach coach);
	void updateCoach(Coach coach);
	Boolean saveOrUpdateUser(User user);
	Coach findCoachByEmail(String email);
}
