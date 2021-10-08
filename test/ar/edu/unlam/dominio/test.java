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

		assertTrue(productora.agregarMusico(1, "carlos", "garcia", "charly garcia", true, true));

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
	public void verSiSeAgregaUnaBanda() {
		Productora productora = new Productora("Sony");
		Musico musico = new Musico(1, "carlos", "garcia", "charly garcia", true, true);
		
		Banda charly = new Banda (22, 1, Genero.ROCK);
		

		assertTrue(productora.agregarBanda(charly));

	}

	@Test
	public void verSiDevuelveUnaBanda() {
		Productora productora = new Productora("Sony");
		Musico musico = new Musico(1, "carlos", "garcia", "charly garcia", true, true);
		Banda banda = new Banda(1, 1, Genero.ROCK);
		productora.agregarMusico(musico);

		productora.agregarBanda(banda);

		assertEquals(productora.buscarBanda(1), banda);

	}

	@Test
	public void verSiSeAgreganMusicosAUnaBanda() {
		Banda banda = new Banda(1, 1, Genero.ROCK);
		Musico musico = new Musico(1, "carlos", "garcia", "charly garcia", true, true);

		assertFalse(banda.buscarMusico(1));

		assertTrue(banda.agregarMusico(musico));

		assertTrue(banda.buscarMusico(1));
	}

	@Test
	public void verSiSeCreaUnFestival() {

		Festival festival = new Festival("lolla", 3, 1, 100);


		assertEquals(festival, festival);
	}

	@Test
	public void verSiSeGuardaUnFestival() {

		Festival festival = new Festival("lolla", 3, 1, 50);
		Productora productora = new Productora("Sony");

		assertTrue(productora.agregarFestival(festival));
		assertTrue(productora.buscarFestival(1));

	}

	@Test
	public void verSiSeQuitaUnFestival() {

		Festival festival = new Festival("lolla", 3, 1, 60);

		Productora productora = new Productora("Sony");

		productora.agregarFestival(festival);
		assertTrue(productora.buscarFestival(1));
		assertTrue(productora.quitarFestival(1));
		assertFalse(productora.buscarFestival(1));

	}

	@Test
	public void verSiSeOrganizaUnFestival() {
		Productora productora = new Productora("Sony");
		Banda banda = new Banda(1, 1, Genero.ROCK);
		Musico musico = new Musico(1, "carlos", "garcia", "charly garcia", true, true);

		productora.agregarMusico(musico);
		productora.agregarBanda(banda);


		assertTrue(productora.organizarFestival(1, "lolla", 3, 1, 100));


	}

	@Test
	public void queSeQuiteMusicoCorrectamente() {
		Productora productora = new Productora("Sony");
		Musico musico = new Cantante(1, "carlos", "garcia", "charly garcia", true, true, true);
		Musico musico2 = new Bajista(2, "pablo", "maitini", "shushu", false, false, true, UsoCuerdas.CON_PUA);
		Musico musico3 = new Baterista(3, "nahuel", "apellido", "El edgy", true, true, true, 6);
		Musico musico4 = new Guitarrista(4, "maria chiara", "espinoza", "avril lavigne", true, true, true,
				TipoGuitarra.ELECTRICA, UsoCuerdas.CON_PUA);
		Banda laNuevaLuna = new Banda (420, 4, Genero.CUMBIA);
		
		laNuevaLuna.agregarMusico(musico);
		laNuevaLuna.agregarMusico(musico2);
		laNuevaLuna.agregarMusico(musico3);
		laNuevaLuna.agregarMusico(musico4);
		
		productora.agregarBanda(laNuevaLuna);
		
		assertTrue(productora.quitarMusicoDeUnaBanda(420, 3));
	}
	
	@Test
	public void queSeQuiteUnaBandaCorrectamente() {
		Productora productora = new Productora("Sony");
		Banda laNuevaLuna = new Banda (420, 4, Genero.CUMBIA);
		
		productora.agregarBanda(laNuevaLuna);
		
		assertTrue(productora.quitarBanda(420));
	}

}
