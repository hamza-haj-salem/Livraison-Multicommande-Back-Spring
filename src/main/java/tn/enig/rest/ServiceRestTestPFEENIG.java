package tn.enig.rest;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.dao.IAdministrateurDao;
import tn.enig.dao.ICategorieDao;
import tn.enig.dao.IClientDao;
import tn.enig.dao.ICommandeDao;
import tn.enig.dao.ICommenterProduitDao;
import tn.enig.dao.ILigneCommandeDao;
import tn.enig.dao.ILivreurDao;
import tn.enig.dao.IMessageDao;
import tn.enig.dao.IProduitDao;
import tn.enig.dao.ISousCategorieDao;
import tn.enig.dao.IUtilisateurDao;
import tn.enig.model.Administrateur;
import tn.enig.model.Categorie;
import tn.enig.model.Client;
import tn.enig.model.Commande;
import tn.enig.model.CommenterProduit;
import tn.enig.model.LigneCommande;
import tn.enig.model.Livreur;
import tn.enig.model.Message;
import tn.enig.model.Produit;
import tn.enig.model.SousCategorie;
import tn.enig.model.Utilisateur;
@CrossOrigin("*")
@RestController
public class ServiceRestTestPFEENIG {
	@Autowired
	private IUtilisateurDao daou;
	@Autowired
	private ILivreurDao daol;
	@Autowired
	private IMessageDao daom;
	@Autowired
	private IProduitDao daop;
	@Autowired
	private ISousCategorieDao daos;
	@Autowired
	private ICategorieDao daoc;
	@Autowired
	private IClientDao daocl;
	@Autowired
	private ICommandeDao daocmd;
	@Autowired
	private ILigneCommandeDao daolcmd;
	@Autowired
	private ICommenterProduitDao daocp;
	@Autowired
	private IAdministrateurDao daoa;
	
	
	
	
	public void setDaou(IUtilisateurDao daou) {this.daou = daou;}
	public void setDaol(ILivreurDao daol) { this.daol = daol;}
	public void setDaom(IMessageDao daom) {this.daom = daom;}
	public void setDaop(IProduitDao daop) {this.daop = daop;}
	public void setDaos(ISousCategorieDao daos) {this.daos = daos;}
	public void setDaoc(ICategorieDao daoc) {this.daoc = daoc;}
	public void setDaocl(IClientDao daocl) {this.daocl = daocl;}
	public void setDaolcmd(ILigneCommandeDao daolcmd) {this.daolcmd = daolcmd;}
	public void setDaocmd(ICommandeDao daocmd) {this.daocmd = daocmd;}
	public void setDaocp(ICommenterProduitDao daocp) {this.daocp = daocp;}
	public void setDaoa(IAdministrateurDao daoa) {this.daoa = daoa; }
	
	
	//LIVREUR
	@GetMapping("/listeLivreur")
	public  List<Livreur> fct1(){
		return daol.findAll();
	}
	@DeleteMapping("/deleteLivreur/{idLiv}")
	public void fct2(@PathVariable("idLiv") int idLiv) {
		daol.deleteById(idLiv);
	}
			// POST == PUT  
	@PostMapping("/ajouterLivreur")
	public void fct3(@RequestBody Livreur l) {
		daol.save(l);
	}
	@GetMapping("/livreurById/{idLiv}")
	public Optional<Livreur> fct4(@PathVariable("idLiv") int idLiv){
		return daol.findById(idLiv);
	}
	
	// PRODUITS
	
	@GetMapping("/listeProduits")
	public List <Produit> fct5() {
		return daop.findAll();
	}
	// POST == PUT 
	@PostMapping("/ajouterProduit")
	public void fct6(@RequestBody Produit p) {
		daop.save(p);
	}	
	@GetMapping("/ProduitById/{idProd}")
	public Optional<Produit> fct7(@PathVariable("idProd") int idProd){
		return daop.findById(idProd);
	}
	@DeleteMapping("/deleteProduit/{idProd}")
	public void fct8(@PathVariable("idProd") int idProd) {
		daop.deleteById(idProd);
	}
	@GetMapping("/listeProduitsByTitre/{tireProd}")
	public List <Produit> fc9(@PathVariable("tireProd") String tireProd) {
		return daop.findBytitreLike(tireProd);
	}
	@GetMapping("/listeProduitsByPrix/{prixMin}/{prixMax}")
	public List <Produit> fc10(@PathVariable("prixMin") float prixMin,@PathVariable("prixMax") float prixMax) {
		return daop.findByprixBetween(prixMin, prixMax);
	}
	@GetMapping("/listeProduitsByNature/{natureProd}")
	public List <Produit> fc11(@PathVariable("natureProd") String natureProd) {
		return daop.findBynatureLike(natureProd);
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/listeProduitsByTitreSousCategorie/{titreSousCat}")
	public List<Produit> fct12(@PathVariable("titreSousCat") String titreSousCat){
		List<Produit> lp = daop.getProduitByTitreSousCategorie(titreSousCat);
		return lp ;
	}
	
	//Sous Categorie   à utilisé dans le  produit
	
	@GetMapping("/listeSousCategorie")
	public List <SousCategorie> fct13() {
		return daos.findAll();
	}
	@GetMapping("/sousCategorieByTitre/{titre}")
	public SousCategorie fct14(@PathVariable("titre") String titre) {
		return daos.getSousCategorieByTitre(titre);
	}
	@GetMapping("/sousCategorieById/{idSousCategorie}")
	public Optional<SousCategorie> fct15(@PathVariable("idSousCategorie") int idSousCategorie) {
		 return daos.findById(idSousCategorie);
	}
	@DeleteMapping("/deleteSousCategorie/{idSousCategorie}")
	public void fct16(@PathVariable("idSousCategorie") int idSousCategorie) {
		List<Produit>lp=daop.getProduitByIdSousCategorie(idSousCategorie);
		for (Produit produit : lp) {
			daop.delete(produit);
		}
		 daos.deleteById (idSousCategorie);
	}
	@GetMapping("/categorieByTitreSousCategorie/{titre}")
	public Categorie fct17(@PathVariable("titre") String titre) {
		return daos.getCategorieByTitreSousCategorie(titre);
	}
	@GetMapping("/categorieByIdSousCategorie/{idSousCat}")
	public Categorie fct18(@PathVariable("idSousCat") int idSousCat) {
		return daos.getCategorieByIdSousCategorie(idSousCat);
	}
	// POST == PUT 
	@PostMapping("/ajouterSouCategorie")
	public void fct19(@RequestBody SousCategorie s) {
		daos.save(s);
	}	
	
	
	
		// CATEGORIE
	
	@GetMapping("/listeCategorie")
	public List <Categorie> fct20() {
		return daoc.findAll();
	}
	@GetMapping("/categorieById/{idCat}")
	public Optional <Categorie> fct21(@PathVariable("idCat") int idCat) {
		return daoc.findById(idCat);
	}
	//ATTENTION LA SUPPRESION DE LA CATEGORIE ENTRAINE LA SUPPRESSION DES SOUS CATEGORIE ET PRODUITS
	@DeleteMapping("/deleteCategorie/{idC}")
	public void fct22(@PathVariable("idC") int idC) {
		List <SousCategorie> ls = daos.getSousCategorieByIdCategorie(idC);
		for (SousCategorie sousCategorie : ls) {
			List<Produit>lp=daop.getProduitByIdSousCategorie(sousCategorie.getId());
			for (Produit produit : lp) {
				daop.delete(produit);
			}
			daos.delete(sousCategorie);
		}
		daoc.deleteById(idC);
	}
	// POST == PUT 
	@PostMapping("/ajouterCategorie")
	public void fct23(@RequestBody Categorie c) {
		daoc.save(c);
	}
	@GetMapping("/listesousCategorieByTitreCategorie/{titre}")
	public List <SousCategorie> fct24(@PathVariable("titre") String titre) {
		return daos.getSousCategorieByCategorie(titre);
	}
	@GetMapping("/categorieByTitre/{titreCat}")
	public Categorie fct25(@PathVariable("titreCat") String titreCat) {
		return daoc.getCategorieByTitre(titreCat);
	}
	
	
	//CLIENTS
	@GetMapping("/listeClient")
	public List <Client> fct26() {
		return daocl.findAll();
	}
	@GetMapping("/verifierCordonneesClient")
	public Client fct27(@RequestBody Client c) {
		Client c1 = null;
		c1=daocl.getClientByEmailAndMotDePasse(c.getEmail(), c.getMotDePasse());
		if(c1 !=null) {
			return c1;
		}
		else return null;
	}
	
	
	
	@GetMapping("/findClientByEmail/{emailClient}")
	public Client fct28(@PathVariable String emailClient) {
		Client c1 = null;
		Client c2 = new Client();
		c1 = daocl.findByEmail(emailClient);
		if(c1 != null ) { 
			return c1;
		}else return c2;
	}
	
	
	@DeleteMapping("/deleteClient/{idClient}")
	public void fct29(@PathVariable("idClient") int idClient) {
		daocl.deleteById(idClient);
	}
	
		//update
	@PostMapping("/ajouterClient")
	public void  fct30(@RequestBody Client c) {
		daocl.save(c);
	}

		//ARCHIVE COMMANDE
	
	@PostMapping("/ajouterArchiveCommande")
	public void  fct31(@RequestBody Commande c) {
		c.setArchive(true);
		daocmd.save(c);	
	}
	
	@GetMapping("/listeArchiveCommande")
	public List <Commande> fct32() {
		 List <Commande> lc =daocmd.findAll();
		 List <Commande> lcNonArchive = new ArrayList();
		
		 for (Commande commande : lc) {
			if(commande.getArchive()==true) {
				lcNonArchive.add(commande);
			}
		}
		 return lcNonArchive;
	}
	

	//COMMANDE

	//liste des commande qui ne sont pas encore dans l'archive
		@GetMapping("/listeCommande")
		public List <Commande> fct33() {
			 List <Commande> lc =daocmd.findAll();
			 List <Commande> lcNonArchive = new ArrayList();
			
			 for (Commande commande : lc) {
				if(commande.getArchive()==false) {
					lcNonArchive.add(commande);
				}
			}
			 return lcNonArchive;
		}
		
		//Cette meth est utilisé uniquement pour commander le produit pour la 1ere fois
		// hathi nadiha : pour creer la cmd ou pour creer une nouvelle ligne commande
		//cad pour reserver un produit pour la 1ere fois avec qte = 1
		//Si le client update sa commande le travaille est effectue sur les ligne commande
		//UTILISEE UNIQUEMENT POUR 1 SEULE PRODUIT AVEC QTE = 1
		
		//ELLE VA CREER 2 CMD POUR LA 1 ERE FOIS UNIQUEMENT
		@PostMapping("/ajouterCommande/")
		public void  fct34(@RequestBody Commande c) {
			daocmd.save(c);		
		}
		
		@PostMapping("/ajouterQuantiteLigneCommande")
		public void fct35(@RequestBody Commande c) {	
			
			List<LigneCommande> llc=c.getLigneCommande();
			float prixTotalDeCommande=0;
			for (LigneCommande ligneCommande : llc) {
				prixTotalDeCommande=prixTotalDeCommande+ligneCommande.getPrixParQuantite();
			}
			c.setPrixTotal(prixTotalDeCommande);
			
			daocmd.save(c);
			
		
		}
		
		@GetMapping("/estProduitCommandeeByClient/{idCl}/{idProd}")
		public boolean fct36(@PathVariable("idCl") int idCl,@PathVariable("idProd") int idProd) {
			List<Produit> lp= daolcmd.getProduitCommandeeByClient(idCl);
			for (Produit produit : lp) {
				if(idProd==produit.getIdProduit()) {
					return true;
				}
			}return false;
		}
		
		
		// à utiliser dans l'ajout des commandes
		@GetMapping("/getCommandeByClient/{idCl}")
		public Commande  fct37(@PathVariable("idCl") int idCl) {
			Commande c2 = new Commande();
			Commande c= daocmd.getCommandeByClient(idCl);
			if(c != null)
				return c;
			else {
				daocmd.save(c2);
			} return  c2;
			
		}
		
		// hathi juste pour modifier l etat d'une cmd (à en cours) w9t l'admin yaffectiha pour un livreur
		@PostMapping("/modifierCommande")
		public void  fct38(@RequestBody Commande c) {
			daocmd.save(c);
		}
		

		
	//LIGNE COMMANDE
		
	@DeleteMapping("/supprimerLigneCommande/{idLigneCommande}")
	public void fct39(@PathVariable("idLigneCommande") int idLigneCommande) {
		
		 daolcmd.deleteById(idLigneCommande);
	}
		
	
	
	//update
	
	
	@GetMapping("/getLigneCommandeById/{idLigneCommande}")
	public LigneCommande fct40(@PathVariable("idLigneCommande") int idLigneCommande) {
		 return daolcmd.findByIdLigneCommande(idLigneCommande);
	}
	
	
	
	
		//UTILISATEUR
	@GetMapping("/listeUtilisateur")
	public List <Utilisateur> fct41(){
		return daou.findAll();
	}
	
	@GetMapping("/UtilisateurById/{idUtilisateur}")
	public Optional<Utilisateur> fct42(@PathVariable("idUtilisateur") int idUtilisateur){
		return daou.findById(idUtilisateur);
	}
	
	
		//MESSAGE
	@GetMapping("/listeUtilisateurEnCommunication/{idUtilisateur}")
	public List <Utilisateur> fct43(@PathVariable("idUtilisateur") int idUtilisateur){
		List <Utilisateur> lu=daom.getListUtilisateurEnCommunication(idUtilisateur);
		return lu;
	}
	@GetMapping("/listeMessageByUtilisateur/{idUtilisateur}/{idUtilisateurEnCours}")
	public List <Message> fct44(@PathVariable("idUtilisateur") int idUtilisateur,@PathVariable("idUtilisateurEnCours") int idUtilisateurEnCours){
		List <Message> lu=daom.getListMessageByUtilisateur(idUtilisateur,idUtilisateurEnCours);
		return lu;
	}
	
	
	
	@PostMapping("/ajouterMessage")
	public void  fct45(@RequestBody Message m) {
		daom.save(m);	
	}
	@GetMapping("/listeMessage")
	public List <Message> fct46(){
		List <Message> lu=daom.findAll();
		return lu;
	}
	
	@GetMapping("/verifierCordonneesAdministrateur")
	public Administrateur fct47(@RequestBody Administrateur a) {
		Administrateur a1 = null;
		a1=daoa.getAdministrateurByEmailAndMotDePasse(a.getEmail(), a.getMotDePasse());
		if(a1 !=null) {
			return a1;
		}
		else return null;
	}
	
	@GetMapping("/findAdministrateurByEmail/{emailAdministrateur}")
	public Administrateur fct48(@PathVariable ("emailAdministrateur") String emailAdministrateur) {
		Administrateur a1 = null;
		Administrateur a2 = new Administrateur();
		a1 = daoa.findByEmail(emailAdministrateur);
		if(a1 != null ) { 
			return a1;
		}else return a2;
	}
	//MESSAGE : PARTIE CLIENT
	@GetMapping("/listeAdminstrateur")
	public List <Administrateur> fct49(){
		List <Administrateur> la=daoa.findAll();
		return la;
	}
	
	//	COMMETER
	
	@PostMapping("/ajouterCommenter")
	public void  fct50(@RequestBody CommenterProduit c) {
		daocp.save(c);	
	}
	@GetMapping("/listeCommentaireProduit/{idProduit}")
	public List <CommenterProduit> fct51(@PathVariable("idProduit") int idProduit){
		List <CommenterProduit> lcp=daocp.listeCommentaireProduit(idProduit);
		return lcp;
	}
	
	//FAVORIS
	@PostMapping("/ajouterFavoris/{idClient}")
	public void  fct52(@PathVariable("idClient") int idClient,@RequestBody Produit p) {
		Client c = daocl.getOne(idClient);
		
		
		//daocl.save(c);
	}
}
