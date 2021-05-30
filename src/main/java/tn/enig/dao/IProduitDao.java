package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.Categorie;
import tn.enig.model.Produit;
import tn.enig.model.SousCategorie;

@Repository
public interface IProduitDao extends JpaRepository<Produit, Integer> {
	public List <Produit> findBytitreLike (String titre);
	public List <Produit> findBynatureLike (String nature);
	public List <Produit> findByprixBetween (float prixMin,float prixMax);
	
	@Query("select p from Produit p where p.sousCategorie.id=?1") 
	public List<Produit> getProduitByIdSousCategorie(Integer id);
	
	@Query("select p from Produit p where p.sousCategorie.titre=?1") 
	public List<Produit> getProduitByTitreSousCategorie(String titreSousCat);
	
	
}
