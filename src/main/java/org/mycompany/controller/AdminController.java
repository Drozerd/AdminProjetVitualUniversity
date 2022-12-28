package org.mycompany.controller;

import java.util.List;

import org.mycompany.model.Etudiant;
import org.mycompany.repository.IEtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	@Autowired
	IEtudiantRepository iEtudiantRepository;
	
	@PostMapping("/saveEtudiant")
	public boolean saveEtudiant(@RequestBody Etudiant e) 
	{
		if (e.getId() > 0) 
		{
			iEtudiantRepository.save(e);
			return true;
		}return false;
	}
	
	@GetMapping("/listEtudiant")
	public List<Etudiant> listeEtudiants()
	{
		return iEtudiantRepository.findAll();
	}
	
	@GetMapping("/getEtudiant/{id}")
	public Etudiant getEtudiant(@PathVariable int id) {
	try {
		return iEtudiantRepository.findById(id).get();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
	}
	
	@DeleteMapping("/deleteEtudiant/{id}")
	public boolean deleteEtudiant(@PathVariable int id) 
	{
		if (id != 0) {
			iEtudiantRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
	@GetMapping("/calculMoyenne")
	public double calculMoyenne() 
	{	
		return iEtudiantRepository.moyenneGenerale();
	}
}


