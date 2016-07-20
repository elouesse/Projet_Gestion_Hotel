package com.adaming.myapp.model;

import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.adaming.myapp.entities.Produit;

public class ProduitModel {
	
	// Attributs
	@NotNull(message="Veuillez entrez un prix !")
	@Digits(integer=6, fraction=2)
	private Double prixProduit;
	@NotEmpty(message="Veuillez entrez un nom de produit !")
	@Size(min=2,max=20)
	private String nomProduit;
	@NotEmpty(message="Veuillez entrez une référence !")
	@Size(min=2,max=15)
	private String referenceProduit;
	@NotNull(message="Veuillez entrez la quantité !")
	private Integer quantiteProduite;
	
	
	List<Produit> listeProduit;
	List<Produit> listeP;
	
	
	// Getters and Setters
	public List<Produit> getListeP() {
		return listeP;
	}
	public void setListeP(List<Produit> listeP) {
		this.listeP = listeP;
	}
	public List<Produit> getListeProduit() {
		return listeProduit;
	}
	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
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
