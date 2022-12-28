//package org.mycompany.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//
//public class NumCandidat {
//	
//	private int number;
//	private List<InfosCandidat> listeInfosCandidats = new ArrayList<>();
//	
//	
//	public NumCandidat() {
//		super();
//	}
//
//
//	public NumCandidat(int number, List<InfosCandidat> listeInfosCandidats) {
//		super();
//		this.number = number;
//		this.listeInfosCandidats = listeInfosCandidats;
//	}
//
//
//	public int getNumber() {
//		return number;
//	}
//
//
//	public void setNumber(int number) {
//		this.number = number;
//	}
//
//
//	public List<InfosCandidat> getListeInfosCandidats() {
//		return listeInfosCandidats;
//	}
//
//
//	public void setListeInfosCandidats(List<InfosCandidat> listeInfosCandidats) {
//		this.listeInfosCandidats = listeInfosCandidats;
//	}
//
//
//	@Override
//	public String toString() {
//		return "NumCandidat [number=" + number + ", listeInfosCandidats=" + listeInfosCandidats + "]";
//	}
//	
//	public void additem(String nom, boolean Bac, int niveauPostBac) 
//	{
//		InfosCandidat infosCandidat = new InfosCandidat();
//		infosCandidat.setNom(nom);
//		infosCandidat.setBac(Bac);
//		infosCandidat.setNiveauPostBac(niveauPostBac);
//		infosCandidat.setNumCandidat(this);
//		listeInfosCandidats.add(infosCandidat);
//	}
//	
//
//}
