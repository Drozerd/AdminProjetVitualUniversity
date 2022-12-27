package org.mycompany.model;

public class CandidatProf {
	
	private int id;
	private String nom;
	private boolean Bac;
	private int niveauPostBac;
	
	
	public CandidatProf() {
		super();
	}


	public CandidatProf(int id, String nom, boolean bac, int niveauPostBac) {
		super();
		this.id = id;
		this.nom = nom;
		Bac = bac;
		this.niveauPostBac = niveauPostBac;
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


	public boolean isBac() {
		return Bac;
	}


	public void setBac(boolean bac) {
		Bac = bac;
	}


	public int getNiveauPostBac() {
		return niveauPostBac;
	}


	public void setNiveauPostBac(int niveauPostBac) {
		this.niveauPostBac = niveauPostBac;
	}


	@Override
	public String toString() {
		return "CandidatProf [id=" + id + ", nom=" + nom + ", Bac=" + Bac + ", niveauPostBac=" + niveauPostBac + "]";
	}
	
	
	
	

}
