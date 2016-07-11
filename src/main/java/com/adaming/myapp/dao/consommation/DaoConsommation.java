package com.adaming.myapp.dao.consommation;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class DaoConsommation implements IdaoConsommation {
	
	Logger log = Logger.getLogger("DaoConsommation");
	@PersistenceContext
	private EntityManager em;

}
