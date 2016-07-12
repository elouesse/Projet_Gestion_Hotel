package com.adaming.myapp.service.paiement;

import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.paiement.IdaoPaiement;
import com.adaming.myapp.entities.Paiement;
/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Transactional
public class ServicePaiement implements IservicePaiement {
	
	private IdaoPaiement dao;
	Logger log = Logger.getLogger("ServicePaiement");
	
	public void setDao(IdaoPaiement dao) {
		this.dao = dao;
		log.info("<--------------daoPaiement injected------------------>");
	}

	@Override
	public Paiement addPaiement(Paiement p, Long idFacture) {
		return dao.addPaiement(p, idFacture);
	}

	@Override
	public Double getBeneficeAnnuelle(int annee) {
		
		return null;
	}

}
