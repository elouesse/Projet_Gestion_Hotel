package com.adaming.myapp.dao.facture;

import java.util.List;

import com.adaming.myapp.entities.Facture;
import com.adaming.myapp.exception.ParameterException;
/**
 * Nom Classe: Reservation
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */
public interface IdaoFacture {
	
	public Facture addFacture(Facture f,Long idReserv, Long idHotel) throws ParameterException;
	public List<Facture> getListeDesFacturesParClient(Long idClient) throws ParameterException;

}
