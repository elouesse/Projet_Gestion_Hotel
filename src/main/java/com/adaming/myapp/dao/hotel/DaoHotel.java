package com.adaming.myapp.dao.hotel;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;

/**
 * Nom Classe: Idaoproduit
 * 
 * @author Eli, Thierry Version: 1.0 Date: 11/07/2016
 *
 */

public class DaoHotel implements IdaoHotel {

	Logger log = Logger.getLogger("DaoHotel");
	@PersistenceContext
	private EntityManager em;

	@Override
	public Hotel addHotel(Hotel h) {
		em.persist(h);
		log.info("L'hotel " + h.getIdHotel() + " " + h.getNomHotel()
				+ " a bien été ajouté!");
		return h;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> getListeDesEmployes(Long idHotel) {
		Query query = em.createQuery(" from Personne p where idHotel=:x and (TYPE_PERSONNE ='saisonnier' or TYPE_PERSONNE ='contractuel') " );// Requete!!!!
		query.setParameter("x", idHotel);
		log.info("L'hôtel " + idHotel + " contient "
				+ query.getResultList().size() + " employés!");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> getListeDesClients(Long idHotel) {
		Query query = em.createQuery(" from Personne p where idHotel=:x and TYPE_PERSONNE ='client' ");
		query.setParameter("x", idHotel);
		log.info("L'hôtel " + idHotel + " contient"	+ query.getResultList().size() + " clients!");
		return query.getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Hotel> getListeDesHotels() {
		Query query = em.createQuery(" from Hotel");
		log.info("La liste des hotels a bien tété récupéré et contient "	+ query.getResultList().size() + " hotels!");
		return query.getResultList();
	}

}
