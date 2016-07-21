package com.adaming.myapp.service.facture;

import java.util.List;

import com.adaming.myapp.entities.Facture;
import com.adaming.myapp.exception.ParameterException;

public interface IserviceFacture {
	public Facture addFacture(Facture f,Long idReserv, Long idHotel) throws ParameterException;
	public List<Facture> getListeDesFacturesParClient(Long idClient) throws ParameterException;

}
