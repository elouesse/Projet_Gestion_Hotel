package com.adaming.myapp.service.facture;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.facture.IdaoFacture;
import com.adaming.myapp.entities.Facture;


@Transactional
public class ServiceFacture implements IserviceFacture {
	
	private IdaoFacture dao;
	Logger log = Logger.getLogger("ServiceFacture");
	
	public void setDao(IdaoFacture dao) {
		this.dao = dao;
		log.info("<--------------daoFacture injected------------------>");
	}

	@Override
	public Facture addFacture(Facture f, Long idReservation, Long idHotel) {
		
		return dao.addFacture(f, idReservation, idHotel);
	}

	@Override
	public List<Facture> getListeDesFacturesParClient(Long idPersonne) {
		return dao.getListeDesFacturesParClient(idPersonne);
	}

	@Override
	public Double coutAnnuelParClient(Long idPersonne, int annee) {
		return dao.coutAnnuelParClient(idPersonne, annee);
	}

	@Override
	public Double coutSemestrielParClient(Long idPersonne, int annee,
			int semestre) {
		return dao.coutSemestrielParClient(idPersonne, annee, semestre);
	}

}
