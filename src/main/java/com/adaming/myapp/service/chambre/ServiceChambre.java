package com.adaming.myapp.service.chambre;

import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.chambre.IdaoChambre;

@Transactional
public class ServiceChambre implements IserviceChambre {
	
	private IdaoChambre dao;
	Logger log = Logger.getLogger("ServiceChambre");
	
	public void setDao(IdaoChambre dao) {
		this.dao = dao;
		log.info("<--------------daoChambre injected------------------>");
	}
	

}
