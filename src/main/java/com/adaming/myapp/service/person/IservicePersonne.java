package com.adaming.myapp.service.person;

import java.util.List;

import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.exception.ParameterException;

public interface IservicePersonne {
	
	public Personne addPersonne(Personne p, Long idHotel) throws ParameterException;
	public Personne updatePersonne(Personne p) throws ParameterException;
	public Personne deletePersonne(Long id) throws ParameterException;
	public Personne getPersonne(Long idPersonne) throws ParameterException;
	public List<Personne> getPersonnes();
	public List<Personne> getPersonneByMc(String mc);
	public Double coutAnnuelParClient(Long idPersonne, Integer annee) throws ParameterException;
	public Double coutSemestrielParClient(Long idPersonne, Integer annee,Integer semestre) throws ParameterException;

}
