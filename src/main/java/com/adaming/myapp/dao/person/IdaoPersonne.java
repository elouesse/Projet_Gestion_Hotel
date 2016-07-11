package com.adaming.myapp.dao.person;

import java.util.List;

import com.adaming.myapp.entities.Personne;

/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */


public interface IdaoPersonne {
	
	public Personne addPersonne(Personne p, Long idHotel);
	public Personne updatePersonne(Personne p);
	public Personne deletePersonne(Long id);
	public Personne getPersonne(Long idPersonne);
	public List<Personne> getPersonnes();
	public List<Personne> getPersonneByMc(String mc);
	
	/**
	 * addPersonne
	*supprimer une Personne
	*mettre a jour une Personne
	*r�cup�rer la liste de toutes les Personne
	*r�cup�rer une Personne par Id
	*r�cup�rer la liste des Personne par mot-cle
	**/

}
