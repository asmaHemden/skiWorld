package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;
import javax.persistence.EmbeddedId;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Booking
 *
 */
@Entity

public class Booking implements Serializable {

	   
	@EmbeddedId 
	private BookingID bookingid;
	private String license;
	private Date StartingDate;
	private Date FinishingDate;
	private Integer NbrBooking;
	
	@ManyToOne
	@JoinColumn(name = "idequpement", referencedColumnName = "id", updatable = false, insertable = false)
	private Equipement equipement;
	
	@ManyToOne
	@JoinColumn(name = "idClient", referencedColumnName = "id", updatable = false, insertable = false)
	private Client client;

	private static final long serialVersionUID = 1L;

	public Booking() {
		super();
	}

	public Booking( String license, Date startingDate, Date finishingDate,Integer NbrBooking, Equipement equipement,
			Client client) {
		super();
		this.bookingid = new BookingID(equipement.getId(), client.getId());
		this.license = license;
		StartingDate = startingDate;
		FinishingDate = finishingDate;
		this.NbrBooking=NbrBooking;
		this.equipement = equipement;
		this.client = client;
	}

	public Integer getNbrBooking() {
		return NbrBooking;
	}

	public void setNbrBooking(Integer nbrBooking) {
		NbrBooking = nbrBooking;
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

	public Equipement getEquipement() {
		return equipement;
	}

	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}   
	
	
	
}
