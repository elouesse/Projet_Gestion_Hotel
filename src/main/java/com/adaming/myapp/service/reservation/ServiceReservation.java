package com.adaming.myapp.service.reservation;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.reservation.IdaoReservation;
import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.entities.Reservation;


@Transactional
public class ServiceReservation implements IserviceReservation {
	
	private IdaoReservation dao;
	Logger log = Logger.getLogger("ServiceReservation");
	
	public void setDao(IdaoReservation dao) {
		this.dao = dao;
		log.info("<--------------daoReservation injected------------------>");
	}

	@Override
	public Reservation addReservation(Reservation r, Long idC, Long idCh,
			Long idP) {
		return dao.addReservation(r, idC, idCh, idP);
	}

	@Override
	public List<Reservation> getReservations(Long idC) {
		return dao.getReservations(idC);
	}

	@Override
	public Reservation deleteReservation(Long idR) {
		return dao.deleteReservation(idR);
	}

	@Override
	public Reservation updateReservation(Reservation r) {
		return dao.updateReservation(r);
	}

	@Override
	public Double getTotalCostReservation(Long idR) {
		return dao.getTotalCostReservation(idR);
	}

	@Override
	public Double getTotalCostReservations() {
		return dao.getTotalCostReservations();
	}

	@Override
	public List<Produit> getStockProduit() {
		return dao.getStockProduit();
	}

}
