package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	private String email;
	private String passwold;
	private Integer CIN;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getPasswold() {
		return this.passwold;
	}

	public void setPasswold(String passwold) {
		this.passwold = passwold;
	}
	public Integer getCIN() {
		return CIN;
	}
	public void setCIN(Integer cIN) {
		CIN = cIN;
	}
	
	
   
}
