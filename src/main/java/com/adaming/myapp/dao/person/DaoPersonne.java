package com.adaming.myapp.dao.person;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DaoPersonne implements IdaoPersonne {
	
	Logger log = Logger.getLogger("DaoPersonne");
	@PersistenceContext
	private EntityManager em;

}
