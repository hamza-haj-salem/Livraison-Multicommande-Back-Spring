package tn.enig.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Categorie2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	@OneToMany(mappedBy="id")
	private List<SousCategorie2> lsc ;
	
	public Categorie2() {
		super();
	}

	public Categorie2(Integer id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
		lsc = new ArrayList<SousCategorie2>();
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

	public List<SousCategorie2> getLsc() {
		return lsc;
	}

	public void setLsc(List<SousCategorie2> lsc) {
		this.lsc = lsc;
	}
	
	
	
	
}
