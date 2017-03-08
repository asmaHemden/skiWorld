package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Equipement
 *
 */
@Entity

public class Equipement implements Serializable {

	   
	@Id
	private Integer id;
	private String liscense;
	private String label;
	private String gender;
	private Integer size;
	private String color;
	private float price;
	@ManyToOne
	private StationChief chief;
	@ManyToMany
	private List<Booking>books;
	private static final long serialVersionUID = 1L;

	public Equipement() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getLiscense() {
		return this.liscense;
	}

	public void setLiscense(String liscense) {
		this.liscense = liscense;
	}   
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}   
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}   
	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}   
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}   
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
   
}
