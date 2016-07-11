package com.adaming.myapp.service.reservation;

import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.reservation.IdaoReservation;


@Transactional
public class ServiceReservation implements IserviceReservation {
	
	private IdaoReservation dao;
	Logger log = Logger.getLogger("ServiceReservation");
	
	public void setDao(IdaoReservation dao) {
		this.dao = dao;
		log.info("<--------------daoReservation injected------------------>");
	}

}
