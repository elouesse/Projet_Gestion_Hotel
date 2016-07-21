package com.adaming.myapp.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;

public class PersonneModel2 {
	
	@NotNull(message="Veuillez Choisir un ID")
	private Long idPersonne;
	List<Personne> laListeDesPersonnes;
	List<Personne> laListeDesEmployes;
	List<Personne> laListeDesContrat;
	List<Hotel> listeDesHotels;
	public List<Personne> getLaListeDesPersonnes() {
		return laListeDesPersonnes;
	}
	public void setLaListeDesPersonnes(List<Personne> laListeDesPersonnes) {
		this.laListeDesPersonnes = laListeDesPersonnes;
	}
	public List<Personne> getLaListeDesEmployes() {
		return laListeDesEmployes;
	}
	public void setLaListeDesEmployes(List<Personne> laListeDesEmployes) {
		this.laListeDesEmployes = laListeDesEmployes;
	}
	public List<Personne> getLaListeDesContrat() {
		return laListeDesContrat;
	}
	public void setLaListeDesContrat(List<Personne> laListeDesContrat) {
		this.laListeDesContrat = laListeDesContrat;
	}
	public List<Hotel> getListeDesHotels() {
		return listeDesHotels;
	}
	public void setListeDesHotels(List<Hotel> listeDesHotels) {
		this.listeDesHotels = listeDesHotels;
	}
	public Long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}
	
}
