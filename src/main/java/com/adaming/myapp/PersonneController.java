package com.adaming.myapp;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.entities.Contractuel;
import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.entities.Saisonnier;
import com.adaming.myapp.model.ClientModel;
import com.adaming.myapp.model.EmployeModel;
import com.adaming.myapp.model.PersonneModel;
import com.adaming.myapp.service.hotel.IserviceHotel;
import com.adaming.myapp.service.person.IservicePersonne;

/**
 * Nom Classe: PersonneController
 * 
 * @author Eli, Thierry Version: 1.0 Date: 11/07/2016
 *
 */


@Controller
public class PersonneController {
	
	@Autowired
	private IservicePersonne servicePersonne=null;
	@Autowired
	private IserviceHotel serviceHotel=null;
	
	@RequestMapping(value="/Personne1", method = RequestMethod.GET)
	public String indexPersonne1(Model model){
		model.addAttribute("modelPersonne", new PersonneModel());
		return "Personne1";
	}
	
	@RequestMapping(value="/validClient", method = RequestMethod.POST)
	public String addClient(@ModelAttribute("modelClient") @Valid ClientModel cm, @RequestParam Long idHotel, BindingResult result){
		System.out.println(idHotel);
		if (result.hasErrors()) {
			return "PersonneClient";
		}
		System.out.println(result);
		Personne cl = new Client(cm.getNomPersonne(), 
				cm.getPrenomPersonne(), cm.getDateDeNaissance(),
				cm.getAdrPersonne(), cm.getAdrEmail(), cm.getNumeroTelephone()
				, new Date(), cm.getReduction(),
				cm.getNombreReservation());
		System.out.println(cl.getDateDeNaissance()+" "+cl.getNomPersonne());
		servicePersonne.addPersonne(cl, 2L);	
		
		return "redirect:Personne1";
	}
	
	@RequestMapping(value="/PersonneClient", method = RequestMethod.GET)
	public String indexPersonneClient1(Model model){
		model.addAttribute("modelClient", new ClientModel());
		return "PersonneClient";
	}
	
	@RequestMapping(value="/addClient", method = RequestMethod.POST)
	public String indexPersonneClient2(ClientModel cm ,Model model){
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		cm.setListeDesHotels(tabho);;
		model.addAttribute("modelClient", cm);
		//model.addAttribute("modelClient", new ClientModel());
		return "PersonneClient";
	}
	
	@RequestMapping(value="/addEmploye", method = RequestMethod.POST)
	public String indexPersonneEmploye(Model model){
		model.addAttribute("modelEmploye", new EmployeModel());
		return "PersonneEmp";
	}
	
	@RequestMapping(value="/PersonneEmp", method = RequestMethod.GET)
	public String indexPersonneEmploye1(Model model){
		model.addAttribute("modelEmploye", new EmployeModel());
		return "PersonneEmp";
	}
	@RequestMapping(value="/validEmploye", method = RequestMethod.POST)
	public String adddEmploye(@ModelAttribute("modelEmploye") @Valid EmployeModel em,  BindingResult result, @RequestParam String typePersonne){
		System.out.println(typePersonne);
		if (result.hasErrors()) {
			return "PersonneEmp";
		}	
		else if (typePersonne.equals("1")) {
			System.out.println("Saison");
			Personne saison = new Saisonnier(em.getNomPersonne(), em.getPrenomPersonne(),
				em.getDateDeNaissance(), em.getAdrPersonne(), em.getAdrEmail(),
				em.getNumeroTelephone(), em.getSalaire(), em.getDateEntreService(),
				em.getDateSortieService());
			servicePersonne.addPersonne(saison, 1L);
		}
		else if (typePersonne.equals("2")) {
			System.out.println("Contrat");
			Personne contra = new Contractuel(em.getNomPersonne(), em.getPrenomPersonne(),
					em.getDateDeNaissance(), em.getAdrPersonne(), em.getAdrEmail(),
					em.getNumeroTelephone(), em.getSalaire(), em.getDateEntreService(),
					em.getPrime());
			servicePersonne.addPersonne(contra, 1L);
		}
		
		
		/*Personne cl = new Client(cm.getNomPersonne(), 
				cm.getPrenomPersonne(), cm.getDateDeNaissance(),
				cm.getAdrPersonne(), cm.getAdrEmail(), cm.getNumeroTelephone()
				, new Date(), cm.getReduction(),
				cm.getNombreReservation());
		System.out.println(cl.getDateDeNaissance()+" "+cl.getNomPersonne());
		servicePersonne.addPersonne(cl, 5L);*/	
		
		return "redirect:Personne1";
	}
	
	

}
