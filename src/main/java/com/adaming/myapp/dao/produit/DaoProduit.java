/*
 */
package com.adaming.myapp.dao.produit;

import java.util.List;
import java.util.logging.Logger;





import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.exception.ParameterException;
/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

public class DaoProduit implements IdaoProduit {
	
	Logger log = Logger.getLogger("DaoProduit");
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Produit addProduit(Produit p) {
		em.persist(p);
		log.info("Le produit "+p.getIdProduit()+" a bien �t� ajout�!");
		return p;
	}
	@Override
	public Produit updateProduit(Produit p) throws ParameterException {
		if(p.getIdProduit()==null)
		{
			throw new ParameterException("Le produit referee n'existe pas.");
		}
		em.merge(p);
		log.info("Le produit "+p.getIdProduit()+" a bien �t� mis � jour!");
		return p;
	}
	@Override
	public Produit deleteProduit(Long idProduit) throws ParameterException {
		Produit p = em.find(Produit.class, idProduit);
		if(p==null)
		{
			throw new ParameterException("Le produit referee n'existe pas.");
		}
		em.remove(p);
		log.info("Le produit "+p.getIdProduit()+" a bien �t� supprim�!");
		return p;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> getListeDesProduits() {
		Query query=em.createQuery("from Produit");
		log.info("La liste contient "+query.getResultList().size()+" produits et elle � bien �t� r�cup�r�!");
		return query.getResultList();
	}
	@Override
	public Produit getProduitParId(Long idProduit) throws ParameterException {
		Produit p = em.find(Produit.class, idProduit);
		if(p==null)
		{
			throw new ParameterException("Le produit referee n'existe pas.");
		}
		log.info("Le produit "+idProduit+" a bien �t� r�cup�r�!");
		return p;
	}
	

	
	
	

}
