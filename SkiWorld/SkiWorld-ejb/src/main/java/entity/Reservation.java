package entity;

import java.io.Serializable;


import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reservation
 *
 */
@Entity

public class Reservation implements Serializable {
@EmbeddedId
private ReservationID reservationID;
private String license;
private Integer NbrPlaces;
@ManyToOne
@JoinColumn(name = "idSkiTransport", referencedColumnName = "id", updatable = false, insertable = false)
private SkiTransport skitransport;

@ManyToOne
@JoinColumn(name = "idClient", referencedColumnName = "id", updatable = false, insertable = false)
private Client client;
	
	private static final long serialVersionUID = 1L;

	public Reservation() {
		super();
	}

	public Reservation(String license, Integer nbrPlaces, SkiTransport skitransport, Client client) {
		super();
		this.reservationID=new ReservationID(skitransport.getId(), client.getId());
		this.license = license;
		NbrPlaces = nbrPlaces;
		this.skitransport = skitransport;
		this.client = client;
	}

	public ReservationID getReservationID() {
		return reservationID;
	}

	public void setReservationID(ReservationID reservationID) {
		this.reservationID = reservationID;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Integer getNbrPlaces() {
		return NbrPlaces;
	}

	public void setNbrPlaces(Integer nbrPlaces) {
		NbrPlaces = nbrPlaces;
	}

	public SkiTransport getSkitransport() {
		return skitransport;
	}

	public void setSkitransport(SkiTransport skitransport) {
		this.skitransport = skitransport;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
   
}
