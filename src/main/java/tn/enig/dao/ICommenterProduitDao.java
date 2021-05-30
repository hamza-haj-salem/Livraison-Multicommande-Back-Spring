package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.CommenterProduit;
import tn.enig.model.LigneCommande;

@Repository
public interface ICommenterProduitDao extends JpaRepository<CommenterProduit, Integer> {
	
	@Query("select cp from CommenterProduit cp where cp.produit.idProduit=?1") 
	public List<CommenterProduit> listeCommentaireProduit(int idProduit);

}
