package com.adaming.myapp.dao.paiement;

import java.util.List;

import com.adaming.myapp.entities.Paiement;
import com.adaming.myapp.exception.ParameterException;

/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */
public interface IdaoPaiement {
	
	public Paiement addPaiement(Paiement p, Long idFacture) throws ParameterException;
	public List<Paiement> getListePaiementParHotel(Long idHotel) throws ParameterException;

}
