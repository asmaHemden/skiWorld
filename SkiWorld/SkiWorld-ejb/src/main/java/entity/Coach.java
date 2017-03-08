package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Coach
 *
 */
@Entity

public class Coach extends User implements Serializable {
   
	private float salary;
	@OneToMany (mappedBy=("coach"))
	private List<Course> courses   ; 
	private static final long serialVersionUID = 1L;

	public Coach() {
		super();
	}   
	public float getSalary() {
		return this.salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
   
}
