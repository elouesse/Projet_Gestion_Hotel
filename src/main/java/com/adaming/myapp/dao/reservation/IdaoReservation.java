package com.adaming.myapp.dao.reservation;

import java.util.List;

import com.adaming.myapp.entities.*;
import com.adaming.myapp.exception.ParameterException;

public interface IdaoReservation {
	
	public Reservation addReservation(Reservation r, Long idC, Long idCh) throws ParameterException;
	public List<Reservation> getReservations(Long idC) throws ParameterException;
	public Reservation deleteReservation(Long idR) throws ParameterException;
	public Reservation updateReservation(Reservation r) throws ParameterException;
	public List<Reservation> getReservationParResa(Long idR) throws ParameterException;
	public List<Reservation> getReservationParChambre(Long idCh) throws ParameterException;
	public List<Reservation> getReservationParHotel(Long idH) throws ParameterException;
	public Double getTotalCostReservation(Long idR) throws ParameterException;
	public Double getTotalCostReservations();
	public List<Produit> getStockProduit();
	
}
