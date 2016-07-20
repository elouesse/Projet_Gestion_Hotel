package com.adaming.myapp;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.model.ProduitModel;
import com.adaming.myapp.service.produit.IserviceProduit;


/**
 * Nom Classe: ProduitController
 * 
 * @author Eli, Thierry Version: 1.0 Date: 11/07/2016
 *
 */
@Controller
public class ProduitController {
	
	@Autowired
	private IserviceProduit serviceProduit;
	
	@RequestMapping(value="/indexProduit", method = RequestMethod.GET)
	public String indexProduit(Model model){
		model.addAttribute("modelProduit", new ProduitModel());
		return "Produit1";
	}
	@RequestMapping(value="/addProduit", method = RequestMethod.POST)
	public String addProduit(@ModelAttribute("modelProduit") @Valid ProduitModel pm, BindingResult result){
		if(result.hasErrors()){
			return "Produit1";
		}
		Produit pr = new Produit(pm.getPrixProduit(), pm.getNomProduit(), pm.getReferenceProduit(), pm.getQuantiteProduite());
		serviceProduit.addProduit(pr);	
	return "Produit1";
	}
	
	@RequestMapping(value="/Produit1", method = RequestMethod.GET)
	public String indexProduit1(Model model){
		model.addAttribute("modelProduit", new ProduitModel());
		return "Produit1";
	}
	@RequestMapping(value="/Produit2", method = RequestMethod.GET)
	public String indexProduit2(ProduitModel pm,Model model){
		List<Produit> tabpro = serviceProduit.getListeDesProduits();
		pm.setListeProduit(tabpro);
		model.addAttribute("modelProduit", pm);
		return "Produit2";
	}
	@RequestMapping(value="/updateProduit", method = RequestMethod.POST)
	public String updateProduit(ProduitModel pm,Model model, @RequestParam Long idProduit){
		Produit tabpr = serviceProduit.getProduitParId(idProduit);
		tabpr.setNomProduit(pm.getNomProduit());
		tabpr.setPrixProduit(pm.getPrixProduit());
		tabpr.setReferenceProduit(pm.getReferenceProduit());
		tabpr.setQuantiteProduite(pm.getQuantiteProduite());
		serviceProduit.updateProduit(tabpr);
		System.out.println("aaaaaa");
		List<Produit> tabpro = serviceProduit.getListeDesProduits();
		pm.setListeProduit(tabpro);
		model.addAttribute("modelProduit", pm);
		return "Produit2";	
	}
	@RequestMapping(value="/Produit3", method = RequestMethod.GET)
	public String indexProduit3(ProduitModel pm, Model model){
		List<Produit> tabpro = serviceProduit.getListeDesProduits();
		pm.setListeProduit(tabpro);
		model.addAttribute("modelProduit", pm);
		return "Produit3";
	}
	@RequestMapping(value="/Produit4", method = RequestMethod.GET)
	public String indexProduit4(ProduitModel pm,Model model){
		List<Produit> tabpro = serviceProduit.getListeDesProduits();
		pm.setListeProduit(tabpro);
		model.addAttribute("modelProduit", pm);
		return "Produit4";
	}
	@RequestMapping(value="/Produit5", method = RequestMethod.GET)
	public String indexProduit5(ProduitModel pm , Model model){
		List<Produit> tabpro = serviceProduit.getListeDesProduits();
		pm.setListeProduit(tabpro);
		model.addAttribute("modelProduit", pm);
		return "Produit5";
	}
	@RequestMapping(value="/getProduit", method = RequestMethod.POST)
	public String getProduitparId(ProduitModel pm, ProduitModel prm , Model model, @RequestParam Long idProduit){
		List<Produit> tabpro = serviceProduit.getListeDesProduits();
		pm.setListeProduit(tabpro);
		model.addAttribute("modelProduit", pm);
		
		Produit tabpr = serviceProduit.getProduitParId(idProduit);
		List<Produit> tabprod = new ArrayList<Produit>();
		tabprod.add(tabpr);
		pm.setListeP(tabprod);
		model.addAttribute("modelProd", prm);
		return "Produit5";
	}
	@RequestMapping(value="/deleteProduit",method=RequestMethod.POST)
	public String suprimer(ProduitModel pm,@RequestParam Long idProduit, Model model){
		serviceProduit.deleteProduit(idProduit);
		model.addAttribute("modelProduit",pm);
		return "redirect:Produit3";
	}

}
