/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Nom Classe: Cheque
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
@DiscriminatorValue("cheque")
public class Cheque extends Paiement {
	
	// Attributes
	private String numeroCheque;

	//Constructors

	public Cheque() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cheque(Date datePaiement,String numeroCheque) {
		super(datePaiement);
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
