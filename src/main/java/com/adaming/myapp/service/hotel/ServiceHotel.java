package com.adaming.myapp.service.hotel;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.hotel.IdaoHotel;
import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;

/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */
@Transactional
public class ServiceHotel implements IserviceHotel {
	
	private IdaoHotel dao;
	Logger log = Logger.getLogger("ServiceHotel");
	
	public void setDao(IdaoHotel dao) {
		this.dao = dao;
		log.info("<--------------daoHotel injected------------------>");
	}

	@Override
	public Hotel addHotel(Hotel h) {
		return dao.addHotel(h);
	}

	@Override
	public List<Personne> getListeDesEmployes(Long idHotel) {
		return dao.getListeDesEmployes(idHotel);
	}

	@Override
	public List<Personne> getListeDesClients(Long idHotel) {
		return dao.getListeDesClients(idHotel);
	}

	@Override
	public List<Hotel> getListeDesHotels() {
		return dao.getListeDesHotels();
	}

}
