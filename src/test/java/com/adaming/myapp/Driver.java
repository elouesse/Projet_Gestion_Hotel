package com.adaming.myapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javassist.compiler.ast.NewExpr;

import org.hibernate.mapping.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
import com.adaming.myapp.entities.Carte;
import com.adaming.myapp.entities.Chambre;
import com.adaming.myapp.entities.ChambreDouble;
import com.adaming.myapp.entities.ChambreSimple;
import com.adaming.myapp.entities.Cheque;
import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Contractuel;
import com.adaming.myapp.entities.Espece;
import com.adaming.myapp.entities.Facture;
import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.entities.Reservation;
import com.adaming.myapp.entities.Saisonnier;
import com.adaming.myapp.entities.Suite;
import com.adaming.myapp.service.chambre.IserviceChambre;
import com.adaming.myapp.service.consommation.IserviceConsommation;
import com.adaming.myapp.service.facture.IserviceFacture;
import com.adaming.myapp.service.hotel.IserviceHotel;
import com.adaming.myapp.service.paiement.IservicePaiement;
import com.adaming.myapp.service.person.IservicePersonne;
import com.adaming.myapp.service.produit.IserviceProduit;
import com.adaming.myapp.service.reservation.IserviceReservation;

public class Driver {

	public static void main(String[] args) throws ParseException {
		
		IserviceHotel serviceh;
		IserviceChambre servicech;
		IserviceConsommation servicecon;
		IserviceFacture servicefact;
		IservicePaiement servicepai;
		IservicePersonne serviceper;
		IserviceProduit servicepro;
		IserviceReservation serviceresa;
		
		ClassPathXmlApplicationContext context;
		context= new ClassPathXmlApplicationContext("app.xml");
		
		serviceh= (IserviceHotel) context.getBean("serviceHotel");
		servicech= (IserviceChambre) context.getBean("serviceChambre");
		servicecon= (IserviceConsommation) context.getBean("serviceConsommation");
		servicefact= (IserviceFacture) context.getBean("serviceFacture");
		servicepai= (IservicePaiement) context.getBean("servicePaiement");
		serviceper=(IservicePersonne) context.getBean("servicePersonne");
		servicepro=(IserviceProduit) context.getBean("serviceProduit");
		serviceresa=(IserviceReservation) context.getBean("serviceReservation");
		
		//serviceresa.addReservation(new Reservation(new Date(), new Date()), 2L, 3L);
		//serviceresa.addReservation(new Reservation(new Date(), new Date()), 3L, 3L);
		//serviceresa.deleteReservation(3L);
		//serviceresa.getReservations(3L);
		Date d = new SimpleDateFormat("yyyy/MM/dd").parse("2007/01/01");
		
		serviceresa.getReservationParResa(4L);
		serviceresa.getReservationParChambre(2L);
		
		
		//Reservation r = serviceresa.addReservation(new Reservation(new Date(), new Date()) , 2L, 2L);
		//r.setDateArrivee(d);
		//serviceresa.updateReservation(r);
		//servicepai.addPaiement(new Carte(new Date(), "VISA", "123456"), 10L);
		//servicepai.addPaiement(new Cheque(new Date(), "125422"), 10L);
		//servicepai.addPaiement(new Espece(new Date()), 10L);
		//servicefact.addFacture(new Facture(new Date(), 20d), 1L, 1L);
		//serviceresa.addReservation(new Reservation(new Date(), new Date()), 1L, 1L);
		//serviceh.addHotel(new Hotel("Hotel room", "h", 3, "C", "M", "3", "3", "ho"));
		//serviceh.addHotel(new Hotel("Le grand Hotel", "12 rue du", 5, "France", "95000", "0329560000", "03", "hotel@gmail.com"));
		//servicech.addChambre(new ChambreDouble(102, 100d, 30d, 2, 2, 2), 1L);
		//servicech.addChambre(new ChambreDouble(103, 100d, 30d, 2, 2, 2), 1L);
		//serviceper.addPersonne(new Client("ZABE", "Thierry", new Date(), "11 rue","titi@gmail" , "062525525", new Date(), 20d, 10), 1L);
	
		//serviceh.getListeDesClients(1L);
//		System.out.println(serviceh.getListeDesClients(1L));
//		serviceh.getListeDesEmployes(1L);
		
		//DaoHotel OK mais constructeur à revoir! Entité à modifier pour Elie! et requete daohotel
		
		//System.out.println(serviceh.getListeDesEmployes(1L));
		
		
		//h.addHotel(new Hotel("H", "h", 3, "C", "M", "3", "3", "ho"));
		//h.addHotel(new Hotel("HolidayInn", "6 Blvd New Haven", 3, "Canada", "M6E1Y3", "3213455354", "3213456589", "holidayinn@gmail.com"));
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
