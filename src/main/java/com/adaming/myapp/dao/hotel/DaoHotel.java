package com.adaming.myapp.dao.hotel;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class DaoHotel implements IdaoHotel {
	
	Logger log = Logger.getLogger("DaoHotel");
	@PersistenceContext
	private EntityManager em;

}
