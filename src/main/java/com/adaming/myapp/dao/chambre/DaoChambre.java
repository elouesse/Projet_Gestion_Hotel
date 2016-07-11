package com.adaming.myapp.dao.chambre;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class DaoChambre implements IdaoChambre{
	
	Logger log = Logger.getLogger("DaoChambre");
	@PersistenceContext
	private EntityManager em;

}
