/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.Entity;

/**
 * Nom Classe: Espece
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public class Espece extends Paiement {

	//Constructors
	public Espece() {
		super();
	}
	public Espece(Date datePaiement) {
		super(datePaiement);
	}

	// toString method
	@Override
	public String toString() {
		return "Espece";
	}
	
	

}
