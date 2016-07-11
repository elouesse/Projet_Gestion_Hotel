package com.adaming.myapp.service.hotel;

import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.hotel.IdaoHotel;


@Transactional
public class ServiceHotel implements IserviceHotel {
	
	private IdaoHotel dao;
	Logger log = Logger.getLogger("ServiceHotel");
	
	public void setDao(IdaoHotel dao) {
		this.dao = dao;
		log.info("<--------------daoHotel injected------------------>");
	}

}
