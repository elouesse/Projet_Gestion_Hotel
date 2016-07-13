package com.adaming.myapp.dao.reservation;

import java.util.List;

import com.adaming.myapp.entities.*;

public interface IdaoReservation {
	
	public Reservation addReservation(Reservation r, Long idC, Long idCh);
	public List<Reservation> getReservations(Long idC);
	public Reservation deleteReservation(Long idR);
	public Reservation updateReservation(Reservation r);
	public List<Reservation> getReservationParResa(Long idR);
	public List<Reservation> getReservationParChambre(Long idCh);
	public Double getTotalCostReservation(Long idR);
	public Double getTotalCostReservations();
	public List<Produit> getStockProduit();
}
