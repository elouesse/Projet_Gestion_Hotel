package com.adaming.myapp;

import java.util.Date;

import com.adaming.myapp.dao.chambre.DaoChambre;
import com.adaming.myapp.dao.chambre.IdaoChambre;
import com.adaming.myapp.dao.hotel.DaoHotel;
import com.adaming.myapp.dao.hotel.IdaoHotel;
import com.adaming.myapp.dao.person.DaoPersonne;
import com.adaming.myapp.dao.person.IdaoPersonne;
import com.adaming.myapp.dao.produit.DaoProduit;
import com.adaming.myapp.dao.produit.IdaoProduit;
import com.adaming.myapp.dao.reservation.DaoReservation;
import com.adaming.myapp.dao.reservation.IdaoReservation;
import com.adaming.myapp.entities.ChambreDouble;
import com.adaming.myapp.entities.ChambreSimple;
import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.entities.Suite;

public class Driver {

	public static void main(String[] args) {
		
		IdaoPersonne p = new DaoPersonne();
		IdaoHotel h = new DaoHotel();
		IdaoProduit pr = new DaoProduit();
		IdaoChambre ch = new DaoChambre();
		IdaoReservation r = new DaoReservation();
		
		h.addHotel(new Hotel("H", "h", 3, "C", "M", "3", "3", "ho"));
		h.addHotel(new Hotel("HolidayInn", "6 Blvd New Haven", 3, "Canada", "M6E1Y3", "3213455354", "3213456589", "holidayinn@gmail.com"));
//		p.addPersonne(new Client("Louess", "Eli", new Date(), "37 Holmesdale", "elouesse@hotmail", "3216475626"), 1L);
//		p.addPersonne(new Client("sad", "hap", new Date(), "553 Hogfe", "esf@vn", "32154324"), 1L);
//		p.addPersonne(new Client("dfs", "gs", new Date(), "723 jf", "yjfj@vdh", "321gsg"), 1L);
//		pr.addProduit(new Produit(800.50, "rs", "hdf", 56));
//		pr.addProduit(new Produit(63.40, "gsgs", "aaw", 2));
//		ch.addChambre(new ChambreSimple(23, 5), 1L);
//		ch.addChambre(new ChambreDouble(10, 2), 1L);
//		ch.addChambre(new Suite(4, 1), 1L);
		
		
		

	}

}
