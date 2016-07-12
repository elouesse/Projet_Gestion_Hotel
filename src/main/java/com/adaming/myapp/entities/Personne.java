/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Nom Classe: Personne
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public abstract class Personne {

	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPersonne;
	private String nomPersonne;
	private String prenomPersonne;
	private Date dateDeNaissance;
	private String adrPersonne;
	private String adrEmail;
	private String numeroTelephone;

	//Association
	@ManyToOne
	@JoinColumn(name="idHotel")
	private Hotel hotel;


	// Constructors
	public Personne() {
		super();
	}
	public Personne(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adrPersonne, String adrEmail,
			String numeroTelephone) {
		super();
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.dateDeNaissance = dateDeNaissance;
		this.adrPersonne = adrPersonne;
		this.adrEmail = adrEmail;
		this.numeroTelephone = numeroTelephone;
	}

	//Getters and Setters
	public Long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNomPersonne() {
		return nomPersonne;
	}
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}
	public String getPrenomPersonne() {
		return prenomPersonne;
	}
	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getAdrPersonne() {
		return adrPersonne;
	}
	public void setAdrPersonne(String adrPersonne) {
		this.adrPersonne = adrPersonne;
	}
	public String getAdrEmail() {
		return adrEmail;
	}
	public void setAdrEmail(String adrEmail) {
		this.adrEmail = adrEmail;
	}
	public String getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}


}
