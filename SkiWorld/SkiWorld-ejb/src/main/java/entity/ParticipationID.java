package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class ParticipationID implements Serializable{
	private Integer idCourse;
	private Integer idClient;
	private Date dateOfParticipation;
	public ParticipationID() {
		// TODO Auto-generated constructor stub
	}
	public ParticipationID(Integer idCourse, Integer idClient, Date dateOfParticipation) {
		super();
		this.idCourse = idCourse;
		this.idClient = idClient;
		this.dateOfParticipation = dateOfParticipation;
	}
	public Integer getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(Integer idCourse) {
		this.idCourse = idCourse;
	}
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public Date getDateOfParticipation() {
		return dateOfParticipation;
	}
	public void setDateOfParticipation(Date dateOfParticipation) {
		this.dateOfParticipation = dateOfParticipation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfParticipation == null) ? 0 : dateOfParticipation.hashCode());
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result + ((idCourse == null) ? 0 : idCourse.hashCode());
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
		ParticipationID other = (ParticipationID) obj;
		if (dateOfParticipation == null) {
			if (other.dateOfParticipation != null)
				return false;
		} else if (!dateOfParticipation.equals(other.dateOfParticipation))
			return false;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (idCourse == null) {
			if (other.idCourse != null)
				return false;
		} else if (!idCourse.equals(other.idCourse))
			return false;
		return true;
	}
	

}
