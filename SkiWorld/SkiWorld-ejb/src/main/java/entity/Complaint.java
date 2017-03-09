package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Complaint
 *
 */
@Entity

public class Complaint implements Serializable {
	@EmbeddedId 
	private ComplaintID complaintID;
	private String topic;
	private String status;
	@ManyToOne
	@JoinColumn(name = "idcomplaint", referencedColumnName = "id", updatable = false, insertable = false)
	private Competition complaint;
	
	@ManyToOne
	@JoinColumn(name = "idClient", referencedColumnName = "id", updatable = false, insertable = false)
	private Client client;
	
	private static final long serialVersionUID = 1L;

	public Complaint() {
		super();
	}

	public Complaint(ComplaintID complaintID, String topic, String status, Competition complaint, Client client) {
		super();
		this.complaintID = complaintID;
		this.topic = topic;
		this.status = status;
		this.complaint = complaint;
		this.client = client;
	}

	public ComplaintID getComplaintID() {
		return complaintID;
	}

	public void setComplaintID(ComplaintID complaintID) {
		this.complaintID = complaintID;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Competition getComplaint() {
		return complaint;
	}

	public void setComplaint(Competition complaint) {
		this.complaint = complaint;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
   
}
