/**
 * 
 */
package com.adaming.myapp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Nom Classe: Client
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
@DiscriminatorValue("client")
public class Client extends Personne {

	// Attributes
	private Date dateInscription;
	private Double reduction;
	private Integer nombreReservation;
	
	// Constructors
	public Client() {
		super();
	}
	public Client(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adrPersonne, String adrEmail,
			String numeroTelephone,Date dateInscription, Double reduction,
			Integer nombreReservation) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adrPersonne, adrEmail,
				numeroTelephone);
		this.dateInscription = dateInscription;
		this.reduction = reduction;
		this.nombreReservation = nombreReservation;
	}

	
	// Getters and Setters
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public Double getReduction() {
		return reduction;
	}
	public void setReduction(Double reduction) {
		this.reduction = reduction;
	}
	public Integer getNombreReservation() {
		return nombreReservation;
	}
	public void setNombreReservation(Integer nombreReservation) {
		this.nombreReservation = nombreReservation;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Client";
	}

}
