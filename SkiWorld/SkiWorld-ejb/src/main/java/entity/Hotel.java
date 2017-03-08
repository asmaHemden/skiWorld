package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Hotel
 *
 */
@Entity

public class Hotel implements Serializable {

	   
	@Id
	private Integer id;
	private String label;
	private String owner;
	private long latitude;
	private long longitude;
	@ManyToOne
	private Administrator Admin;
	private static final long serialVersionUID = 1L;

	public Hotel() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}   
	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}   
	public long getLatitude() {
		return this.latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}   
	public long getLongitude() {
		return this.longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
   
}
