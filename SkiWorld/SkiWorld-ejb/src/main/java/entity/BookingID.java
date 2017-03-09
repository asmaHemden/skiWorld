package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
@Embeddable 
public class BookingID implements Serializable  {
	private Integer idEquipement;
	private Integer idClient;
	private Date dateOfBooking;
	
	public BookingID() {
		// TODO Auto-generated constructor stub
	}

	public BookingID(Integer idEquipement, Integer idClient) {
		super();
		this.idEquipement = idEquipement;
		this.idClient = idClient;
		this.dateOfBooking = dateOfBooking;
	}

	public Integer getIdEquipement() {
		return idEquipement;
	}

	public void setIdEquipement(Integer idEquipement) {
		this.idEquipement = idEquipement;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public Date getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBooking == null) ? 0 : dateOfBooking.hashCode());
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result + ((idEquipement == null) ? 0 : idEquipement.hashCode());
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
		BookingID other = (BookingID) obj;
		if (dateOfBooking == null) {
			if (other.dateOfBooking != null)
				return false;
		} else if (!dateOfBooking.equals(other.dateOfBooking))
			return false;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (idEquipement == null) {
			if (other.idEquipement != null)
				return false;
		} else if (!idEquipement.equals(other.idEquipement))
			return false;
		return true;
	}
	
}
