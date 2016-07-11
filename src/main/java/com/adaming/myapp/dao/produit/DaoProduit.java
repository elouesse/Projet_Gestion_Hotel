/*
 */
package com.adaming.myapp.dao.produit;

import java.util.List;
import java.util.logging.Logger;




import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Produit;
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
		log.info("Le produit "+p.getIdProduit()+" a bien été ajouté!");
		return p;
	}
	@Override
	public Produit updateProduit(Produit p) {
		em.merge(p);
		log.info("Le produit "+p.getIdProduit()+" a bien été mis à jour!");
		return p;
	}
	@Override
	public Produit deleteProduit(Long idProduit) {
		Produit p = em.find(Produit.class, idProduit);
		em.remove(p);
		log.info("Le produit "+p.getIdProduit()+" a bien été supprimé!");
		return p;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> getListeDesProduits() {
		Query query=em.createQuery("from Produit");
		log.info("La liste contient "+query.getResultList().size()+" produits et elle à bien été récupéré!");
		return query.getResultList();
	}
	@Override
	public Produit getProduitParId(Long idProduit) {
		Produit p = em.find(Produit.class, idProduit);
		log.info("Le produit "+idProduit+" a bien été récupéré!");
		return p;
	}
	

	
	
	

}
