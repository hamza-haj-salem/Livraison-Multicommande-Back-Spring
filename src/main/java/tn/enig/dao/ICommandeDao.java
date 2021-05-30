package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.Client;
import tn.enig.model.Commande;
import tn.enig.model.LigneCommande;
import tn.enig.model.Produit;

@Repository
public interface ICommandeDao extends JpaRepository<Commande, Integer> {
	public Commande findByIdCommande (int idCommande);
	
	@Query("select c.ligneCommande from Commande c where c.client.id=?1") 
	public List<LigneCommande> getListLigneCommandeCommandeeByClient(int idCl);
	
	
	
	@Query("select c from Commande c where c.client.id=?1") 
	public Commande getCommandeByClient(int idCl);
	
	public Commande findCommandeByIdCommande(int idCommande);
	
	
	
	

}
