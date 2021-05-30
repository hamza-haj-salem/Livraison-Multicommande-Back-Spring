package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.enig.model.Categorie;
import tn.enig.model.Message;
import tn.enig.model.Utilisateur;

@Repository
public interface IMessageDao extends JpaRepository<Message, Integer> {
	//DISTINCT  pour supp les doublons
	@Query("select distinct uEnv from Message m where m.uRec.id=?1") 
	public List <Utilisateur> getListUtilisateurEnCommunication(int id);
	
	@Query("select m from Message m where m.uEnv.id=?1 and m.uRec.id=?2  or m.uRec.id=?1 and m.uEnv.id=?2 order by dateEnvoi desc") 
	public List <Message> getListMessageByUtilisateur(int idUtilisateurSelect,int idUtilisateurEnCours);
	
	
	
	
	
	//public List <Message> findByOrderBydateEnvoi(;)
	
	
	

}
