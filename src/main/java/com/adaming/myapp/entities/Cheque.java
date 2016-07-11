/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.Entity;

/**
 * Nom Classe: Cheque
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public class Cheque extends Paiement {
	
	// Attributes
	private String numeroCheque;

	//Constructors
	public Cheque() {
		super();
	}
	public Cheque(Date datePaiement) {
		super(datePaiement);
	}
	public Cheque(String numeroCheque) {
		super();
		this.numeroCheque = numeroCheque;
	}
	
	//Getters and Setters
	public String getNumeroCheque() {
		return numeroCheque;
	}
	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Cheque";
	}
	
	

}
