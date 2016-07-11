package com.adaming.myapp.service.paiement;

import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.paiement.IdaoPaiement;


@Transactional
public class ServicePaiement implements IservicePaiement {
	
	private IdaoPaiement dao;
	Logger log = Logger.getLogger("ServicePaiement");
	
	public void setDao(IdaoPaiement dao) {
		this.dao = dao;
		log.info("<--------------daoPaiement injected------------------>");
	}

}
