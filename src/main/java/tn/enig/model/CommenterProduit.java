package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CommenterProduit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	@JoinColumn(name = "produit_id")
	private Produit produit;
	@OneToOne
	@JoinColumn(name = "client_id")
	private Client client;
	private String titre;
	private String contenu;
	private int nbrEtoile;
	
	public CommenterProduit() {
		super();
	}

	

	public CommenterProduit(Integer id, Produit produit, Client client, String titre, String contenu, int nbrEtoile) {
		super();
		this.id = id;
		this.produit = produit;
		this.client = client;
		this.titre = titre;
		this.contenu = contenu;
		this.nbrEtoile = nbrEtoile;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}



	public int getNbrEtoile() {
		return nbrEtoile;
	}



	public void setNbrEtoile(int nbrEtoile) {
		this.nbrEtoile = nbrEtoile;
	}
	
	
	
	
	

}
