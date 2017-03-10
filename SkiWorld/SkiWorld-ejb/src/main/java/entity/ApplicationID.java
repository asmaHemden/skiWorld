package entity;

import java.util.Date;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class ApplicationID implements Serializable{
	private Integer idCompetition;
	private Integer idClient;
	@Temporal(TemporalType.DATE)
	private Date dateOfApplication;
	public ApplicationID() {
		// TODO Auto-generated constructor stub
	}
	public ApplicationID(Integer idCompetition, Integer idClient, Date dateOfApplication) {
		super();
		this.idCompetition = idCompetition;
		this.idClient = idClient;
		this.dateOfApplication = dateOfApplication;
	}
	public Integer getIdCompetition() {
		return idCompetition;
	}
	public void setIdCompetition(Integer idCompetition) {
		this.idCompetition = idCompetition;
	}
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public Date getDateOfApplication() {
		return dateOfApplication;
	}
	public void setDateOfApplication(Date dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfApplication == null) ? 0 : dateOfApplication.hashCode());
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result + ((idCompetition == null) ? 0 : idCompetition.hashCode());
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
		ApplicationID other = (ApplicationID) obj;
		if (dateOfApplication == null) {
			if (other.dateOfApplication != null)
				return false;
		} else if (!dateOfApplication.equals(other.dateOfApplication))
			return false;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (idCompetition == null) {
			if (other.idCompetition != null)
				return false;
		} else if (!idCompetition.equals(other.idCompetition))
			return false;
		return true;
	}
	

}
