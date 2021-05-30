package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.Categorie;
import tn.enig.model.SousCategorie;

@Repository
public interface ICategorieDao extends JpaRepository<Categorie, Integer>{
	@Query("select c from Categorie c where c.titre=?1") 
	public Categorie getCategorieByTitre(String titre);
	
}
