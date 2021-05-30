package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livreur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	private String imageUrlLivreur;
	
	public Livreur() {
		super();
	}

	
	public Livreur(Integer id, String nom, String prenom, String imageUrlLivreur) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.imageUrlLivreur = imageUrlLivreur;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getImageUrlLivreur() {
		return imageUrlLivreur;
	}


	public void setImageUrlLivreur(String imageUrlLivreur) {
		this.imageUrlLivreur = imageUrlLivreur;
	}

	
	
	
	

}
