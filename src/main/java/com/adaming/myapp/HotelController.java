package com.adaming.myapp;

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

import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.model.HotelModel;
import com.adaming.myapp.service.hotel.IserviceHotel;

/**
 * Nom Classe: HotelController
 * 
 * @author Eli, Thierry Version: 1.0 Date: 11/07/2016
 *
 */
@Controller
public class HotelController {
	@Autowired
	private IserviceHotel serviceHotel;
	
	@RequestMapping(value="/Hotel1", method = RequestMethod.GET)
	public String indexHotel1(HotelModel hm,Model model){
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		hm.setListeDesHotels(tabho);
		model.addAttribute("modelHotel", hm);
		return "Hotel1";
	}
	@RequestMapping(value="/addHotel", method = RequestMethod.POST)
	public String addProduit(@ModelAttribute("modelHotel") @Valid HotelModel hm, BindingResult result){
		if(result.hasErrors()){
			return "Hotel1";
		}
		Hotel h = new Hotel(hm.getNomHotel(), hm.getAdrHotel(), hm.getClasseHotel(),
		hm.getPays(), hm.getCodePostal(), hm.getNumTel(), hm.getNumFax(), hm.getAdrMail());
		serviceHotel.addHotel(h);
	return "Hotel1";
	}
	
	@RequestMapping(value="/Hotel2", method = RequestMethod.GET)
	public String indexHotel2(HotelModel hm,Model model){
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		hm.setListeDesHotels(tabho);
		model.addAttribute("modelHotel", hm);
		return "Hotel2";
	}
	
	@RequestMapping(value="/getListEmp", method = RequestMethod.POST)
	public String getListEmp(HotelModel hm,Model model, @RequestParam Long idHotel){
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		hm.setListeDesHotels(tabho);
		model.addAttribute("modelHotel", hm);
		
		List<Personne> tabemp = serviceHotel.getListeDesEmployes(idHotel);
		hm.setListeDesPersonnes(tabemp);
		model.addAttribute("modelHotel", hm);
		return "Hotel2";
	}
	
	@RequestMapping(value="/Hotel3", method = RequestMethod.GET)
	public String indexHotel3(HotelModel hm,Model model){
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		hm.setListeDesHotels(tabho);
		model.addAttribute("modelHotel", hm);
		return "Hotel3";
	}
	
	@RequestMapping(value="/getListCli", method = RequestMethod.POST)
	public String getListCli(HotelModel hm,Model model,@RequestParam Long idHotel){
		List<Hotel> tabho = serviceHotel.getListeDesHotels();
		hm.setListeDesHotels(tabho);
		model.addAttribute("modelHotel", hm);
		
		List<Personne> tabcli = serviceHotel.getListeDesClients(idHotel);
		hm.setListeDesPersonnes(tabcli);
		model.addAttribute("modelHotel", hm);
		return "Hotel3";
	}
	

}
