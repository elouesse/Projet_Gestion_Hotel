package com.adaming.myapp.dao.hotel;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.entities.Hotel;

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
	public List<Employe> getListeDesEmployes(Long idHotel) {
		Query query = em.createQuery(" from Employe e  where personne p"); // Requete!!!!
		log.info("L'hôtel " + idHotel + " contient "
				+ query.getResultList().size() + " employés!");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> getListeDesClients(Long idHotel) {
		Query query = em.createQuery(" from Client ");
		log.info("L'hôtel " + idHotel + " contient"
				+ query.getResultList().size() + " clients!");
		return query.getResultList();
	}

}
