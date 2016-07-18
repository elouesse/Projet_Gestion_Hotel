package com.adaming.myapp.dao.consommation;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Consommation;
import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.entities.Reservation;

public class DaoConsommation implements IdaoConsommation {

	Logger log = Logger.getLogger("DaoConsommation");
	@PersistenceContext
	private EntityManager em;

	@Override
	public Consommation addConsommation(Consommation co, Long idProduit,
			Long idReserv) {
		Produit pr = em.find(Produit.class, idProduit);
		co.setProduit(pr);
		Reservation r = em.find(Reservation.class, idReserv);
		co.setReserv(r);
		em.persist(co);
		log.info("La consommation de " + co.getProduit().getNomProduit()+" pour la reservation "+r.getIdReservation()
				+ " a bien ete enregistre");
		return co;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> getConsomProduit() {
		Query req = em.createQuery("idProduit,prixProduit,nomProduit,referenceProduit,quantiteProduite from Consommation c INNER JOIN Produit p ON p.idProduit=c.idProduit");
		log.info("Il existe une liste de " + req.getResultList().size()
				+ " de produits Consommes");
		return req.getResultList();
	}

}
