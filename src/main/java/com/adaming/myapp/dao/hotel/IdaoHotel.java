package com.adaming.myapp.dao.hotel;

import java.util.List;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Employe;
import com.adaming.myapp.entities.Hotel;

/**
 * Nom Classe: Idaoproduit
 * @author Eli, Thierry
 * Version: 1.0
 * Date: 11/07/2016
 *
 */
public interface IdaoHotel {
	
	public Hotel addHotel(Hotel h);
	public List<Employe> getListeDesEmployes(Long idHotel);
	public List<Client> getListeDesClients(Long idHotel);

}
