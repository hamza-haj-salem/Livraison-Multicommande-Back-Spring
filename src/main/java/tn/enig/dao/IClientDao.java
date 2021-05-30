package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.Client;


@Repository
public interface IClientDao extends JpaRepository<Client, Integer> {
	
	public Client findByEmailAndMotDePasse(String email,String motDePasse);
	public Client findByEmail(String email);
	
	@Query("select c from Client c where c.email=?1 and c.motDePasse=?2") 
	public Client getClientByEmailAndMotDePasse(String email, String motDePasse);
	
	@Query("select c from Client c where c.email=?1") 
	public Client getClientByEmail(String email);

}
