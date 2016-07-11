package com.adaming.myapp.dao.chambre;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Chambre;
import com.adaming.myapp.entities.Hotel;

public class DaoChambre implements IdaoChambre {

	Logger log = Logger.getLogger("DaoChambre");
	@PersistenceContext
	private EntityManager em;

	@Override
	public Chambre addChambre(Chambre ch, Long idHotel) {
		Hotel h = em.find(Hotel.class, idHotel);
		ch.setHotel(h);
		em.persist(ch);
		log.info("La chambre "+ch.getNumeroChambre() + " a bien ete enregistre dans l'hotel "+h.getNomHotel());
		return ch;
	}

	@Override
	public Chambre deleteChambre(Long idChambre) {
		Chambre ch = em.find(Chambre.class, idChambre);
		em.remove(ch);
		log.info("La chambre "+ch.getNumeroChambre() +" a bien ete supprime.");
		return ch;
	}

	@Override
	public Chambre updateChambre(Chambre ch) {
		em.merge(ch);
		log.info("La chambre "+ch.getNumeroChambre()+ " a bien ete modifie.");
		return ch;
	}

	@Override
	public Chambre getChambre(Long idChambre) {
		Chambre ch = em.find(Chambre.class, idChambre);
		log.info("La chambre "+ch.getNumeroChambre()+ " a bien ete recupere.");
		return ch;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Chambre> getChambres() {
		Query req = em.createQuery("from Chambre");
		log.info("Il existe une liste de " + req.getResultList().size()
				+ " de Chambres");
		return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Chambre> getDispoChambres() {
		Query req = em.createQuery("from Chambre where reserv is null");
		log.info("Il existe une liste de " + req.getResultList().size()
				+ " de Chambres disponibles");
		return req.getResultList();
	}

}
