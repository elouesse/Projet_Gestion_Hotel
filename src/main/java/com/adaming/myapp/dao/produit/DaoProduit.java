package com.adaming.myapp.dao.produit;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class DaoProduit implements IdaoProduit {
	
	Logger log = Logger.getLogger("DaoProduit");
	@PersistenceContext
	private EntityManager em;

}
