package com.adaming.myapp.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;

public class PersonneModel {
	
	List<Personne> laListeDesPersonnes;
	List<Personne> laListeDesEmployes;
	List<Personne> laListeDesContrat;
	List<Hotel> listeDesHotels;
	@NotNull(message="Veuillez choisir un hotel ")
	private Long idHotel=1L; // Attention!
	
	
	
	
			// Getters and Setters
	
	public List<Hotel> getListeDesHotels() {
		return listeDesHotels;
	}



	public List<Personne> getLaListeDesContrat() {
		return laListeDesContrat;
	}

	public void setLaListeDesContrat(List<Personne> laListeDesContrat) {
		this.laListeDesContrat = laListeDesContrat;
	}

	public List<Personne> getLaListeDesEmployes() {
		return laListeDesEmployes;
	}

	public void setLaListeDesEmployes(List<Personne> laListeDesEmployes) {
		this.laListeDesEmployes = laListeDesEmployes;
	}

	public void setListeDesHotels(List<Hotel> listeDesHotels) {
		this.listeDesHotels = listeDesHotels;
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public List<Personne> getLaListeDesPersonnes() {
		return laListeDesPersonnes;
	}

	public void setLaListeDesPersonnes(List<Personne> laListeDesPersonnes) {
		this.laListeDesPersonnes = laListeDesPersonnes;
	}

}
