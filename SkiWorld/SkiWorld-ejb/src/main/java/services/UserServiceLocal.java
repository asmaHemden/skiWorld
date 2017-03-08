package services;

import javax.ejb.Local;

import entity.User;

@Local
public interface UserServiceLocal {

	public void addCoach ( User u);
}
