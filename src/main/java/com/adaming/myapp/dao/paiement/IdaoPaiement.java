package com.adaming.myapp.dao.paiement;

import java.util.List;

import com.adaming.myapp.entities.Paiement;

/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */
public interface IdaoPaiement {
	
	public Paiement addPaiement(Paiement p, Long idFacture);

}
