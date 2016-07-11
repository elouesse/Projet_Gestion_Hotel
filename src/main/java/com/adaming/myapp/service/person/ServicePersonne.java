package com.adaming.myapp.service.person;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.adaming.myapp.dao.person.IdaoPersonne;
import com.adaming.myapp.entities.Personne;


@Transactional
public class ServicePersonne implements IservicePersonne {
	
	private IdaoPersonne dao;
	Logger log = Logger.getLogger("ServicePersonne");
	
	public void setDao(IdaoPersonne dao) {
		this.dao = dao;
		log.info("<--------------daoPersonne injected------------------>");
	}

	@Override
	public Personne addPersonne(Personne p, Long idHotel) {
		return dao.addPersonne(p, idHotel);
	}

	@Override
	public Personne updatePersonne(Personne p) {
		return dao.updatePersonne(p);
	}

	@Override
	public Personne deletePersonne(Long id) {
		return dao.deletePersonne(id);
	}

	@Override
	public Personne getPersonne(Long idPersonne) {
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

}
