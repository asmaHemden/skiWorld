package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SkiStation
 *
 */
@Entity

public class SkiStation implements Serializable {

	   
	@Id
	private Integer id;
	private String label;
	private long latitude;
	private long longitude;
	private String description;
	@OneToOne (mappedBy="station")
	private StationChief chief;
	@OneToMany (mappedBy=("track"))
	private List<Track> tracks   ;
	@OneToMany (mappedBy=("compitition"))
	private List<Competition> competitions    ;
	private static final long serialVersionUID = 1L;

	public SkiStation() {
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
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
