package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client extends User implements Serializable {

	
	private float costs;
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}   
	public float getCosts() {
		return this.costs;
	}

	public void setCosts(float costs) {
		this.costs = costs;
	}
   
}
