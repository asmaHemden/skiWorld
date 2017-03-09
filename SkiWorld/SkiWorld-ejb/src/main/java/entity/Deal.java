package entity;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Deal
 *
 */
@Entity

public class Deal implements Serializable {

	   
	@Id
	private Integer id;
	private Date startingDate;
	private Date finishingDate;
	private String description;
	private Float percentage;
	private String label;
	private Integer idCourse;
	private Integer idGuestHouse;
	private Integer idEquipement;
	private Integer idStation;
	private Integer idSkiTransport;
	@ManyToOne
	private StationChief chief;
	private static final long serialVersionUID = 1L;

	public Deal() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getStartingDate() {
		return this.startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}   
	public Date getFinishingDate() {
		return this.finishingDate;
	}

	public void setFinishingDate(Date finishingDate) {
		this.finishingDate = finishingDate;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Float getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}   
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}   
	public Integer getIdCourse() {
		return this.idCourse;
	}

	public void setIdCourse(Integer idCourse) {
		this.idCourse = idCourse;
	}   
	public Integer getIdGuestHouse() {
		return this.idGuestHouse;
	}

	public void setIdGuestHouse(Integer idGuestHouse) {
		this.idGuestHouse = idGuestHouse;
	}   
	public Integer getIdEquipement() {
		return this.idEquipement;
	}

	public void setIdEquipement(Integer idEquipement) {
		this.idEquipement = idEquipement;
	}   
	public Integer getIdStation() {
		return this.idStation;
	}

	public void setIdStation(Integer idStation) {
		this.idStation = idStation;
	}   
	public Integer getIdSkiTransport() {
		return this.idSkiTransport;
	}

	public void setIdSkiTransport(Integer idSkiTransport) {
		this.idSkiTransport = idSkiTransport;
	}
   
}
