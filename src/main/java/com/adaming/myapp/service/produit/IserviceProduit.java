package com.adaming.myapp.service.produit;

import java.util.List;

import com.adaming.myapp.entities.Produit;
/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */
public interface IserviceProduit {
	
	public Produit addProduit(Produit p);
	public Produit updateProduit(Produit p);
	public Produit deleteProduit(Long idProduit);
	public List<Produit> getListeDesProduits();
	public Produit getProduitParId(Long idProduit);

}
