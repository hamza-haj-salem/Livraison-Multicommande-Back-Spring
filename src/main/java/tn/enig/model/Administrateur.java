package tn.enig.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("A")
public class Administrateur extends Utilisateur {
	
	private int idAdministrateur;
	
	
	public Administrateur() {
		super();
	}


	public Administrateur(int idAdministrateur) {
		super();
		this.idAdministrateur = idAdministrateur;
	}


	public int getIdAdministrateur() {
		return idAdministrateur;
	}


	public void setIdAdministrateur(int idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}



	


	

}
