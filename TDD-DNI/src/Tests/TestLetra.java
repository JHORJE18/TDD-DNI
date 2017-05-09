package Tests;

import static org.junit.Assert.*;
import Logica.CalcularLetra;
import org.junit.Test;

public class TestLetra {
	
	//Variables
	String dni = "53606265";

	@Test
	public void test() {
		CalcularLetra cl = new CalcularLetra(dni);
		
		assertTrue("La letra coincide", cl.devolverLetra() == 'G');
		System.out.println("La letra de tu DNI es " + cl.devolverLetra());
		System.out.println("DNI: " + dni + cl.devolverLetra());
	}

}
