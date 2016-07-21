package com.adaming.myapp.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;

public class HotelModel {
		// Attributs
	List<Hotel> listeDesHotels;
	List<Personne> listeDesPersonnes;
	
	
	
	public List<Personne> getListeDesPersonnes() {
		return listeDesPersonnes;
	}
	public void setListeDesPersonnes(List<Personne> listeDesPersonnes) {
		this.listeDesPersonnes = listeDesPersonnes;
	}
	@NotEmpty(message="Veuillez entrez un nom d'Hotel !")
	@Size(min=2,max=20)
	private String nomHotel;
	@Size(min=2,max=40)
	@NotEmpty(message="Veuillez entrez une adresse !")
	private String adrHotel;
	@NotNull(message="Veuillez entrez la classe !")
	private Integer classeHotel;
	@NotEmpty(message="Veuillez entrez un pays !")
	@Size(min=2,max=20)
	private String pays;
	@NotEmpty(message="Veuillez entrez un code postale !")
	@Size(min=2,max=6)
	private String codePostal;
	@NotEmpty(message="Veuillez entrez un numéro de téléphone !")
	@Size(min=2,max=10)
	private String numTel;
	@NotEmpty(message="Veuillez entrez un numéro de fax !")
	@Size(min=2,max=10)
	private String numFax;
	@NotEmpty(message="Veuillez entrez une adresse mail !")
	@Size(min=2,max=20)
	private String adrMail;
		// Getters and Setters
	public String getNomHotel() {
		return nomHotel;
	}
	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}
	public String getAdrHotel() {
		return adrHotel;
	}
	public void setAdrHotel(String adrHotel) {
		this.adrHotel = adrHotel;
	}
	public Integer getClasseHotel() {
		return classeHotel;
	}
	public void setClasseHotel(Integer classeHotel) {
		this.classeHotel = classeHotel;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getNumFax() {
		return numFax;
	}
	public void setNumFax(String numFax) {
		this.numFax = numFax;
	}
	public String getAdrMail() {
		return adrMail;
	}
	public void setAdrMail(String adrMail) {
		this.adrMail = adrMail;
	}
	public List<Hotel> getListeDesHotels() {
		return listeDesHotels;
	}
	public void setListeDesHotels(List<Hotel> listeDesHotels) {
		this.listeDesHotels = listeDesHotels;
	}
	

}
