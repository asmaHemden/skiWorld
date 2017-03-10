package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Competition
 *
 */
@Entity

public class Competition implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String type;
	@Temporal(TemporalType.DATE)
	private Date date;
	 private Integer capacity;
	 @Temporal(TemporalType.TIME)
       private Date StartingHour;
	   private Date FinishingHour;
	  
	@ManyToOne
	private Administrator Admin;
	@ManyToOne
	private SkiStation station;
	@OneToMany(mappedBy="competition")
	private List<Application>applications;
	
	private static final long serialVersionUID = 1L;

	public Competition() {
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
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}   
	public Date getStartingHour() {
		return this.StartingHour;
	}

	public void setStartingHour(Time StartingHour) {
		this.StartingHour = StartingHour;
	}   
	public Date getFinishingHour() {
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
   
}
