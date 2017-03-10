package services;

import javax.ejb.Remote;

import entity.GuestHouse;

@Remote
public interface GuestHouseServicesRemote {
void addGuestHouse(GuestHouse G );
}
