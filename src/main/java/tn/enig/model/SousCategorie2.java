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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class SousCategorie2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	@OneToMany(mappedBy="id")
	private List<Produit2> lp;
	
	public SousCategorie2() {
		super();
	}

	public SousCategorie2(Integer id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
		lp = new ArrayList <Produit2>();
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

	public List<Produit2> getLp() {
		return lp;
	}

	public void setLp(List<Produit2> lp) {
		this.lp = lp;
	}
	
	
}
