/**
 * 
 */
package com.adaming.myapp.entities;

import javax.persistence.Entity;

/**
 * Nom Classe: ChambreSimple
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */

@Entity
public class ChambreSimple extends Chambre {

	// Attributes
	private Integer nombrePiece = 1;
	private Double surface = 10.0;
	private Double prix = 20.0;
	private Integer nombreLit = 1;
	
	// Constructors
	public ChambreSimple() {
		super();
	}
	public ChambreSimple(Integer numeroChambre, Integer etage) {
		super(numeroChambre, etage);
	}
	public ChambreSimple(Integer nombrePiece, Double surface, Double prix,
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
	
	// toString
	@Override
	public String toString() {
		return "ChambreSimple";
	}
	

}
