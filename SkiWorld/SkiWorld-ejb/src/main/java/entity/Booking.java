package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Booking
 *
 */
@Entity

public class Booking implements Serializable {

	   
	@Id
	private Integer id;
	private String license;
	private Date StartingDate;
	private Date FinishingDate;
	@ManyToOne
	private Client client;
	@ManyToMany
	private List<Equipement>equipements;
	@ManyToMany
	private List<SkiTransport>transports;
	
	@ManyToMany
	private List<GuestHouse>houses;
	private static final long serialVersionUID = 1L;

	public Booking() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}   
	public Date getStartingDate() {
		return this.StartingDate;
	}

	public void setStartingDate(Date StartingDate) {
		this.StartingDate = StartingDate;
	}   
	public Date getFinishingDate() {
		return this.FinishingDate;
	}

	public void setFinishingDate(Date FinishingDate) {
		this.FinishingDate = FinishingDate;
	}
   
}
