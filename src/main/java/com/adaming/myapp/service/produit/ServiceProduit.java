package com.adaming.myapp.service.produit;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.produit.IdaoProduit;
import com.adaming.myapp.entities.Produit;
/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Transactional
public class ServiceProduit implements IserviceProduit {
	
	private IdaoProduit dao;
	Logger log = Logger.getLogger("ServiceProduit");
	
	public void setDao(IdaoProduit dao) {
		this.dao = dao;
		log.info("<--------------daoProduit injected------------------>");
	}

	@Override
	public Produit addProduit(Produit p) {		
		return dao.addProduit(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		return dao.updateProduit(p);
	}

	@Override
	public Produit deleteProduit(Long idProduit) {
		return dao.deleteProduit(idProduit);
	}

	@Override
	public List<Produit> getListeDesProduits() {
		return dao.getListeDesProduits();
	}

	@Override
	public Produit getProduitParId(Long idProduit) {
		return dao.getProduitParId(idProduit);
	}

}
