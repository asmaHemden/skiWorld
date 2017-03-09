package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contract
 *
 */
@Entity

public class Contract implements Serializable {
@EmbeddedId
	private ContractID contractID;
private String license;
private Date StartingDate;
private Date FinishingDate;
private Integer NbrRoom;
@ManyToOne
@JoinColumn(name = "idGuestHouse", referencedColumnName = "id", updatable = false, insertable = false)
private GuestHouse guestHouse;

@ManyToOne
@JoinColumn(name = "idClient", referencedColumnName = "id", updatable = false, insertable = false)
private Client client;

	private static final long serialVersionUID = 1L;

	public Contract() {
		super();
	}

	public Contract( String license, Date startingDate, Date finishingDate, Integer nbrRoom,
			GuestHouse guestHouse, Client client) {
		super();
		this.contractID = new ContractID(guestHouse.getId(), client.getId());
		this.license = license;
		StartingDate = startingDate;
		FinishingDate = finishingDate;
		NbrRoom = nbrRoom;
		this.guestHouse = guestHouse;
		this.client = client;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Date getStartingDate() {
		return StartingDate;
	}

	public void setStartingDate(Date startingDate) {
		StartingDate = startingDate;
	}

	public Date getFinishingDate() {
		return FinishingDate;
	}

	public void setFinishingDate(Date finishingDate) {
		FinishingDate = finishingDate;
	}

	public Integer getNbrRoom() {
		return NbrRoom;
	}

	public void setNbrRoom(Integer nbrRoom) {
		NbrRoom = nbrRoom;
	}

	public GuestHouse getGuestHouse() {
		return guestHouse;
	}

	public void setGuestHouse(GuestHouse guestHouse) {
		this.guestHouse = guestHouse;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
   
}
