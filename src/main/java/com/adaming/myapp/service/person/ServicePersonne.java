package com.adaming.myapp.service.person;

import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.person.IdaoPersonne;


@Transactional
public class ServicePersonne implements IservicePersonne {
	
	private IdaoPersonne dao;
	Logger log = Logger.getLogger("ServicePersonne");
	
	public void setDao(IdaoPersonne dao) {
		this.dao = dao;
		log.info("<--------------daoPersonne injected------------------>");
	}

}
