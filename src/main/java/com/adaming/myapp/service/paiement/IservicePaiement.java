package com.adaming.myapp.service.paiement;

import com.adaming.myapp.entities.Paiement;

/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */
public interface IservicePaiement {
	
	public Paiement addPaiement(Paiement p, Long idFacture);
	public Double getBeneficeAnnuelle(int annee);

}
