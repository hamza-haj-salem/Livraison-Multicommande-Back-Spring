package tn.enig.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("L")
public class Livreur extends Utilisateur {
	
	private String secteur;
	
	public Livreur() {
		super();
	}

	public Livreur( String secteur) {
		super();
		this.secteur = secteur;	
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}


	
	
	
	

}
