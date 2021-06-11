package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.Administrateur;
import tn.enig.model.Client;


@Repository
public interface IAdministrateurDao extends JpaRepository<Administrateur,Integer>{
	
	public Administrateur findByEmailAndMotDePasse(String email,String MotDePasse);
	public Administrateur findByEmail(String email);
	
	
	@Query("select a from Administrateur a where a.email=?1 and a.motDePasse=?2") 
	public Administrateur getAdministrateurByEmailAndMotDePasse(String email, String motDePasse);
	
	@Query("select a from Administrateur a where a.email=?1") 
	public Administrateur getAdministrateurByEmail(String email);

}
