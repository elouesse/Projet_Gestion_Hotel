/**
 * 
 */
package com.adaming.myapp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Nom Classe: ChambreSimple
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
@DiscriminatorValue("chambresimple")
public class ChambreSimple extends Chambre {
	
	// Constructors
	public ChambreSimple() {
		super();
	}
	public ChambreSimple(Integer numeroChambre, Double prix, Double surface,
			Integer etage, Integer nombrePiece, Integer nombreLit) {
		super(numeroChambre, prix, surface, etage, nombrePiece, nombreLit);
	}


	// toString
	@Override
	public String toString() {
		return "ChambreSimple";
	}
	

}
