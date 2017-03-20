package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Course
 *
 */
@Entity

public class Course implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Temporal (TemporalType.DATE)
	private Date date;
	@Temporal (TemporalType.TIME)
	private Date StartingHour;
	@Temporal (TemporalType.TIME)
	private Date FinishingHour;
	private Integer capacity;
	private String category;
	private Float price;
	@ManyToOne(cascade=CascadeType.MERGE)
	private Coach coach;
	@ManyToOne
	private StationChief chief;
	@OneToMany(mappedBy="course")
	private List<Participation>participations;
	private static final long serialVersionUID = 1L;

	public Course() {
		super();
	}   
	
	
	public Course(Date date, Date startingHour, Date finishingHour, Integer capacity, String category, Float price,
			Coach coach) {
		super();
		this.date = date;
		StartingHour = startingHour;
		FinishingHour = finishingHour;
		this.capacity = capacity;
		this.category = category;
		this.price = price;
		this.coach = coach;
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getStartingHour() {
		return StartingHour;
	}
	public void setStartingHour(Date startingHour) {
		StartingHour = startingHour;
	}
	public Date getFinishingHour() {
		return FinishingHour;
	}
	public void setFinishingHour(Date finishingHour) {
		FinishingHour = finishingHour;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public List<Participation> getParticipations() {
		return participations;
	}
	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public StationChief getChief() {
		return chief;
	}
	public void setChief(StationChief chief) {
		this.chief = chief;
	}
	
   
}
