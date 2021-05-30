package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Produit2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	private int image_id;
	private String description;
	private String nature;
	

	
	public Produit2() {
		super();
	}

	

	public Produit2(Integer id, String titre, int image_id, String description, String nature,
			SousCategorie sousCategorie) {
		super();
		this.id = id;
		this.titre = titre;
		this.image_id = image_id;
		this.description = description;
		this.nature = nature;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getImage_id() {
		return image_id;
	}

	public void setImage_id(int image_id) {
		this.image_id = image_id;
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



	
	
	
	
	
}
