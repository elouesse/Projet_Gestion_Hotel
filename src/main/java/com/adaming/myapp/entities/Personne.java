/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Nom Classe: Personne
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERSONNE",discriminatorType = DiscriminatorType.STRING)
public abstract class Personne {

	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected Long idPersonne;
	protected String nomPersonne;
	protected String prenomPersonne;
	@Temporal(TemporalType.DATE)
	protected Date dateDeNaissance;
	protected String adrPersonne;
	protected String adrEmail;
	protected String numeroTelephone;

	//Association
	@ManyToOne
	@JoinColumn(name="idHotel")
	protected Hotel hotel;
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.REMOVE,mappedBy="personne",orphanRemoval=true)
	protected List<Reservation> reserv;


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
	
	public List<Reservation> getReserv() {
		return reserv;
	}
	public void setReserv(List<Reservation> reserv) {
		this.reserv = reserv;
	}


}
