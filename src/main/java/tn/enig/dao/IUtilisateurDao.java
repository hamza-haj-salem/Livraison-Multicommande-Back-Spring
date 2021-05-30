package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Utilisateur;

@Repository
public interface IUtilisateurDao extends JpaRepository<Utilisateur, Integer> {
	
}
