package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.LigneCommande;
import tn.enig.model.Produit;

@Repository
public interface ILigneCommandeDao extends JpaRepository<LigneCommande, Integer> {
	
	public LigneCommande findByIdLigneCommande(int idLigneCommande);
	/*public boolean delete(int id) {

        var isRemoved = this.posts.removeIf(post -> post.getId().equals(id));

        return isRemoved;
    }*/
	
	@Query("select l.produit from LigneCommande l where l.commande.client.id=?1") 
	public List<Produit> getProduitCommandeeByClient(int idCl);
	
	

}
