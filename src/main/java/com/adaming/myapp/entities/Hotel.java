/**
 * 
 */
package com.adaming.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
