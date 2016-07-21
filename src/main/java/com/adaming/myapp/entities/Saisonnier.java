/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Nom Classe: Saisonnier
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
@DiscriminatorValue("saisonnier")
public class Saisonnier extends Employe {

	// Attributes
	@Temporal(TemporalType.DATE)
	private Date dateSortieService;


	//Constructors
	public Saisonnier() {
		super();
	}
	public Saisonnier(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adrPersonne, String adrEmail,
			String numeroTelephone, Double salaire, Date dateEntreService,Date dateSortieService) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adrPersonne, adrEmail,
				numeroTelephone, salaire, dateEntreService);
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
