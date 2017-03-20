package entity;

import java.util.Date;
import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class ApplicationID implements Serializable{
	private Integer idCompitition;
	private Integer idClient;
	private Date dateOfApplication;
	public ApplicationID() {
		// TODO Auto-generated constructor stub
	}
	public ApplicationID(Integer idCompitition, Integer idClient, Date dateOfApplication) {
		super();
		this.idCompitition = idCompitition;
		this.idClient = idClient;
		this.dateOfApplication = dateOfApplication;
	}
	public Integer getIdCompitition() {
		return idCompitition;
	}
	public void setIdCompitition(Integer idCompitition) {
		this.idCompitition = idCompitition;
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
		result = prime * result + ((idCompitition == null) ? 0 : idCompitition.hashCode());
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
		if (idCompitition == null) {
			if (other.idCompitition != null)
				return false;
		} else if (!idCompitition.equals(other.idCompitition))
			return false;
		return true;
	}

}
