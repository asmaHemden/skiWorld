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

public class Application implements Serializable {
	@EmbeddedId
	private ApplicationID applictionid;
	
	private Date date;
	@ManyToOne
	@JoinColumn(name = "idcompitition", referencedColumnName = "id", updatable = false, insertable = false)
	private Competition competition;
	
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
