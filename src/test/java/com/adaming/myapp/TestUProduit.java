package com.adaming.myapp;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.myapp.entities.Produit;
import com.adaming.myapp.service.produit.IserviceProduit;

public class TestUProduit {
	
	private static IserviceProduit serviceProduit;
	private static ClassPathXmlApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context =new ClassPathXmlApplicationContext("app.xml");
		serviceProduit = (IserviceProduit) context.getBean("serviceProduit");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/*@Test
	public void testAddProduit() {
		Produit p = new Produit(120d, "COCA", "1256", 50);
		serviceProduit.addProduit(p);
		assertNotNull(p.getNomProduit());
	}*/

	/*@Test
	public void testUpdateProduit() {
		Produit p1 =serviceProduit.getProduitParId(1L);
		p1.setNomProduit("COCAZERO");
		serviceProduit.updateProduit(p1);
		Produit p2=serviceProduit.getProduitParId(1L);
		assertEquals(p1.getNomProduit(), p2.getNomProduit());
	}*/

	/*@Test
	public void testDeleteProduit() {
		List<Produit> prod = serviceProduit.getListeDesProduits();
		serviceProduit.deleteProduit(2L);
		List<Produit> pro = serviceProduit.getListeDesProduits();
		assertNotSame(prod.size(), pro.size());
	}*/

	/*@Test
	public void testGetListeDesProduits() {
		List<Produit> pr = serviceProduit.getListeDesProduits();
		assertNotNull(pr.size());
	}*/

	/*@Test
	public void testGetProduitParId() {
		Produit p = serviceProduit.getProduitParId(1L);
		assertSame(p.getIdProduit(), 1L);
	}*/

}
