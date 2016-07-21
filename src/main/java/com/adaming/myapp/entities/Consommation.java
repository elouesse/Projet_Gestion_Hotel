/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Nom Classe: Consommation
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public class Consommation {

	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idConsommation;
	private Integer quantiteConsommee;

	//Association
	@ManyToOne
	@JoinColumn(name="idProduit")
	private Produit produit;
	@ManyToOne
	@JoinColumn(name="idReservation")
	private Reservation reserv;
	@OneToMany(cascade = CascadeType.REMOVE)
	private List<Personne> personne;


	//Constructors
	public Consommation() {
		super();
	}
	public Consommation(Integer quantiteConsommee) {
		super();
		this.quantiteConsommee = quantiteConsommee;
	}

	// Getters and Setters
	public Long getIdConsommation() {
		return idConsommation;
	}

	public void setIdConsommation(Long idConsommation) {
		this.idConsommation = idConsommation;
	}

	public Integer getQuantiteConsommee() {
		return quantiteConsommee;
	}

	public void setQuantiteConsommee(Integer quantiteConsommee) {
		this.quantiteConsommee = quantiteConsommee;
	}

	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public List<Personne> getPersonne() {
		return personne;
	}
	public void setPersonne(List<Personne> personne) {
		this.personne = personne;
	}
	public Reservation getReserv() {
		return reserv;
	}
	public void setReserv(Reservation reserv) {
		this.reserv = reserv;
	}



}
