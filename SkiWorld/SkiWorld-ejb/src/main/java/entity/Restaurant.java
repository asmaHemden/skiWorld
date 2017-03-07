package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Restaurant
 *
 */
@Entity

public class Restaurant implements Serializable {

	   
	@Id
	private Integer id;
	private String owner;
	private String label;
	private long latitude;
	private long longitude;
	private static final long serialVersionUID = 1L;

	public Restaurant() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}   
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
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
