/**
 * 
 */
package com.adaming.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Produit produit;
	@OneToMany
	private Personne personne;


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

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}



}
