package com.adaming.myapp.dao.reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.*;
import com.adaming.myapp.exception.ParameterException;

public class DaoReservation implements IdaoReservation {

	Logger log = Logger.getLogger("DaoReservation");
	@PersistenceContext
	private EntityManager em;

	@Override
	public Reservation addReservation(Reservation r, Long idC, Long idCh) throws ParameterException {
		Client c = em.find(Client.class, idC);
		if(c==null)
		{
			throw new ParameterException("Le client referee n'existe pas.");
		}
		r.setPersonne(c);
		Chambre ch = em.find(Chambre.class, idCh);
		if(ch==null)
		{
			throw new ParameterException("La chambre referee n'existe pas.");
		}
		r.setChambre(ch);
		for(Reservation rr:ch.getReserv())
		{
			if(rr.getDateArrivee().before(r.getDateArrivee()) && rr.getDateSortie().after(r.getDateArrivee())|| 
					rr.getDateArrivee().before(r.getDateSortie()) && rr.getDateSortie().after(r.getDateSortie())||
					rr.getDateArrivee().after(r.getDateArrivee()) && rr.getDateSortie().before(r.getDateSortie())||
					rr.getDateArrivee().before(r.getDateSortie()) && rr.getDateSortie().after(r.getDateArrivee()))
			{
				throw new ParameterException("La chambre a deja ete reservee pour cette date");
			}
		}
		em.persist(r);
		log.info("La reservation " + r.getIdReservation()
				+ " a bien ete enregistre .");
		return r;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getReservations(Long idC) throws ParameterException {
		if(em.find(Client.class, idC)==null)
		{
			throw new ParameterException("Le client referee n'existe pas.");
		}
		Query req = em.createQuery("from Reservation where idPersonne=:idC");
		req.setParameter("idC", idC);
		log.info("Il existe une liste de " + req.getResultList().size()
				+ " de Reservations");
		return req.getResultList();
	}

	@Override
	public Reservation deleteReservation(Long idR) throws ParameterException {
		Reservation r = em.find(Reservation.class, idR);
		if(r==null)
		{
			throw new ParameterException("La reservation referee n'existe pas.");
		}
		em.remove(r);
		log.info("La reservation "+r.getIdReservation() +" a bien ete supprime.");
		return r;
	}

	@Override
	public Reservation updateReservation(Reservation r) throws ParameterException {
		if(r.getIdReservation()==null)
		{
			throw new ParameterException("La reservation referee n'existe pas.");
		}
		em.merge(r);
		log.info("La reservation "+r.getIdReservation()+ " a bien ete modifie.");
		return r;
	}

	@Override
	public Double getTotalCostReservation(Long idR) throws ParameterException {
		Reservation r = em.find(Reservation.class, idR);
		if(r==null)
		{
			throw new ParameterException("La reservation referee n'existe pas.");
		}
		Double total = r.getChambre().getPrix();
		if(!(r.getConsom().equals(null)))
		{
			for(Consommation co:r.getConsom())
			{
				total=(co.getProduit().getPrixProduit()*co.getQuantiteConsommee())+total;
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
			if(!(r.getConsom().equals(null)))
			{
				for(Consommation co:r.getConsom())
				{
					total=(co.getProduit().getPrixProduit()*co.getQuantiteConsommee())+total;
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
					if(p.getQuantiteProduite()<0)
					{
						p.setQuantiteProduite(0);
					}
				}
			}
		}

		return ptab;
	}
	
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Produit> getStock() {
//		Query req = em.createQuery("p.quantiteProduite-c.quantiteConsommee as stock from Produit p, Consommation c");
//		List<Produit> ptab = req.getResultList();
//
//		return ptab;
//	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getReservationParResa(Long idR) throws ParameterException {
		if(em.find(Reservation.class, idR)==null)
		{
			throw new ParameterException("La reservation referee n'existe pas.");
		}
		Query req = em.createQuery("from Reservation where idReservation=:idR");
		req.setParameter("idR", idR);
		log.info("La réservation " +idR+ " a bien été récupéré!");
		return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getReservationParChambre(Long idCh) throws ParameterException {
		if(em.find(Chambre.class, idCh)==null)
		{
			throw new ParameterException("La chambre referee n'existe pas.");
		}
		Query req = em.createQuery("from Reservation where idChambre=:idCh");
		req.setParameter("idCh", idCh);
		log.info("La réservation de la chambre " +idCh+ " a bien été récupéré! et il y a "+req.getResultList().size()+" réservation sur cette chambre!");
		return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> getReservationParHotel(Long idH) throws ParameterException {
		if(em.find(Hotel.class, idH)==null)
		{
			throw new ParameterException("L'hotel referee n'existe pas.");
		}
		Query req = em.createQuery("from Reservation");
		List<Reservation> tab = req.getResultList();
		List<Reservation> tabH = new ArrayList<Reservation>();
		for(Reservation r:tab)
		{
			if(r.getChambre().getHotel().getIdHotel()==idH)
			{
				tabH.add(r);
			}
		}
		return tabH;
	}

}
