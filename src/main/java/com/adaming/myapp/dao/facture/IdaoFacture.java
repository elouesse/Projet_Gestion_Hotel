package com.adaming.myapp.dao.facture;

import java.util.List;

import com.adaming.myapp.entities.Facture;
/**
 * Nom Classe: Reservation
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */
public interface IdaoFacture {
	
	public Facture addFacture(Facture f,Long idReservation, Long idHotel);
	public List<Facture> getListeDesFacturesParClient(Long idPersonne);
	public Double coutAnnuelParClient(Long idPersonne, int annee);
	public Double coutSemestrielParClient(Long idPersonne, int annee,int semestre);

}
