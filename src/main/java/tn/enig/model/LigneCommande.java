package tn.enig.model;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class LigneCommande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLigneCommande;
	
	@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;
	
    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;
    
    private int quantite;
    
    private float prixParQuantite;

	public LigneCommande() {
		super();
	}

	public LigneCommande(Integer idLigneCommande, Commande commande, Produit produit, int quantite, float prixParQuantite) {
		super();
		this.idLigneCommande = idLigneCommande;
		this.commande = commande;
		this.produit = produit;
		this.quantite = quantite;
		this.prixParQuantite = prixParQuantite;
	}
	
	public Integer getIdLigneCommande() {
		return idLigneCommande;
	}

	public void setIdLigneCommande(Integer idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getPrixParQuantite() {
		return prixParQuantite;
	}

	public void setPrixParQuantite(float prixParQuantite) {
		this.prixParQuantite = prixParQuantite;
	}
	
	
	
    
	
	

}
