/**
 * 
 */
package com.adaming.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Nom Classe: Produit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public class Produit {

	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	private Double prixProduit;
	private String nomProduit;
	private String referenceProduit;
	private Integer quantiteProduite;

	
	// Constructors
	public Produit() {
		super();
	}
	public Produit(Double prixProduit, String nomProduit,
			String referenceProduit, Integer quantiteProduite) {
		super();
		this.prixProduit = prixProduit;
		this.nomProduit = nomProduit;
		this.referenceProduit = referenceProduit;
		this.quantiteProduite = quantiteProduite;
	}
	
	// Getters and Setters
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public Double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getReferenceProduit() {
		return referenceProduit;
	}
	public void setReferenceProduit(String referenceProduit) {
		this.referenceProduit = referenceProduit;
	}
	public Integer getQuantiteProduite() {
		return quantiteProduite;
	}
	public void setQuantiteProduite(Integer quantiteProduite) {
		this.quantiteProduite = quantiteProduite;
	}

}
