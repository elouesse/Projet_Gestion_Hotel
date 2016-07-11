package com.adaming.myapp.dao.person;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Contractuel;
import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.entities.Saisonnier;

/**
 * Nom Classe: DaoPersonne
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

public class DaoPersonne implements IdaoPersonne {

	Logger log = Logger.getLogger("DaoPersonne");
	@PersistenceContext
	private EntityManager em;

	@Override
	public Personne addPersonne(Personne p, Long idHotel) {
		Hotel h = em.find(Hotel.class, idHotel);
		p.setHotel(h);
		if(Client.class.equals(true))
		{
			p = new Client();
		}
		else if(Employe.class.equals(true))
		{
			if(Contractuel.class.equals(true))
			{
				p = new Contractuel();
			}
			else if(Saisonnier.class.equals(true))
			{
				p = new Saisonnier();
			}
		}
		em.persist(p);
		log.info(p.getNomPersonne() + " a bien ete enregistre dans l'hotel "+h.getNomHotel());
		return p;
	}

	@Override
	public Personne updatePersonne(Personne p) {
		em.merge(p);
		log.info(p.getNomPersonne() + " a bien ete modifie.");
		return p;
	}

	@Override
	public Personne deletePersonne(Long id) {
		Personne p = em.find(Personne.class, id);
		em.remove(p);
		log.info(p.getNomPersonne() + " a bien ete supprime.");
		return p;
	}

	@Override
	public Personne getPersonne(Long idPersonne) {
		Personne p = em.find(Personne.class, idPersonne);
		log.info(p.getNomPersonne() + " a bien ete recupere.");
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> getPersonnes() {
		Query req = em.createQuery("from Personne");
		log.info("Il existe une liste de " + req.getResultList().size()
				+ " de Personnes");
		return req.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> getPersonneByMc(String mc) {
		Query req = em.createQuery("from Personne where nomPersonne like:mc");
		req.setParameter("mc", "%" + mc + "%");
		log.info("Il existe une liste de" + req.getResultList().size()
				+ "Personne by" + mc);
		return req.getResultList();
	}

}
