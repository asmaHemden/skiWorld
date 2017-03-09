package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Administrateur
 *
 */
@Entity

public class Administrator extends User implements Serializable {
	@OneToMany (mappedBy=("Admin"))
	private List<StationChief> chiefs;
	@OneToMany (mappedBy=("Admin"))
	private List<Restaurant> restaurants; 
	@OneToMany (mappedBy=("Admin"))
	private List<Hotel> hotels ; 
	@OneToMany (mappedBy=("Admin"))
	private List<SkiTransport> transports  ; 
	@OneToMany (mappedBy=("Admin"))
	private List<Competition> compitions   ; 
	private static final long serialVersionUID = 1L;

	public Administrator() {
		super();
	}
   
}
