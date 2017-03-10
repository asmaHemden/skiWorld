package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client extends User implements Serializable {

	
	private float costs;
	private Date BirthDate;
	private String level;
	@OneToMany(mappedBy="client")
	private List<Application> applications;
	@OneToMany(mappedBy="client")
	private List<Participation>partitipations ;
	@OneToMany(mappedBy="client")
	private List<Booking> bookings;
	@OneToMany(mappedBy="client")
	private List<Contract> contracts ;
	@OneToMany(mappedBy="client")
	private List<Reservation> reservations ;
	@OneToMany(mappedBy="client")
	private List<Complaint> complaints ;

	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}   
	public float getCosts() {
		return this.costs;
	}

	public void setCosts(float costs) {
		this.costs = costs;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
   
}
