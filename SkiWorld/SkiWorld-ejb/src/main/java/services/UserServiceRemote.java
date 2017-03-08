package services;

import javax.ejb.Remote;

import entity.User;

@Remote
public interface UserServiceRemote {

	public void addCoach ( User u);
}
