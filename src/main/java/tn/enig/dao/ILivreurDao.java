package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Livreur;

@Repository
public interface ILivreurDao extends JpaRepository<Livreur, Integer> {

}
