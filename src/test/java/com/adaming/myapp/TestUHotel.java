package com.adaming.myapp;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.myapp.entities.Hotel;
import com.adaming.myapp.entities.Personne;
import com.adaming.myapp.service.hotel.IserviceHotel;

public class TestUHotel {
		
		private static IserviceHotel serviceHotel;
		private static ClassPathXmlApplicationContext context;

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			context = new ClassPathXmlApplicationContext("app.xml");
			serviceHotel = (IserviceHotel) context.getBean("serviceHotel");
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			context.close();
		}

	
		/*@Test
		public void testAddHotel() {
			Hotel h = new Hotel("Hello", "11 rue", 5, "France","75000" , "03295613288", "032956722", "hello@gmail.com");
			serviceHotel.addHotel(h);
			assertNotNull(h.getNomHotel());
		}*/
	
		/*@Test
		public void testGetListeDesEmployes() {
			List<Personne> perso = serviceHotel.getListeDesEmployes(1L);
			assertNotNull(perso.size());
		}*/
	
		/*@Test
		public void testGetListeDesClients() {
			List<Personne> clie = serviceHotel.getListeDesClients(1L);
			assertNotNull(clie.size());
		}*/

}
