package com.adaming.myapp.dao.facture;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Facture;
import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.entities.Reservation;
/**
 * Nom Classe: Reservation
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

public class DaoFacture implements IdaoFacture {
	
	
	Logger log = Logger.getLogger("DaoChambre");
	@PersistenceContext
	private EntityManager em;
	
	private List<Reservation> tab;
	@Override
	public Facture addFacture(Facture f,Long idReservation, Long idHotel) {
		Reservation r = em.find(Reservation.class, idReservation);
		Hotel h = em.find(Hotel.class, idHotel);
		f.setReserv(tab);
		f.getReserv().add(r);
		f.setHotel(h);
		em.persist(f);
		log.info("La facture "+f.getIdFacture()+" a bien été enregistré!");
		return f;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Facture> getListeDesFacturesParClient(Long idPersonne) {
		/*Personne p = em.find(Personne.class, idPersonne);
		Reservation res = em.find(Reservation.class, p);
		Facture fact = em.find(Facture.class, res);*/
		Query query = em.createQuery("idFacture,dateFacturation,tva from Reservation r INNER JOIN Facture f ON r.idreservation=f.idreservation where idPersonne =:x");
		/*FROM utilisateur INNER JOIN commande ON utilisateur.id = commande.utilisateur_id*/
		query.setParameter("x", idPersonne);	
		log.info("Pour le client "+idPersonne+", la liste contient "+query.getResultList().size()+" factures");
		return query.getResultList();
	}
	@Override
	public Double coutAnnuelParClient(Long idPersonne, int annee) {	
		Double coutAnnuelParClient = null;
		
		
		return coutAnnuelParClient;
	}
	@Override
	public Double coutSemestrielParClient(Long idPersonne,int annee,int semestre) {
		Double courSemestrielParclient = null;
		
		
		return courSemestrielParclient;
	}

}
