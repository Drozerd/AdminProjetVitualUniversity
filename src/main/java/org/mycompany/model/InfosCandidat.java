package org.mycompany.model;

public class InfosCandidat {
	
	private String nom;
	private boolean Bac;
	private int niveauPostBac;
	private NumCandidat numCandidat;
	
	

	public InfosCandidat() {
		super();
	}
	
	

	public InfosCandidat(String nom, boolean bac, int niveauPostBac, NumCandidat numCandidat) {
		super();
		this.nom = nom;
		Bac = bac;
		this.niveauPostBac = niveauPostBac;
		this.numCandidat = numCandidat;
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

	

	public NumCandidat getNumCandidat() {
		return numCandidat;
	}



	public void setNumCandidat(NumCandidat numCandidat) {
		this.numCandidat = numCandidat;
	}



	@Override
	public String toString() {
		return "InfosCandidat [nom=" + nom + ", Bac=" + Bac + ", niveauPostBac=" + niveauPostBac + ", numCandidat="
				+ numCandidat + "]";
	}



	


	
	
	
	

}
