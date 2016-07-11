package com.adaming.myapp.dao.paiement;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class DaoPaiement implements IdaoPaiement {
	
	Logger log = Logger.getLogger("DaoPaiement");
	@PersistenceContext
	private EntityManager em;

}
