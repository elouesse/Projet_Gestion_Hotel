/**

 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Nom Classe: Employe
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
//@DiscriminatorValue("employe")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)
public abstract class Employe extends Personne {

	// Attributes
	protected Double salaire;
	protected Date dateEntreService;
	
	
	// Constructors
	public Employe() {
		super();
	}
	public Employe(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adrPersonne, String adrEmail,
			String numeroTelephone) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adrPersonne, adrEmail,
				numeroTelephone);
	}
	public Employe(Double salaire, Date dateEntreService) {
		super();
		this.salaire = salaire;
		this.dateEntreService = dateEntreService;
	}
	
	
	// Getters and Setters
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public Date getDateEntreService() {
		return dateEntreService;
	}
	public void setDateEntreService(Date dateEntreService) {
		this.dateEntreService = dateEntreService;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Employe";
	}

}
