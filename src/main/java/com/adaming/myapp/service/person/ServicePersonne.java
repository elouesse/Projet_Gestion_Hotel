package com.adaming.myapp.service.person;


import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.person.IdaoPersonne;
import com.adaming.myapp.dao.reservation.IdaoReservation;
import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.entities.Reservation;
import com.adaming.myapp.exception.ParameterException;


@Transactional
public class ServicePersonne implements IservicePersonne {
	
	private IdaoPersonne dao;
	private IdaoReservation daoR;
	Logger log = Logger.getLogger("ServicePersonne");
	
	public void setDao(IdaoPersonne dao) {
		this.dao = dao;
		log.info("<--------------daoPersonne injected------------------>");
	}
	public void setDaoR(IdaoReservation daoR) {
		this.daoR = daoR;
		log.info("<--------------daoReservation injected------------------>");
	}

	@Override
	public Personne addPersonne(Personne p, Long idHotel) throws ParameterException {
		return dao.addPersonne(p, idHotel);
	}

	@Override
	public Personne updatePersonne(Personne p) throws ParameterException {
		return dao.updatePersonne(p);
	}

	@Override
	public Personne deletePersonne(Long id) throws ParameterException {
		return dao.deletePersonne(id);
	}

	@Override
	public Personne getPersonne(Long idPersonne) throws ParameterException {
		return dao.getPersonne(idPersonne);
	}

	@Override
	public List<Personne> getPersonnes() {
		return dao.getPersonnes();
	}

	@Override
	public List<Personne> getPersonneByMc(String mc) {
		return dao.getPersonneByMc(mc);
	}

	@Override
	public Double coutAnnuelParClient(Long idPersonne, Integer annee) throws ParameterException {
		Double total=0.0;
		Personne p = dao.getPersonne(idPersonne);
		for(Reservation r:p.getReserv())
		{
			Long id = r.getIdReservation();
			if(r.getDateSortie().getYear()==(annee-1900))
			{
				total = total+daoR.getTotalCostReservation(id);//
			}
		}
		
		return total;
	}

	@Override
	public Double coutSemestrielParClient(Long idPersonne, Integer annee,
			Integer semestre) throws ParameterException {
		Double total=0.0;
		Personne p = dao.getPersonne(idPersonne);
		for(Reservation r:p.getReserv())
		{
			Long id = r.getIdReservation();
			if(r.getDateSortie().getYear()==(annee-1900))
			{
				if(semestre==1)
				{
					if(r.getDateSortie().getMonth()>=0 && r.getDateSortie().getMonth()<6)
					{
						total = total+daoR.getTotalCostReservation(id);
					}
					
				}
				else if(semestre==2)
				{
					if(r.getDateSortie().getMonth()>=6 && r.getDateSortie().getMonth()<12)
					{
						total = total+daoR.getTotalCostReservation(id);
					}
				}
			}
		}
		
		return total;
	}


}
