package com.adaming.myapp.dao.consommation;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Consommation;
import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.entities.Reservation;
import com.adaming.myapp.exception.ParameterException;
import com.adaming.myapp.exception.QuantityExceededException;

public class DaoConsommation implements IdaoConsommation {

	Logger log = Logger.getLogger("DaoConsommation");
	@PersistenceContext
	private EntityManager em;

	@Override
	public Consommation addConsommation(Consommation co, Long idProduit,
			Long idReserv) throws ParameterException, QuantityExceededException {
		Produit pr = em.find(Produit.class, idProduit);
		if(pr==null)
		{
			throw new ParameterException("Le produit referee n'existe pas.");
		}
		co.setProduit(pr);
		if(co.getQuantiteConsommee()>pr.getQuantiteProduite())
		{
			throw new QuantityExceededException("Le stock du produit n'est pas suffisant.");
		}
		co.getProduit().setQuantiteProduite(pr.getQuantiteProduite()-co.getQuantiteConsommee());
		Reservation r = em.find(Reservation.class, idReserv);
		if(r==null)
		{
			throw new ParameterException("La reservation referee n'existe pas.");
		}
		co.setReserv(r);
		em.persist(co);
		log.info("La consommation de " + co.getProduit().getNomProduit()+" pour la reservation "+r.getIdReservation()
				+ " a bien ete enregistre");
		return co;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> getConsomProduit() {
		Query req = em.createQuery("from Produit");
		List<Produit> tab = req.getResultList();
		req = em.createQuery("from Consommation");
		List<Consommation> tabC = req.getResultList();
		List<Produit> tabP = new ArrayList<Produit>();
		for(Produit p:tab)
		{
			for(Consommation co:tabC)
			{
				if(co.getProduit()==p)
				{
					tabP.add(p);
					break;
				}
			}
		}
		log.info("Il existe une liste de " + tabP.size()
				+ " de produits Consommes pour une liste de "+tab.size()+" produits");
		return tabP;
	}

}
