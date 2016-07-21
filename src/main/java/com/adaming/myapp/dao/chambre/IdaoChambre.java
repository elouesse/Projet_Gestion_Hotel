package com.adaming.myapp.dao.chambre;

import java.util.List;

import com.adaming.myapp.entities.Chambre;
import com.adaming.myapp.exception.ParameterException;

/**
 * Nom Classe: IdaoChambre
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

public interface IdaoChambre {

	public Chambre addChambre(Chambre ch, Long idHotel) throws ParameterException;
	public Chambre deleteChambre(Long idChambre) throws ParameterException;
	public Chambre updateChambre(Chambre ch) throws ParameterException;
	public Chambre getChambre(Long idChambre) throws ParameterException;
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
