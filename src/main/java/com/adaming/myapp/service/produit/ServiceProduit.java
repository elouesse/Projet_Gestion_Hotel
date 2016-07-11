package com.adaming.myapp.service.produit;

import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.produit.IdaoProduit;


@Transactional
public class ServiceProduit implements IserviceProduit {
	
	private IdaoProduit dao;
	Logger log = Logger.getLogger("ServiceProduit");
	
	public void setDao(IdaoProduit dao) {
		this.dao = dao;
		log.info("<--------------daoProduit injected------------------>");
	}

}
