package com.adaming.myapp.service.person;

import java.util.List;

import com.adaming.myapp.entities.Personne;

public interface IservicePersonne {
	
	public Personne addPersonne(Personne p, Long idHotel);
	public Personne updatePersonne(Personne p);
	public Personne deletePersonne(Long id);
	public Personne getPersonne(Long idPersonne);
	public List<Personne> getPersonnes();
	public List<Personne> getPersonneByMc(String mc);

}
