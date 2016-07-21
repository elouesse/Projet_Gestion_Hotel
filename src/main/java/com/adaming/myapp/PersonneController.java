package com.adaming.myapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import com.adaming.myapp.exception.ParameterException;
import com.adaming.myapp.model.ClientModel;
import com.adaming.myapp.model.EmployeModel;
import com.adaming.myapp.model.EmployeSaisonModel;
import com.adaming.myapp.model.PersonneModel;
import com.adaming.myapp.model.PersonneModel2;
import com.adaming.myapp.model.PersonneModel3;
import com.adaming.myapp.service.hotel.IserviceHotel;
import com.adaming.myapp.service.person.IservicePersonne;

/**
 * Nom Classe: PersonneController
 * 
 * @author Eli, Thierry Version: 1.0 Date: 11/07/2016
 * @param <BindiBindingResult>
 *
 */


@Controller
public class PersonneController<BindiBindingResult> {
	
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
	public String addClient(@ModelAttribute("modelClient") @Valid ClientModel cm, BindingResult result, Model model) throws ParameterException{
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		cm.setListeDesHotels(tabho);
		model.addAttribute("modelClient", cm);
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
		servicePersonne.addPersonne(cl, cm.getIdHotel());	
		
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
	
	@RequestMapping(value="/addContra", method = RequestMethod.POST)
	public String indexPersonneContra(Model model, EmployeModel em){
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		em.setListeDesHotels(tabho);;
		model.addAttribute("modelEmploye", em);
		return "PersonneContra";
	}
	
	@RequestMapping(value="/validContra", method = RequestMethod.POST)
	public String addContra(@ModelAttribute("modelEmploye") @Valid EmployeModel em,  BindingResult result, Model model) throws ParameterException{
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		em.setListeDesHotels(tabho);;
		model.addAttribute("modelEmploye", em);
		if (result.hasErrors()) {
			return "PersonneContra";
		}	
		System.out.println("Contrat");
		Personne contra = new Contractuel(em.getNomPersonne(), em.getPrenomPersonne(),
				em.getDateDeNaissance(), em.getAdrPersonne(), em.getAdrEmail(),
				em.getNumeroTelephone(), em.getSalaire(), em.getDateEntreService(),
				em.getPrime());
		servicePersonne.addPersonne(contra, em.getIdHotel());
		return "redirect:Personne1";
	}
	@RequestMapping(value="/addSaison", method = RequestMethod.POST)
	public String indexPersonneSaison(Model model, EmployeSaisonModel esm){
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		esm.setListeDesHotels(tabho);;
		model.addAttribute("modelEmploye", esm);
		return "PersonneSaison";
	}
	
	@RequestMapping(value="/validSaison", method = RequestMethod.POST)
	public String addSaison(@ModelAttribute("modelEmploye") @Valid EmployeSaisonModel esm,  BindingResult result, Model model) throws ParameterException{
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		esm.setListeDesHotels(tabho);;
		model.addAttribute("modelEmploye", esm);
		if (result.hasErrors()) {
			return "PersonneSaison";
		}	
		System.out.println("Contrat");
		Personne saison = new Saisonnier(esm.getNomPersonne(), esm.getPrenomPersonne(),
				esm.getDateDeNaissance(), esm.getAdrPersonne(), esm.getAdrEmail(),
				esm.getNumeroTelephone(), esm.getSalaire(), esm.getDateEntreService(),
				esm.getDateSortieService());
		servicePersonne.addPersonne(saison, esm.getIdHotel());
		return "redirect:Personne1";
	}
	@RequestMapping(value="Personne5", method=RequestMethod.GET)
	public String getListDesPersonnes(Model model, @ModelAttribute("modelPersonne") @Valid PersonneModel pm, BindingResult result){
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		pm.setListeDesHotels(tabho);;
		model.addAttribute("modelPersonne", pm);
		if (result.hasErrors()) {
			return "Personne5";
		}
		List<Personne> pers = serviceHotel.getListeDesClients(pm.getIdHotel());
		pm.setLaListeDesPersonnes(pers);		
		List<Personne> empl = serviceHotel.getListeDesEmployes(pm.getIdHotel());
		pm.setLaListeDesEmployes(empl);
		model.addAttribute("modelPersonne", pm);
		System.out.println(pm.getIdHotel());
		return "Personne5";
	}
		//----------- PAGE 4--------------
	@RequestMapping(value="/Personne4", method = RequestMethod.GET)
	public String getPersonne(PersonneModel2 pm, Model model){
		List<Personne> pers = servicePersonne.getPersonnes();
		pm.setLaListeDesPersonnes(pers);
		model.addAttribute("modelPersonne", pm);
		return "Personne4";
	}
	@RequestMapping(value="/Personne4", method = RequestMethod.POST)
	public String getPersonneParId(Model model, @ModelAttribute("modelPersonne") @Valid PersonneModel2 pm, BindingResult result) throws ParameterException{
		List<Personne> pers = servicePersonne.getPersonnes();
		pm.setLaListeDesPersonnes(pers);
		if (result.hasErrors()) {
			return "Personne4";
		}	
		System.out.println(pm.getIdPersonne());
		List<Personne> perso = new ArrayList<Personne>();
		perso.add(servicePersonne.getPersonne(pm.getIdPersonne()));
		pm.setLaListeDesContrat(perso);
		model.addAttribute("modelPersonne", pm);
		return "Personne4";
	}
		// ------------PAGE 6------------
	@RequestMapping(value="/Personne6", method = RequestMethod.GET)
	public String getPersonneParMc(PersonneModel2 pm, Model model){
		List<Personne> pers = servicePersonne.getPersonnes();
		pm.setLaListeDesPersonnes(pers);
		model.addAttribute("modelPersonne", pm);
		return "Personne6";
	}
	@RequestMapping(value="/Personne6", method = RequestMethod.POST)
	public String getPersonneParMC(Model model, @ModelAttribute("modelPersonne") @Valid PersonneModel3 pm, BindingResult result, @RequestParam String mc) throws ParameterException{
		List<Personne> pers = servicePersonne.getPersonnes();
		pm.setLaListeDesPersonnes(pers);
		if (result.hasErrors()) {
			System.out.println(result);
			return "Personne6";
		}	
		List<Personne> perso = servicePersonne.getPersonneByMc(mc);
		pm.setLaListeDesContrat(perso);
		model.addAttribute("modelPersonne", pm);
		return "Personne6";
	}
	// --------------PAGE 3-----------------
	@RequestMapping(value="/Personne3", method = RequestMethod.GET)
	public String deletePersonne(PersonneModel2 pm, Model model){
		List<Personne> pers = servicePersonne.getPersonnes();
		pm.setLaListeDesPersonnes(pers);
		model.addAttribute("modelPersonne", pm);
		return "Personne3";
	}
	@RequestMapping(value="/deletePersonne",method=RequestMethod.POST)
	public String suprimer(Model model, @ModelAttribute("modelPersonne") @Valid PersonneModel2 pm, BindingResult result,@RequestParam Long idPersonne) throws ParameterException{
		List<Personne> pers = servicePersonne.getPersonnes();
		pm.setLaListeDesPersonnes(pers);
		model.addAttribute("modelPersonne", pm);
		System.out.println(result);
		if (result.hasErrors()) {
			return "Personne3";
		}
		servicePersonne.deletePersonne(idPersonne);
		model.addAttribute("modelPersonne",pm);
		return "redirect:Personne3";
	}
			// -------------PAGE 2------------ !!!
	@RequestMapping(value="/Personne2", method = RequestMethod.GET)
	public String updatePersonne(PersonneModel2 pm, Model model){
		List<Personne> pers = servicePersonne.getPersonnes();
		pm.setLaListeDesPersonnes(pers);
		model.addAttribute("modelPersonne", pm);
		return "Personne2";
	}
	
	@RequestMapping(value="/updateClient", method = RequestMethod.POST)
	public String updateClient(ClientModel cm, Model model){
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		cm.setListeDesHotels(tabho);;
		model.addAttribute("modelClient", cm);
		return "Personne2Client";
	}
	@RequestMapping(value="/validUpdate", method = RequestMethod.POST)
	public String updateClie(@ModelAttribute("modelClient") @Valid ClientModel cm, BindingResult result, Model model) throws ParameterException{
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		cm.setListeDesHotels(tabho);
		model.addAttribute("modelClient", cm);
		if (result.hasErrors()) {
			return "Personne2Client";
		}
		System.out.println(result);
		Personne cl = new Client(cm.getNomPersonne(), 
				cm.getPrenomPersonne(), cm.getDateDeNaissance(),
				cm.getAdrPersonne(), cm.getAdrEmail(), cm.getNumeroTelephone()
				, new Date(), cm.getReduction(),
				cm.getNombreReservation());
		System.out.println(cl.getDateDeNaissance()+" "+cl.getNomPersonne());
		servicePersonne.updatePersonne(cl);	
		
		return "redirect:Personne2";
	}
	
	
	
	
	
	@RequestMapping(value="/updateSaison", method = RequestMethod.POST)
	public String updateSaison(PersonneModel2 pm, Model model){
		List<Personne> pers = servicePersonne.getPersonnes();
		pm.setLaListeDesPersonnes(pers);
		model.addAttribute("modelPersonne", pm);
		return "Personne2";
	}
	@RequestMapping(value="updateContra", method = RequestMethod.POST)
	public String updateContra(PersonneModel2 pm, Model model){
		List<Personne> pers = servicePersonne.getPersonnes();
		pm.setLaListeDesPersonnes(pers);
		model.addAttribute("modelPersonne", pm);
		return "Personne2";
	}

}
