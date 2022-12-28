package org.mycompany.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Etudiant_University")
public class Etudiant {
	
	@Id
	private int id;
	private String nom;
	private String username;
	private String password;
	private double moyenne;
	
	public Etudiant() {
		super();
	}

	public Etudiant(int id, String nom, String username, String password, double moyenne) {
		super();
		this.id = id;
		this.nom = nom;
		this.username = username;
		this.password = password;
		this.moyenne = moyenne;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", username=" + username + ", password=" + password
				+ ", moyenne=" + moyenne + "]";
	}

	
	
	
	

}
