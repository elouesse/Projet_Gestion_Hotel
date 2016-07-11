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
 * Nom Classe: Reservation
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public class Reservation {

	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReservation;
	private Date dateArrivee;
	private Date dateSortie;

	//Associations
	@ManyToOne
	@JoinColumn(name="idPersonne")
	private Personne personne;
	@ManyToOne
	@JoinColumn(name="idChambre")
	private Chambre chambre;
	@OneToMany
	private List<Consommation> consom;


	//Constructors
	public Reservation() {
		super();
	}

	public Reservation(Date dateArrivee, Date dateSortie) {
		super();
		this.dateArrivee = dateArrivee;
		this.dateSortie = dateSortie;
	}


	// Getters and Setters
	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public List<Consommation> getConsom() {
		return consom;
	}

	public void setConsom(List<Consommation> consom) {
		this.consom = consom;
	}



}
