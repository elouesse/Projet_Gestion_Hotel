package com.adaming.myapp.dao.paiement;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import javax.persistence.Query;

import com.adaming.myapp.entities.Facture;
import com.adaming.myapp.entities.Paiement;

/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

public class DaoPaiement implements IdaoPaiement {
	
	Logger log = Logger.getLogger("DaoPaiement");
	@PersistenceContext
	private EntityManager em;
	@Override
	public Paiement addPaiement(Paiement p, Long idFacture) {
		Facture f = em.find(Facture.class, idFacture);
		p.setFacture(f);
		em.persist(p);
		log.info("Le paiement "+p.getIdPaiement()+" a été pris en compte pour la facture"+f.getIdFacture());
		return p;
	}
	
}
