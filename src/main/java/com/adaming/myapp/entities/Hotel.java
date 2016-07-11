/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Nom Classe: Hotel
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public class Hotel {

	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idHotel;
	private String nomHotel;
	private String adrHotel;
	private Integer classeHotel;
	private String pays;
	private String codePostal;
	private String numTel;
	private String numFax;
	private String adrMail;
	
	//Associations
	@OneToMany
	private List<Personne> personne;
	@OneToMany
	private List<Chambre> chambre;
	@OneToMany
	private List<Facture> facture;
	
	//Constructors
	public Hotel() {
		super();
	}
	public Hotel(String nomHotel, String adrHotel, Integer classeHotel,
			String pays, String codePostal, String numTel, String numFax,
			String adrMail) {
		super();
		this.nomHotel = nomHotel;
		this.adrHotel = adrHotel;
		this.classeHotel = classeHotel;
		this.pays = pays;
		this.codePostal = codePostal;
		this.numTel = numTel;
		this.numFax = numFax;
		this.adrMail = adrMail;
	}


	//Getters and Setters
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
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
	public List<Personne> getPersonne() {
		return personne;
	}
	public void setPersonne(List<Personne> personne) {
		this.personne = personne;
	}
	public List<Chambre> getChambre() {
		return chambre;
	}
	public void setChambre(List<Chambre> chambre) {
		this.chambre = chambre;
	}
	public List<Facture> getFacture() {
		return facture;
	}
	public void setFacture(List<Facture> facture) {
		this.facture = facture;
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

}
