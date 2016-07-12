package com.adaming.myapp.dao.facture;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Facture;
import com.adaming.myapp.entities.Hotel;
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
	@Override
	public Facture addFacture(Facture f,Long idReservation, Long idHotel) {
		Reservation r = em.find(Reservation.class, idReservation);
		Hotel h = em.find(Hotel.class, idHotel);
		f.getReserv().add(r);
		f.setHotel(h);
		em.persist(f);
		log.info("La facture "+f.getIdFacture()+" a bien été enregistré!");
		return f;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Facture> getListeDesFacturesParClient(Long idPersonne) {
		Query query = em.createQuery(" from Facture f");
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
