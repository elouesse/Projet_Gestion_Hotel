package com.adaming.myapp.service.facture;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.facture.IdaoFacture;
import com.adaming.myapp.entities.Facture;
import com.adaming.myapp.exception.ParameterException;


@Transactional
public class ServiceFacture implements IserviceFacture {
	
	private IdaoFacture dao;
	Logger log = Logger.getLogger("ServiceFacture");
	
	public void setDao(IdaoFacture dao) {
		this.dao = dao;
		log.info("<--------------daoFacture injected------------------>");
	}

	@Override
	public Facture addFacture(Facture f, Long idReserv, Long idHotel) throws ParameterException {
		
		return dao.addFacture(f, idReserv, idHotel);
	}

	@Override
	public List<Facture> getListeDesFacturesParClient(Long idClient) throws ParameterException {
		return dao.getListeDesFacturesParClient(idClient);
	}

}
