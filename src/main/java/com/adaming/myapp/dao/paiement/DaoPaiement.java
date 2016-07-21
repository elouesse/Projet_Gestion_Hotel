package com.adaming.myapp.dao.paiement;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;

import com.adaming.myapp.entities.Facture;
import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Paiement;
import com.adaming.myapp.exception.ParameterException;

/**
 * Nom Classe: Idaoproduit
 * 
 * @author Eli, Thierry Version: 1.0 Date: 11/07/2016
 *
 */

public class DaoPaiement implements IdaoPaiement {

	Logger log = Logger.getLogger("DaoPaiement");
	@PersistenceContext
	private EntityManager em;

	@Override
	public Paiement addPaiement(Paiement p, Long idFacture)
			throws ParameterException {
		Facture f = em.find(Facture.class, idFacture);
		if (f == null) {
			throw new ParameterException("La facture referee n'existe pas.");
		}
		p.setFacture(f);
		em.persist(p);
		log.info("Le paiement" + p.getIdPaiement()
				+ " a été pris en compte pour la facture " + idFacture);
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paiement> getListePaiementParHotel(Long idHotel)
			throws ParameterException {
		if (em.find(Hotel.class, idHotel) == null) {
			throw new ParameterException("L'hotel referee n'existe pas.");
		}
		Query req = em.createQuery("from Paiement");
		List<Paiement> tab = req.getResultList();
		List<Paiement> tabH = new ArrayList<Paiement>();
		for (Paiement pa : tab) {
			if (pa.getFacture().getHotel().getIdHotel() == idHotel) {
				tabH.add(pa);
			}
		}
		return tabH;
	}

}
