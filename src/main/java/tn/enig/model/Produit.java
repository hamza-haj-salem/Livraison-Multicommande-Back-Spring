package tn.enig.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduit;
	private String titre;
	private String imageUrl;
	private String description;
	private String nature;
	private float prix;
	@ManyToOne
	@JoinColumn(name="sousCategorie_Id")
	private SousCategorie sousCategorie;
	private int stock;
	
	
	
	
	
	public Produit() {
		super();
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}



	


	

	public Produit(Integer idProduit, String titre, String imageUrl, String description, String nature, float prix,
			SousCategorie sousCategorie, int stock) {
		super();
		this.idProduit = idProduit;
		this.titre = titre;
		this.imageUrl = imageUrl;
		this.description = description;
		this.nature = nature;
		this.prix = prix;
		this.sousCategorie = sousCategorie;
		this.stock = stock;
	}

	public Integer getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public SousCategorie getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(SousCategorie sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	
	

	
	
	
	

}
