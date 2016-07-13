/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Nom Classe: Carte
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
@DiscriminatorValue("carte")
public class Carte extends Paiement {

	// Attributes
	private String typeCarte;
	private String numeroCarte;
	
	//Constructors
	
	public Carte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carte(Date datePaiement,String typeCarte, String numeroCarte) {
		super(datePaiement);
		this.typeCarte = typeCarte;
		this.numeroCarte = numeroCarte;
	}
	
	// Getters and Setters
	public String getTypeCarte() {
		return typeCarte;
	}
	
	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}
	public String getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Carte";
	}

}
