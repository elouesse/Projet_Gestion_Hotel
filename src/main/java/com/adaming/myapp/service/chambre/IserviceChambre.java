package com.adaming.myapp.service.chambre;

import java.util.List;

import com.adaming.myapp.entities.Chambre;
import com.adaming.myapp.exception.ParameterException;

public interface IserviceChambre {
	
	public Chambre addChambre(Chambre ch, Long idHotel) throws ParameterException;
	public Chambre deleteChambre(Long idChambre) throws ParameterException;
	public Chambre updateChambre(Chambre ch) throws ParameterException;
	public Chambre getChambre(Long idChambre) throws ParameterException;
	public List<Chambre> getChambres();
	public List<Chambre> getDispoChambres();

}
