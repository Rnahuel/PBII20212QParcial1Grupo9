package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {
	
	//Tests De Productora
	@Test
	public void verSiSeCreaUnaProductora() {

		Productora productora = new Productora("Sony");

		assertEquals(productora, productora);
	}

	@Test
	public void queSeQuiteUnaBandaCorrectamente() {
		Productora productora = new Productora("Sony");
		Banda laNuevaLuna = new Banda (420, 4, Genero.CUMBIA);
		
		productora.agregarBanda(laNuevaLuna);
		
		assertTrue(productora.quitarBanda(420));
	}
	
	@Test
	public void verSiSeAgregaUnMusico() {
		Productora productora = new Productora("Sony");
		Musico musico = new Cantante(1, "carlos", "garcia", "charly garcia", true, true, true);

		assertTrue(productora.agregarMusico(musico));

	}
	
	@Test
	public void verSiSeBuscaUnMusicoCorrectamente() {
		Productora productora = new Productora("Sony");
		Musico musico = new Cantante(1, "carlos", "garcia", "charly garcia", true, true, true);
		productora.agregarMusico(musico);

		assertEquals(musico, productora.buscarMusico(1));

	}
	
	@Test
	public void verSiSeQuitaUnMusico() {
		Productora productora = new Productora("Sony");
		Musico musico = new Cantante(1, "carlos", "garcia", "charly garcia", true, true, true);
		productora.agregarMusico(musico);

		assertEquals(musico, productora.buscarMusico(1));

		assertTrue(productora.quitarMusico(1));
	}
	
	@Test
	public void verSiSeAgregaUnFestival() {
		Productora productora = new Productora("Sony");
		Festival festival = new Festival("lolla", 3, 1, 100);
		
		assertTrue(productora.agregarFestival(festival));
	}
	
	@Test
	public void verSiSeQuitaUnFestival() {

		Festival festival = new Festival("lolla", 3, 1, 60);
		Productora productora = new Productora("Sony");

		productora.agregarFestival(festival);
		
		assertTrue(productora.quitarFestival(1));
		assertFalse(productora.buscarFestival(1));

	}
	
	@Test
	public void buscarUnFestival() {

		Festival festival = new Festival("lolla", 3, 1, 60);
		Productora productora = new Productora("Sony");

		productora.agregarFestival(festival);
		
		assertTrue(productora.buscarFestival(1));
	}
	
	@Test
	public void verSiSeAgregaUnaBandaEnProductora() {
		Productora productora = new Productora("Sony");
		Banda charly = new Banda (22, 1, Genero.ROCK);
		
		assertTrue(productora.agregarBanda(charly));
	}
	
	@Test
	public void verSiBuscaUnaBandaCorrectamente() {
		Productora productora = new Productora("Sony");
		Banda banda = new Banda(1, 1, Genero.ROCK);
		
		productora.agregarBanda(banda);

		assertEquals(banda, productora.buscarBanda(1));

	}
	
	@Test
	public void verSiSeAgreganMusicosAUnaBanda() {
		Productora productora = new Productora("Sony");
		Banda banda = new Banda(1, 1, Genero.ROCK);
		Musico musico = new Cantante(1, "carlos", "garcia", "charly garcia", true, true, true);

		productora.agregarBanda(banda);
		assertTrue(productora.agregarMusicoAUnaBanda(1, 1));
	}
	
	@Test
	public void verSiQuitamosMusicosAUnaBanda() {
		Productora productora = new Productora("Sony");
		Banda banda = new Banda(1, 1, Genero.ROCK);
		Musico musico = new Cantante(1, "carlos", "garcia", "charly garcia", true, true, true);
		
		banda.agregarMusico(musico);
		productora.agregarBanda(banda);
		productora.agregarMusicoAUnaBanda(1, 1);
		assertTrue(productora.quitarMusicoDeUnaBanda(1, 1));
	}
	
	//Tests De Banda
	@Test 
	public void quitarMusicoEnBanda() {
		Banda banda = new Banda(1, 1, Genero.ROCK);
		Musico musico = new Baterista(2, "pablo", "maitini", "shushu", false, false, true, 5);
		
		banda.agregarMusico(musico);
		assertTrue(banda.quitarMusico(2));
	}

	//Test De Festival
	
}
