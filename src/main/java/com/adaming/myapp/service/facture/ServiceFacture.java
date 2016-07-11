package com.adaming.myapp.service.facture;

import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.facture.IdaoFacture;


@Transactional
public class ServiceFacture implements IserviceFacture {
	
	private IdaoFacture dao;
	Logger log = Logger.getLogger("ServiceFacture");
	
	public void setDao(IdaoFacture dao) {
		this.dao = dao;
		log.info("<--------------daoFacture injected------------------>");
	}

}
