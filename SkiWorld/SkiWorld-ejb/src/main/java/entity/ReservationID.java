package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
@Embeddable
public class ReservationID implements Serializable{
	private Integer idSkiTransport;
	private Integer idClient;
	private Date dateOfReservation;
	public ReservationID() {
		// TODO Auto-generated constructor stub
	}
	public ReservationID(Integer idSkiTransport, Integer idClient) {
		super();
		this.idSkiTransport = idSkiTransport;
		this.idClient = idClient;
		this.dateOfReservation = dateOfReservation;
	}
	public Integer getIdSkiTransport() {
		return idSkiTransport;
	}
	public void setIdSkiTransport(Integer idSkiTransport) {
		this.idSkiTransport = idSkiTransport;
	}
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public Date getDateOfReservation() {
		return dateOfReservation;
	}
	public void setDateOfReservation(Date dateOfReservation) {
		this.dateOfReservation = dateOfReservation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfReservation == null) ? 0 : dateOfReservation.hashCode());
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result + ((idSkiTransport == null) ? 0 : idSkiTransport.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservationID other = (ReservationID) obj;
		if (dateOfReservation == null) {
			if (other.dateOfReservation != null)
				return false;
		} else if (!dateOfReservation.equals(other.dateOfReservation))
			return false;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (idSkiTransport == null) {
			if (other.idSkiTransport != null)
				return false;
		} else if (!idSkiTransport.equals(other.idSkiTransport))
			return false;
		return true;
	}
	
	
}
