/**
 * 
 */
package com.adaming.myapp.entities;

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

/**
 * Nom Classe: Chambre
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
public abstract class Chambre {

	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long idChambre;
	protected Integer numeroChambre;
	protected Double prix =10.0;
	protected  Double surface =10.0;
	protected  Integer etage;
	protected  Integer nombrePiece = 1;
	protected  Integer nombreLit = 1;

	//Association
	@OneToMany(mappedBy="chambre",cascade=CascadeType.REMOVE, fetch=FetchType.EAGER,orphanRemoval=true)
	private List<Reservation> reserv;
	@ManyToOne
	@JoinColumn(name="idHotel")
	private Hotel hotel;

	// Constructors
	public Chambre() {
		super();
	}
	public Chambre(Integer numeroChambre, Double prix, Double surface,
			Integer etage, Integer nombrePiece, Integer nombreLit) {
		super();
		this.numeroChambre = numeroChambre;
		this.prix = prix;
		this.surface = surface;
		this.etage = etage;
		this.nombrePiece = nombrePiece;
		this.nombreLit = nombreLit;
	}



	public Long getIdChambre() {
		return idChambre;
	}
	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}
	public Integer getNumeroChambre() {
		return numeroChambre;
	}
	public void setNumeroChambre(Integer numeroChambre) {
		this.numeroChambre = numeroChambre;
	}
	public Integer getEtage() {
		return etage;
	}
	public void setEtage(Integer etage) {
		this.etage = etage;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Double getPrix() {
		return prix;
	}
	public Double getSurface() {
		return surface;
	}
	public Integer getNombrePiece() {
		return nombrePiece;
	}
	public Integer getNombreLit() {
		return nombreLit;
	}
	
	public List<Reservation> getReserv() {
		return reserv;
	}
	public void setReserv(List<Reservation> reserv) {
		this.reserv = reserv;
	}
	// Getters and Setters

}
