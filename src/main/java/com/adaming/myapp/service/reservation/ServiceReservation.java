package com.adaming.myapp.service.reservation;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.reservation.IdaoReservation;
import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.entities.Reservation;
import com.adaming.myapp.exception.ParameterException;


@Transactional
public class ServiceReservation implements IserviceReservation {
	
	private IdaoReservation dao;
	Logger log = Logger.getLogger("ServiceReservation");
	
	public void setDao(IdaoReservation dao) {
		this.dao = dao;
		log.info("<--------------daoReservation injected------------------>");
	}

	@Override
	public Reservation addReservation(Reservation r, Long idC, Long idCh) throws ParameterException {
		return dao.addReservation(r, idC, idCh);
	}

	@Override
	public List<Reservation> getReservations(Long idC) throws ParameterException {
		return dao.getReservations(idC);
	}

	@Override
	public Reservation deleteReservation(Long idR) throws ParameterException {
		return dao.deleteReservation(idR);
	}

	@Override
	public Reservation updateReservation(Reservation r) throws ParameterException {
		return dao.updateReservation(r);
	}

	@Override
	public Double getTotalCostReservation(Long idR) throws ParameterException {
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

	@Override
	public List<Reservation> getReservationParResa(Long idR) throws ParameterException {
		return dao.getReservationParResa(idR);
	}

	@Override
	public List<Reservation> getReservationParChambre(Long idCh) throws ParameterException {
		return dao.getReservationParChambre(idCh);
	}

	@Override
	public List<Reservation> getReservationParHotel(Long idH) throws ParameterException {
		return dao.getReservationParHotel(idH);
	}

}
