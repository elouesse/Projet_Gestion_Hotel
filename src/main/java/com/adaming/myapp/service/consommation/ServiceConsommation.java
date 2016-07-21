package com.adaming.myapp.service.consommation;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.consommation.IdaoConsommation;
import com.adaming.myapp.entities.Consommation;
import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.exception.ParameterException;
import com.adaming.myapp.exception.QuantityExceededException;


@Transactional
public class ServiceConsommation implements IserviceConsommation {
	
	private IdaoConsommation dao;
	Logger log = Logger.getLogger("ServiceConsommation");
	
	public void setDao(IdaoConsommation dao) {
		this.dao = dao;
		log.info("<--------------daoConsommation injected------------------>");
	}

	@Override
	public Consommation addConsommation(Consommation co, Long idProduit,
			Long idReserv) throws ParameterException, QuantityExceededException {
		return dao.addConsommation(co, idProduit, idReserv);
	}

	@Override
	public List<Produit> getConsomProduit() {
		return dao.getConsomProduit();
	}

}
