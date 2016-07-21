package com.adaming.myapp.dao.person;

import java.util.List;

import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.exception.ParameterException;

/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */


public interface IdaoPersonne {
	
	public Personne addPersonne(Personne p, Long idHotel) throws ParameterException;
	public Personne updatePersonne(Personne p) throws ParameterException;
	public Personne deletePersonne(Long id) throws ParameterException;
	public Personne getPersonne(Long idPersonne) throws ParameterException;
	public List<Personne> getPersonnes();
	public List<Personne> getPersonneByMc(String mc);
	
	/**
	 * addPersonne
	*supprimer une Personne
	*mettre a jour une Personne
	*récupérer la liste de toutes les Personne
	*récupérer une Personne par Id
	*récupérer la liste des Personne par mot-cle
	**/

}
