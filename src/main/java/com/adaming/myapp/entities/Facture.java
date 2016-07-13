/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Nom Classe: Facture
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public class Facture {

	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFacture;
	private Date dateFacturation;
	private Double tva;
	
	//Association
	@OneToMany
	@JoinColumn(name="ID_Res")
	private List<Reservation> reserv;
	
	@ManyToOne
	@JoinColumn(name="idHotel")
	private Hotel hotel;

	// Constructors
	public Facture() {
		super();
	}
	public Facture(Date dateFacturation, Double tva) {
		super();
		this.dateFacturation = dateFacturation;
		this.tva = tva;
	}
	
	//Getters and Setters
	
	public Long getIdFacture() {
		return idFacture;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public Date getDateFacturation() {
		return dateFacturation;
	}
	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}
	public Double getTva() {
		return tva;
	}
	public void setTva(Double tva) {
		this.tva = tva;
	}
	public List<Reservation> getReserv() {
		return reserv;
	}
	public void setReserv(List<Reservation> reserv) {
		this.reserv = reserv;
	}
	

}
