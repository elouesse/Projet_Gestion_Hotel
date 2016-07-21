package com.adaming.myapp.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.adaming.myapp.entities.Hotel;

/**
 * Nom Classe: Contractuel
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */
public class EmployeSaisonModel {
	
	List<Hotel> listeDesHotels;
	@NotNull
	private Long idHotel;
	
	
	
	public List<Hotel> getListeDesHotels() {
		return listeDesHotels;
	}
	public void setListeDesHotels(List<Hotel> listeDesHotels) {
		this.listeDesHotels = listeDesHotels;
	}
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	@NotEmpty(message="Veuillez entrez un nom !")
	@Size(min=2,max=20)
	private String nomPersonne;
	@NotEmpty(message="Veuillez entrez un prénom !")
	@Size(min=2,max=20)
	private String prenomPersonne;
	@NotNull(message="Entrez une date!(aaaa-mm-jj)")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateDeNaissance;
	@NotEmpty(message="Veuillez entrez une adresse !")
	@Size(min=2,max=50)
	private String adrPersonne;
	@Email(message="Entrez un mail valide!")
	private String adrEmail;
	@NotEmpty(message="Veuillez entrez un numéro !")
	@Size(min=2,max=10)
	private String numeroTelephone;
	@NotNull(message="Entrez une date!(aaaa-mm-jj)")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateEntreService;
	@NotNull(message="Entrez une date!(aaaa-mm-jj)")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateSortieService;
	@NotNull(message="Veuillez entrez un salaire !")
	@Digits(integer=4, fraction=2)
	private Double salaire;
	
	public String getNomPersonne() {
		return nomPersonne;
	}
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}
	public String getPrenomPersonne() {
		return prenomPersonne;
	}
	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getAdrPersonne() {
		return adrPersonne;
	}
	public void setAdrPersonne(String adrPersonne) {
		this.adrPersonne = adrPersonne;
	}
	public String getAdrEmail() {
		return adrEmail;
	}
	public void setAdrEmail(String adrEmail) {
		this.adrEmail = adrEmail;
	}
	public String getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	public Date getDateEntreService() {
		return dateEntreService;
	}
	public void setDateEntreService(Date dateEntreService) {
		this.dateEntreService = dateEntreService;
	}
	public Date getDateSortieService() {
		return dateSortieService;
	}
	public void setDateSortieService(Date dateSortieService) {
		this.dateSortieService = dateSortieService;
	}
	
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	
	
	

}
