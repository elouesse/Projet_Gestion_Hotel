package com.adaming.myapp.model;

import java.util.List;
import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;

public class PersonneModel3 {
	
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
	
}
