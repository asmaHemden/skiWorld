package services;

import javax.ejb.Remote;

import entity.User;

@Remote
public interface UserServiceRemote {

	 boolean addCoach ( User u);
}
