package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
@Embeddable
public class ContractID  implements Serializable {
	private Integer idGurstHouse;
	private Integer idClient;
	private Date dateOfContract;
	public ContractID() {
		// TODO Auto-generated constructor stub
	}
	public ContractID(Integer idGurstHouse, Integer idClient) {
		super();
		this.idGurstHouse = idGurstHouse;
		this.idClient = idClient;
		this.dateOfContract=new Date();
	}
	public Integer getIdGurstHouse() {
		return idGurstHouse;
	}
	public void setIdGurstHouse(Integer idGurstHouse) {
		this.idGurstHouse = idGurstHouse;
	}
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public Date getDateOfContract() {
		return dateOfContract;
	}
	public void setDateOfContract(Date dateOfContract) {
		this.dateOfContract = dateOfContract;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfContract == null) ? 0 : dateOfContract.hashCode());
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result + ((idGurstHouse == null) ? 0 : idGurstHouse.hashCode());
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
		ContractID other = (ContractID) obj;
		if (dateOfContract == null) {
			if (other.dateOfContract != null)
				return false;
		} else if (!dateOfContract.equals(other.dateOfContract))
			return false;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (idGurstHouse == null) {
			if (other.idGurstHouse != null)
				return false;
		} else if (!idGurstHouse.equals(other.idGurstHouse))
			return false;
		return true;
	}
	
}
