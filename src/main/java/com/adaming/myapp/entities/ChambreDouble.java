/**
 * 
 */
package com.adaming.myapp.entities;

import javax.persistence.Entity;

/**
 * Nom Classe: ChambreDouble
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public class ChambreDouble extends Chambre {
	
	// Attributes
	private Integer nombrePiece = 2;
	private Double surface = 20.0;
	private Double prix = 40.0;
	private Integer nombreLit = 2;
	
	// Constructors
	public ChambreDouble() {
		super();
	}
	public ChambreDouble(Integer etage) {
		super(etage);
	}
	public ChambreDouble(Integer nombrePiece, Double surface, Double prix,
			Integer nombreLit) {
		super();
		this.nombrePiece = nombrePiece;
		this.surface = surface;
		this.prix = prix;
		this.nombreLit = nombreLit;
	}
	
	// Getters and Setters
	public Integer getNombrePiece() {
		return nombrePiece;
	}
	public void setNombrePiece(Integer nombrePiece) {
		this.nombrePiece = nombrePiece;
	}
	public Double getSurface() {
		return surface;
	}
	public void setSurface(Double surface) {
		this.surface = surface;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Integer getNombreLit() {
		return nombreLit;
	}
	public void setNombreLit(Integer nombreLit) {
		this.nombreLit = nombreLit;
	}
	
	// toString method
	@Override
	public String toString() {
		return "ChambreDouble";
	}
	

}
