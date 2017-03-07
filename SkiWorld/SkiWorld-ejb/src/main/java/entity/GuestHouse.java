package entity;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: GuestHouse
 *
 */
@Entity

public class GuestHouse implements Serializable {

	   
	@Id
	private Integer id;
	private long latitude;
	private long longitude;
	private Integer NbrRoom;
	private static final long serialVersionUID = 1L;

	public GuestHouse() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	public Integer getNbrRoom() {
		return this.NbrRoom;
	}

	public void setNbrRoom(Integer NbrRoom) {
		this.NbrRoom = NbrRoom;
	}
   
}
