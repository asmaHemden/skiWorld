package services;

import javax.ejb.Local;

import entity.User;

@Local
public interface UserServiceLocal {

	 boolean addCoach ( User u);
}
