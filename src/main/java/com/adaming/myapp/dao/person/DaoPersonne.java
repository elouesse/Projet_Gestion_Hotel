package com.adaming.myapp.dao.person;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.exception.ParameterException;

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
	public Personne addPersonne(Personne p, Long idHotel) throws ParameterException {
		Hotel h = em.find(Hotel.class, idHotel);
		if(h==null)
		{
			throw new ParameterException("L'hotel referee n'existe pas.");
		}
		p.setHotel(h);
		em.persist(p);
		log.info(p.getNomPersonne() + " a bien ete enregistre dans l'hotel "+h.getNomHotel());
		return p;
	}

	@Override
	public Personne updatePersonne(Personne p) throws ParameterException {
		if(p.getIdPersonne()==null)
		{
			throw new ParameterException("La personne referee n'existe pas.");
		}
		em.merge(p);
		log.info(p.getNomPersonne() + " a bien ete modifie.");
		return p;
	}

	@Override
	public Personne deletePersonne(Long id) throws ParameterException {
		Personne p = em.find(Personne.class, id);
		if(p==null)
		{
			throw new ParameterException("La personne referee n'existe pas.");
		}
		em.remove(p);
		log.info(p.getNomPersonne() + " a bien ete supprime.");
		return p;
	}

	@Override
	public Personne getPersonne(Long idPersonne) throws ParameterException {
		Personne p = em.find(Personne.class, idPersonne);
		if(p==null)
		{
			throw new ParameterException("La personne referee n'existe pas.");
		}
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
