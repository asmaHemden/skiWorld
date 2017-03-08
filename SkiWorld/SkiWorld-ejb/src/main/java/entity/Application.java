package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
/**
 * Entity implementation class for Entity: Application
 *
 */
@Entity

public class Application implements Serializable {
	@EmbeddedId
	private ParticipationID participationId;
	
	private Date date;
	@ManyToOne
	@JoinColumn(name = "idCompitition", referencedColumnName = "id", updatable = false, insertable = false)
	private Compitition compitition;
	
	@ManyToOne
	@JoinColumn(name = "idClient", referencedColumnName = "id", updatable = false, insertable = false)
	private Client client;
	private static final long serialVersionUID = 1L;

	public Application() {
		super();
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
   
}
