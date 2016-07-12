package com.adaming.myapp.service.chambre;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.chambre.IdaoChambre;
import com.adaming.myapp.entities.Chambre;


@Transactional
public class ServiceChambre implements IserviceChambre {

	private IdaoChambre dao;
	Logger log = Logger.getLogger("ServiceChambre");
	
	public void setDao(IdaoChambre dao) {
		this.dao = dao;
		log.info("<--------------daoChambre injected------------------>");
	}

	@Override
	public Chambre addChambre(Chambre ch, Long idHotel) {
		return dao.addChambre(ch, idHotel);
	}

	@Override
	public Chambre deleteChambre(Long idChambre) {
		return dao.deleteChambre(idChambre);
	}

	@Override
	public Chambre updateChambre(Chambre ch) {
		return dao.updateChambre(ch);
	}

	@Override
	public Chambre getChambre(Long idChambre) {
		return dao.getChambre(idChambre);
	}

	@Override
	public List<Chambre> getChambres() {
		return dao.getChambres();
	}

	@Override
	public List<Chambre> getDispoChambres() {
		return dao.getDispoChambres();
	}

}
