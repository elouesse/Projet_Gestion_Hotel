/**
 * 
 */
package com.adaming.myapp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Nom Classe: ChambreDouble
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
@DiscriminatorValue("chambredouble")
public class ChambreDouble extends Chambre {
	
	// Constructors
	public ChambreDouble() {
		super();
	}
	public ChambreDouble(Integer numeroChambre, Double prix, Double surface,
			Integer etage, Integer nombrePiece, Integer nombreLit) {
		super(numeroChambre, prix, surface, etage, nombrePiece, nombreLit);
	}




	// toString method
	@Override
	public String toString() {
		return "ChambreDouble";
	}

}
