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
	
	public Participation(  Course course, Client client) {
		super();
		this.participationId = new ParticipationID(course.getId(), client.getId());

		this.course = course;
		this.client = client;
	}

   
}
