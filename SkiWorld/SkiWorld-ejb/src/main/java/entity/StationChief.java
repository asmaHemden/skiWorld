package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: StationChief
 *
 */
@Entity

public class StationChief extends User implements Serializable {
	@ManyToOne
	private Administrator Admin;
	@OneToMany (mappedBy=("chief"))
	private List<Course> courses   ; 
	@OneToMany (mappedBy=("chief"))
	private List<GuestHouse> houses    ; 
	@OneToMany (mappedBy=("chief"))
	private List<Equipement> equipements   ; 
	@OneToOne
	private SkiStation station;
	private static final long serialVersionUID = 1L;

	public StationChief() {
		super();
	}
   
}
