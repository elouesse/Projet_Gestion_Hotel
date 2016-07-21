package com.adaming.myapp.model;
/**
 * Nom Classe: ClientModel
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;

public class ClientModel {
	
	List<Hotel> listeDesHotels;
	List<Personne> listeDesPersonnes;
	Personne leClient;
	

	@NotNull
	private Long idHotel;
	private Long idPersonne;
	
	
	
	public Personne getLeClient() {
		return leClient;
	}
	public void setLeClient(Personne leClient) {
		this.leClient = leClient;
	}
	public List<Personne> getListeDesPersonnes() {
		return listeDesPersonnes;
	}
	public void setListeDesPersonnes(List<Personne> listeDesPersonnes) {
		this.listeDesPersonnes = listeDesPersonnes;
	}
	public Long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
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
	@NotNull(message="Veuillez entrez un prix !")
	@Digits(integer=3, fraction=0)
	private Double reduction;
	@NotNull(message="Entrez un nombre de réservation !")
	private Integer nombreReservation;
	
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
	public List<Hotel> getListeDesHotels() {
		return listeDesHotels;
	}
	public void setListeDesHotels(List<Hotel> listeDesHotels) {
		this.listeDesHotels = listeDesHotels;
	}
	

}
