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
		Personne client = em.find(Personne.class, idC);
		r.setPersonne(client);
		Chambre ch = em.find(Chambre.class, idCh);
		r.setChambre(ch);
		Produit p = em.find(Produit.class, idP);
		Consommation co = new Consommation(1);
		co.setProduit(p);
		co.getPersonne().add(client);
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
		Reservation r = em.find(Reservation.class, idR);
		Double total = r.getChambre().getPrix();
		for(Consommation co:r.getConsom())
		{
			for(int i=0;i<co.getQuantiteConsommee();i++)
			{
				total=co.getProduit().getPrixProduit()+total;
			}
		}
		return total;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Double getTotalCostReservations() {
		Query req = em.createQuery("from Reservation");
		List<Reservation> tab = req.getResultList();
		Double total = 0.0;
		for(Reservation r:tab)
		{
			total = r.getChambre().getPrix()+total;
			for(Consommation co:r.getConsom())
			{
				for(int i=0;i<co.getQuantiteConsommee();i++)
				{
					total=co.getProduit().getPrixProduit()+total;
				}
			}
		}
		return total;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> getStockProduit() {
		Query req = em.createQuery("from Produit");
		List<Produit> ptab = req.getResultList();
		req = em.createQuery("from Consommation");
		List<Consommation> ctab = req.getResultList();
		for(Produit p:ptab)
		{
			for(Consommation c:ctab)
			{
				if(c.getProduit()==p)
				{
					p.setQuantiteProduite(c.getProduit().getQuantiteProduite()-c.getQuantiteConsommee());
				}
			}
		}

		return ptab;
	}

}
