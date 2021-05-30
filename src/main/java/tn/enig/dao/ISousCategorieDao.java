package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.Categorie;
import tn.enig.model.SousCategorie;

@Repository
public interface ISousCategorieDao extends JpaRepository<SousCategorie, Integer> {
	@Query("select s from SousCategorie s where s.titre=?1") 
	public SousCategorie getSousCategorieByTitre(String titre);
	
	@Query("select s.categorie from SousCategorie s where s.titre=?1") 
	public Categorie getCategorieByTitreSousCategorie(String titre); 
	
	@Query("select s from SousCategorie s where s.categorie.titre=?1") 
	public List<SousCategorie> getSousCategorieByCategorie(String titre);
	
	@Query("select s from SousCategorie s where s.categorie.id=?1") 
	public List<SousCategorie> getSousCategorieByIdCategorie(Integer id);
	
	@Query("select s.categorie from SousCategorie s where s.id=?1") 
	public Categorie getCategorieByIdSousCategorie(int id); 
	
	
	
	
	
	

}
