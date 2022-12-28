package org.mycompany.repository;

import java.util.List;

import org.mycompany.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Integer> {
	
	
	
	@Query (value = "select AVG(moyenne) from Etudiant_University", nativeQuery = true)
	double moyenneGenerale();

}
