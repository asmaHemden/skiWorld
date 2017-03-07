package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.Time;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Course
 *
 */
@Entity

public class Course implements Serializable {

	   
	@Id
	private Integer id;
	private Date date;
	private Time StartingHour;
	private Time FinishingHour;
	private Integer capacity;
	private String category;
	private Float price;
	private static final long serialVersionUID = 1L;

	public Course() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Time getStartingHour() {
		return this.StartingHour;
	}

	public void setStartingHour(Time StartingHour) {
		this.StartingHour = StartingHour;
	}   
	public Time getFinishingHour() {
		return this.FinishingHour;
	}

	public void setFinishingHour(Time FinishingHour) {
		this.FinishingHour = FinishingHour;
	}   
	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}   
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
   
}
