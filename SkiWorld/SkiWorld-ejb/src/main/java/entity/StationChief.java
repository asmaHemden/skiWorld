package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: StationChief
 *
 */
@Entity

public class StationChief extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public StationChief() {
		super();
	}
   
}
