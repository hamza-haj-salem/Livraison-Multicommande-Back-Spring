package tn.enig.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String sujet;
	private String contenu;
	@ManyToOne
	@JoinColumn(name="u_Env_id")
	private Utilisateur uEnv;
	@ManyToOne
	@JoinColumn(name="u_Rec_id")
	private Utilisateur uRec;
	private Date dateEnvoi;
	
	public Message() {
		super();
	}

	public Message(Integer id, String sujet, String contenu, Utilisateur uEnv, Utilisateur uRec, Date dateEnvoi) {
		super();
		this.id = id;
		this.sujet = sujet;
		this.contenu = contenu;
		this.uEnv = uEnv;
		this.uRec = uRec;
		this.dateEnvoi = dateEnvoi;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Utilisateur getuEnv() {
		return uEnv;
	}

	public void setuEnv(Utilisateur uEnv) {
		this.uEnv = uEnv;
	}

	public Utilisateur getuRec() {
		return uRec;
	}

	public void setuRec(Utilisateur uRec) {
		this.uRec = uRec;
	}

	public Date getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	
	
	

}
