package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.EmbeddedId;

/**
 * Entity implementation class for Entity: Participation
 *
 */
@Entity

public class Participation implements Serializable {
	@EmbeddedId
	private ParticipationID participationId;
	
	private Date date;
	@ManyToOne
	@JoinColumn(name = "idCourse", referencedColumnName = "id", updatable = false, insertable = false)
	private Course course;
	
	@ManyToOne
	@JoinColumn(name = "idClient", referencedColumnName = "id", updatable = false, insertable = false)
	private Client client;
	private static final long serialVersionUID = 1L;

	public Participation() {
		super();
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
   
}
