package com.adaming.myapp.dao.reservation;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.*;

public class DaoReservation implements IdaoReservation {

	Logger log = Logger.getLogger("DaoReservation");
	@PersistenceContext
	private EntityManager em;

	@Override
	public Reservation addReservation(Reservation r, Long idC, Long idCh,
			Long idP) {
		Personne c = em.find(Personne.class, idC);
		r.setPersonne(c);
		Chambre ch = em.find(Chambre.class, idCh);
		r.setChambre(ch);
		Produit p = em.find(Produit.class, idP);
		Consommation co = new Consommation(1);
		co.setProduit(p);
		r.getConsom().add(co);
		em.persist(r);
		log.info("La reservation " + r.getIdReservation()
				+ " a bien ete enregistre .");
		return r;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getReservations(Long idC) {
		Query req = em.createQuery("from Reservation where idPersonne=:idC");
		req.setParameter("idC", idC);
		log.info("Il existe une liste de " + req.getResultList().size()
				+ " de Reservations");
		return req.getResultList();
	}

	@Override
	public Reservation deleteReservation(Long idR) {
		Reservation r = em.find(Reservation.class, idR);
		em.remove(r);
		log.info("La reservation "+r.getIdReservation() +" a bien ete supprime.");
		return r;
	}

	@Override
	public Reservation updateReservation(Reservation r) {
		em.merge(r);
		log.info("La reservation "+r.getIdReservation()+ " a bien ete modifie.");
		return r;
	}

	@Override
	public Double getTotalCostReservation(Long idR) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getTotalCostReservations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Consommation> getStockProduit() {
		// TODO Auto-generated method stub
		return null;
	}

}
