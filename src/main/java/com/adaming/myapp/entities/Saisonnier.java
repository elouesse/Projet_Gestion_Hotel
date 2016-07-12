/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Nom Classe: Saisonnier
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
@DiscriminatorValue("Saisonnier")
public class Saisonnier extends Employe {

	// Attributes
	private Date dateSortieService;


	//Constructors
	public Saisonnier() {
		super();
	}
	public Saisonnier(Double salaire, Date dateEntreService) {
		super(salaire, dateEntreService);
	}
	public Saisonnier(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adrPersonne, String adrEmail,
			String numeroTelephone) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adrPersonne, adrEmail,
				numeroTelephone);
	}
	public Saisonnier(Date dateSortieService) {
		super();
		this.dateSortieService = dateSortieService;
	}


	// Getters and Setters
	public Date getDateSortieService() {
		return dateSortieService;
	}

	public void setDateSortieService(Date dateSortieService) {
		this.dateSortieService = dateSortieService;
	}
	
	
	// toString method
	@Override
	public String toString() {
		return "Saisonnier";
	}

}
