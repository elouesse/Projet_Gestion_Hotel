package com.adaming.myapp.service.paiement;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.paiement.IdaoPaiement;
import com.adaming.myapp.dao.reservation.IdaoReservation;
import com.adaming.myapp.entities.Paiement;
import com.adaming.myapp.entities.Reservation;
import com.adaming.myapp.exception.ParameterException;

/**
 * Nom Classe: Idaoproduit
 * 
 * @author Eli, Thierry Version: 1.0 Date: 11/07/2016
 *
 */

@Transactional
public class ServicePaiement implements IservicePaiement {

	private IdaoPaiement dao;
	private IdaoReservation daoR;
	Logger log = Logger.getLogger("ServicePaiement");

	public void setDao(IdaoPaiement dao) {
		this.dao = dao;
		log.info("<--------------daoPaiement injected------------------>");
	}

	public void setDaoR(IdaoReservation daoR) {
		this.daoR = daoR;
		log.info("<--------------daoReservation injected------------------>");
	}

	@Override
	public Paiement addPaiement(Paiement p, Long idFacture)
			throws ParameterException {
		return dao.addPaiement(p, idFacture);
	}

	@Override
	public Double getBeneficeAnnuelle(Long idHotel, Integer annee)
			throws ParameterException {

		Double total = 0.0;
		List<Paiement> tabPa = dao.getListePaiementParHotel(idHotel);
		for (Paiement pa : tabPa) {
			if (pa.getDatePaiement().getYear() == (annee - 1900)) {
				for (Reservation r : pa.getFacture().getReserv()) {
					total = total
							+ daoR.getTotalCostReservation(r.getIdReservation())
							+ daoR.getTotalCostReservation(r.getIdReservation())*pa.getFacture().getTva()/100;
				}
			}
		}
		return total;
	}

	@Override
	public List<Paiement> getListePaiementParHotel(Long idHotel)
			throws ParameterException {
		return dao.getListePaiementParHotel(idHotel);
	}

}
