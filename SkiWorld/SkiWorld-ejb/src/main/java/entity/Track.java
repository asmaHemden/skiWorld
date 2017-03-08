package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Track
 *
 */
@Entity

public class Track implements Serializable {

	   
	@Id
	private Integer id;
	private String difficulty;
	private String state;
	private String lenght;
	@ManyToOne
	private SkiStation track;
	
	private static final long serialVersionUID = 1L;

	public Track() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getDifficulty() {
		return this.difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}   
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}   
	public String getLenght() {
		return this.lenght;
	}

	public void setLenght(String lenght) {
		this.lenght = lenght;
	}
   
}
