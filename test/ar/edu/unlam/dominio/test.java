package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void verSiSeCreaUnaProductora() {

		Productora productora = new Productora("Sony");

		assertEquals(productora, productora);
	}

	@Test
	public void verSiSeCreaUnMusico() {

		Musico musico = new Musico(1, "carlos", "garcia", "charly garcia", true, true);

		assertEquals(musico, musico);

	}

	@Test
	public void verSiSeGuardaUnMusico() {
		Productora productora = new Productora("Sony");
		Musico musico = new Musico(1, "carlos", "garcia", "charly garcia", true, true);

		assertTrue(productora.agregarMusico(musico));

	}

	@Test
	public void verSiSeEncuentraUnMusico() {
		Productora productora = new Productora("Sony");
		Musico musico = new Musico(1, "carlos", "garcia", "charly garcia", true, true);
		productora.agregarMusico(musico);

		assertTrue(productora.buscarMusico(1));

	}

	@Test
	public void verSiSeQuitaUnMusico() {
		Productora productora = new Productora("Sony");
		Musico musico = new Musico(1, "carlos", "garcia", "charly garcia", true, true);
		productora.agregarMusico(musico);

		assertTrue(productora.buscarMusico(1));

		assertTrue(productora.quitarMusico(1));

		assertFalse(productora.buscarMusico(1));

	}

	@Test
	public void verSiSeCreaUnaBanda() {
		Banda banda = new Banda(1, 1, Genero.ROCK);

		assertEquals(banda, banda);
	}
	
	@Test
	public void verSiSeAgreganMusicosAUnaBanda() {
		Banda banda = new Banda(1, 1, Genero.ROCK);
		Musico musico = new Musico(1, "carlos", "garcia", "charly garcia", true, true);
		
		assertFalse(banda.buscarMusico(1));
		
		assertTrue(banda.agregarMusico(musico));
		
		assertTrue(banda.buscarMusico(1));
	}
	

	
}
