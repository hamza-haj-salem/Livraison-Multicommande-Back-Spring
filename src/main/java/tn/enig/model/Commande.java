package tn.enig.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCommande;
	private String adresseLivraison;
	private String etat;
	private Date dateLivraison;
	private boolean archive;
	private float prixTotal;
	@OneToMany(mappedBy = "commande" , fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List <LigneCommande> ligneCommande ;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Utilisateur client;
	
	public Commande() {
		super();
	}
	
	
	
	

	public Commande(Integer idCommande, String adresseLivraison, String etat, Date dateLivraison, boolean archive,
			float prixTotal, List<LigneCommande> ligneCommande, Utilisateur client) {
		super();
		this.idCommande = idCommande;
		this.adresseLivraison = adresseLivraison;
		this.etat = etat;
		this.dateLivraison = dateLivraison;
		this.archive = archive;
		this.prixTotal = prixTotal;
		this.ligneCommande = ligneCommande;
		this.client = client;
	}





	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	
	public Utilisateur getClient() {
		return client;
	}

	public void setClient(Utilisateur client) {
		this.client = client;
	}

	public Integer getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getAdresseLivraison() {
		return adresseLivraison;
	}

	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}
	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	
	

	public List<LigneCommande> getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(List<LigneCommande> ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

	public boolean getArchive() {
		return archive;
	}

	public void setArchive(boolean archive) {
		this.archive = archive;
	}

	

	



	

	
	
	
	
	
	

	

}
