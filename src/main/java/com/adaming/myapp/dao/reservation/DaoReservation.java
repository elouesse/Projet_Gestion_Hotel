package com.adaming.myapp.dao.reservation;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class DaoReservation implements IdaoReservation {
	
	Logger log = Logger.getLogger("DaoReservation");
	@PersistenceContext
	private EntityManager em;

}
