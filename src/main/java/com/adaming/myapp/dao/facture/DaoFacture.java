package com.adaming.myapp.dao.facture;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Facture;
import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Reservation;
import com.adaming.myapp.exception.ParameterException;

/**
 * Nom Classe: Reservation
 * 
 * @author Eli, Thierry Version: 1.0 Date: 11/07/2016
 *
 */

public class DaoFacture implements IdaoFacture {

	Logger log = Logger.getLogger("DaoFacture");
	@PersistenceContext
	private EntityManager em;

	@Override
	public Facture addFacture(Facture f, Long idReserv, Long idHotel) throws ParameterException {
		Reservation r = em.find(Reservation.class, idReserv);
		if(r==null)
		{
			throw new ParameterException("La reservation referee n'existe pas.");
		}
		if(r.getChambre().getHotel().getIdHotel()!=idHotel)
		{
			throw new ParameterException("L'hotel indique ne correspond pas a cette reservation.");
		}
		Hotel h = em.find(Hotel.class, idHotel);
		if(h==null)
		{
			throw new ParameterException("L'hotel referee n'existe pas.");
		}
		f.setHotel(h);
		r.setFacture(f);
		em.persist(f);
		log.info("La facture " + f.getIdFacture() + " a bien été enregistré!");
		return f;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Facture> getListeDesFacturesParClient(Long idClient) throws ParameterException {
		Query req = em.createQuery("from Facture");
		Client p = em.find(Client.class, idClient);
		if(p==null)
		{
			throw new ParameterException("Le client referee n'existe pas.");
		}
		List<Facture> tab = req.getResultList();
		List<Facture> tabf = new ArrayList<Facture>();
		for(Facture f:tab )
		{
			for(int i=0;i<p.getReserv().size();i++)
			{
				if(p.getReserv().get(i).getFacture()==f)
				{
					tabf.add(f);
				}
			}
		}
		log.info("Pour le client " + idClient + ", la liste contient "
				+ tabf.size() + " factures");
		return tabf;
	}

}
