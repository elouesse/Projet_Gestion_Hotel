package com.adaming.myapp.dao.facture;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class DaoFacture implements IdaoFacture {
	
	Logger log = Logger.getLogger("DaoChambre");
	@PersistenceContext
	private EntityManager em;

}
