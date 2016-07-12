package com.adaming.myapp.service.reservation;

import java.util.List;

import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.entities.Reservation;

public interface IserviceReservation {
	
	public Reservation addReservation(Reservation r, Long idC, Long idCh, Long idP);
	public List<Reservation> getReservations(Long idC);
	public Reservation deleteReservation(Long idR);
	public Reservation updateReservation(Reservation r);
	public Double getTotalCostReservation(Long idR);
	public Double getTotalCostReservations();
	public List<Produit> getStockProduit();

}
