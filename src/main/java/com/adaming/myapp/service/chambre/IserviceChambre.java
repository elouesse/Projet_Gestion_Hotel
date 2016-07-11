package com.adaming.myapp.service.chambre;

import java.util.List;

import com.adaming.myapp.entities.Chambre;

public interface IserviceChambre {
	
	public Chambre addChambre(Chambre ch, Long idHotel);
	public Chambre deleteChambre(Long idChambre);
	public Chambre updateChambre(Chambre ch);
	public Chambre getChambre(Long idChambre);
	public List<Chambre> getChambres();
	public List<Chambre> getDispoChambres();

}
