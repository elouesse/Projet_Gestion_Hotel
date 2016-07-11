package com.adaming.myapp.dao.chambre;

import java.util.List;

import com.adaming.myapp.entities.Chambre;

/**
 * Nom Classe: IdaoChambre
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

public interface IdaoChambre {

	public Chambre addChambre(Chambre ch, Long idHotel);
	public Chambre deleteChambre(Long idChambre);
	public Chambre updateChambre(Chambre ch);
	public Chambre getChambre(Long idChambre);
	public List<Chambre> getChambres();
	public List<Chambre> getDispoChambres();

	/**
	 *addchambre sachant l'hotel
	 *supprimer une chambre
	 *modifier les renseignements d'une chambre
	 *récupérer la liste de toutes les chambres
	 *récupérer une chambre par Id
	 *afficher les chambres disponibles
	 **/

}
