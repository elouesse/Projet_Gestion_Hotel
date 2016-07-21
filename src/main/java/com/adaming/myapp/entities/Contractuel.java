/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Nom Classe: Contractuel
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
@DiscriminatorValue("contractuel")
public class Contractuel extends Employe {

	// Attributes
	private Double prime;


	//Constructors
	public Contractuel() {
		super();
	}
	public Contractuel(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adrPersonne, String adrEmail,
			String numeroTelephone, Double salaire, Date dateEntreService,Double prime) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adrPersonne, adrEmail,
				numeroTelephone, salaire, dateEntreService);
		this.prime = prime;
	}

	//Getters and Setters
	public Double getPrime() {
		return prime;
	}

	public void setPrime(Double prime) {
		this.prime = prime;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Contractuel";
	}



}
