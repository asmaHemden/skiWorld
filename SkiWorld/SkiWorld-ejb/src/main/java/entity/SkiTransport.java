package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SkiTransport
 *
 */
@Entity

public class SkiTransport implements Serializable {

	   
	@Id
	private Integer id;
	private String type;
	private String capacity;
	@ManyToOne
	private Administrator Admin;
	@ManyToMany
	private List<Client> clients ;
	private static final long serialVersionUID = 1L;

	public SkiTransport() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
   
}
