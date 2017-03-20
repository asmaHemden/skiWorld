package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable 
public class ComplaintID implements Serializable {
	private Integer idStation;
	private Integer idClient;
	private Date dateOfComplaint;
	public ComplaintID() {
		// TODO Auto-generated constructor stub
	}
	public ComplaintID(Integer idStation, Integer idClient) {
		super();
		this.idStation = idStation;
		this.idClient = idClient;
		this.dateOfComplaint = dateOfComplaint;
	}
	public Integer getIdStation() {
		return idStation;
	}
	public void setIdStation(Integer idStation) {
		this.idStation = idStation;
	}
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public Date getDateOfComplaint() {
		return dateOfComplaint;
	}
	public void setDateOfComplaint(Date dateOfComplaint) {
		this.dateOfComplaint = dateOfComplaint;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfComplaint == null) ? 0 : dateOfComplaint.hashCode());
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result + ((idStation == null) ? 0 : idStation.hashCode());
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
		ComplaintID other = (ComplaintID) obj;
		if (dateOfComplaint == null) {
			if (other.dateOfComplaint != null)
				return false;
		} else if (!dateOfComplaint.equals(other.dateOfComplaint))
			return false;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (idStation == null) {
			if (other.idStation != null)
				return false;
		} else if (!idStation.equals(other.idStation))
			return false;
		return true;
	}
	
	
}
