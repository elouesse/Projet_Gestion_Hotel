package com.adaming.myapp.service.facture;

import java.util.List;

import com.adaming.myapp.entities.Facture;

public interface IserviceFacture {
	public Facture addFacture(Facture f,Long idReservation, Long idHotel);
	public List<Facture> getListeDesFacturesParClient(Long idPersonne);
	public Double coutAnnuelParClient(Long idPersonne, int annee);
	public Double coutSemestrielParClient(Long idPersonne, int annee,int semestre);

}
