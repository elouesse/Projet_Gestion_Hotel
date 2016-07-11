package com.adaming.myapp.service.consommation;

import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.consommation.IdaoConsommation;


@Transactional
public class ServiceConsommation implements IserviceConsommation {
	
	private IdaoConsommation dao;
	Logger log = Logger.getLogger("ServiceConsommation");
	
	public void setDao(IdaoConsommation dao) {
		this.dao = dao;
		log.info("<--------------daoConsommation injected------------------>");
	}

}
