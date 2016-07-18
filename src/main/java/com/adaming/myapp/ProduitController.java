package com.adaming.myapp;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	@RequestMapping(value="/addProduit")
	public String addProduit(@ModelAttribute("modelProduit") @Valid ProduitModel pm, BindingResult result){
		if(result.hasErrors()){
			return "Produit1";
		}
		Produit pr = new Produit(pm.getPrixProduit(), pm.getNomProduit(), pm.getReferenceProduit(), pm.getQuantiteProduite());
		serviceProduit.addProduit(pr);	
	return "Produit1";
	}

	

}
