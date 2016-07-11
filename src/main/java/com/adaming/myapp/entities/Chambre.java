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
 * Nom Classe: Chambre
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public abstract class Chambre {

	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idChambre;
	private Integer numeroChambre;
	private final Double prix =10.0;
	private final Double surface =10.0;
	private Integer etage;
	private final Integer nombrePiece = 1;
	private final Integer nombreLit = 1;

	//Association
	@OneToMany
	private List<Reservation> reserv;
	
	// Constructors
	public Chambre() {
		super();
	}
	public Chambre(Integer numeroChambre, Integer etage) {
		super();
		this.numeroChambre = numeroChambre;
		this.etage = etage;
	}
	
	// Getters and Setters
	public Long getIdChambre() {
		return idChambre;
	}

	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}

	public Integer getEtage() {
		return etage;
	}

	public void setEtage(Integer etage) {
		this.etage = etage;
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

	public Double getPrix() {
		return prix;
	}

	public Double getSurface() {
		return surface;
	}
	public Integer getNumeroChambre() {
		return numeroChambre;
	}
	public void setNumeroChambre(Integer numeroChambre) {
		this.numeroChambre = numeroChambre;
	}
	

}
