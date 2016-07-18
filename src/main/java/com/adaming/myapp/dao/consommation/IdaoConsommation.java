package com.adaming.myapp.dao.consommation;

import java.util.List;

import com.adaming.myapp.entities.Consommation;
import com.adaming.myapp.entities.Produit;

public interface IdaoConsommation {
	
	public Consommation addConsommation(Consommation co, Long idProduit, Long idReserv);
	public List<Produit> getConsomProduit();

}
