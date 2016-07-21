package com.adaming.myapp.service.consommation;

import java.util.List;

import com.adaming.myapp.entities.Consommation;
import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.exception.ParameterException;
import com.adaming.myapp.exception.QuantityExceededException;

public interface IserviceConsommation {
	
	public Consommation addConsommation(Consommation co, Long idProduit, Long idReserv) throws ParameterException, QuantityExceededException;
	public List<Produit> getConsomProduit();

}
