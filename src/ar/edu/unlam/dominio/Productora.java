package ar.edu.unlam.dominio;

public class Productora {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private Banda listaDeBandasProductora[];
	private Musico listaDeMusicosProductora[];
	private Festival festivales[];

	public Productora(String nombre) {

		this.nombre = nombre;
		this.listaDeBandasProductora = new Banda[100];
		this.listaDeMusicosProductora = new Musico[500];
		this.festivales = new Festival[50];
	}

	public Boolean agregarBanda(Integer idBanda, Integer nroIntegrantes, Genero gen, Integer idMusico) {
		Boolean seAgregoBanda = false;
		Musico musi = devolverMusico(idMusico);
		Banda banda = new Banda(idBanda, nroIntegrantes, gen);

		Boolean seAgregoMusico = banda.agregarMusico(musi);

		if (seAgregoMusico) {
			for (int i = 0; i < listaDeBandasProductora.length; i++) {
				if (listaDeBandasProductora[i] == null) {
					listaDeBandasProductora[i] = banda;
					seAgregoBanda = true;
					break;
				}
			}

		}
		return seAgregoBanda;
	}

	public Boolean agregarBanda(Integer idBanda, Integer nroIntegrantes, Genero gen, Integer idMusico,
			Integer idMusico2) {

		Boolean seAgregoBanda = false;
		Musico musi = devolverMusico(idMusico);
		Musico musi2 = devolverMusico(idMusico2);
		Banda banda = new Banda(idBanda, nroIntegrantes, gen);

		Boolean seAgregoMusico = banda.agregarMusico(musi);
		Boolean seAgregoMusico2 = banda.agregarMusico(musi2);

		if (seAgregoMusico && seAgregoMusico2) {
			for (int i = 0; i < listaDeBandasProductora.length; i++) {
				if (listaDeBandasProductora[i] == null) {
					listaDeBandasProductora[i] = banda;
					seAgregoBanda = true;
					break;
				}
			}

		}
		return seAgregoBanda;
	}

	public Boolean agregarBanda(Integer idBanda, Integer nroIntegrantes, Genero gen, Integer idMusico,
			Integer idMusico2, Integer idMusico3) {

		Boolean seAgregoBanda = false;
		Musico musi = devolverMusico(idMusico);
		Musico musi2 = devolverMusico(idMusico2);
		Musico musi3 = devolverMusico(idMusico3);
		Banda banda = new Banda(idBanda, nroIntegrantes, gen);

		Boolean seAgregoMusico = banda.agregarMusico(musi);
		Boolean seAgregoMusico2 = banda.agregarMusico(musi2);
		Boolean seAgregoMusico3 = banda.agregarMusico(musi3);

		if (seAgregoMusico && seAgregoMusico2 && seAgregoMusico3) {
			for (int i = 0; i < listaDeBandasProductora.length; i++) {
				if (listaDeBandasProductora[i] == null) {
					listaDeBandasProductora[i] = banda;
					seAgregoBanda = true;
					break;
				}
			}

		}
		return seAgregoBanda;
	}

	public Boolean agregarBanda(Integer idBanda, Integer nroIntegrantes, Genero gen, Integer idMusico,
			Integer idMusico2, Integer idMusico3, Integer idMusico4) {

		Boolean seAgregoBanda = false;
		Musico musi = devolverMusico(idMusico);
		Musico musi2 = devolverMusico(idMusico2);
		Musico musi3 = devolverMusico(idMusico3);
		Musico musi4 = devolverMusico(idMusico4);
		Banda banda = new Banda(idBanda, nroIntegrantes, gen);

		Boolean seAgregoMusico = banda.agregarMusico(musi);
		Boolean seAgregoMusico2 = banda.agregarMusico(musi2);
		Boolean seAgregoMusico3 = banda.agregarMusico(musi3);
		Boolean seAgregoMusico4 = banda.agregarMusico(musi4);

		if (seAgregoMusico && seAgregoMusico2 && seAgregoMusico3 && seAgregoMusico4) {
			for (int i = 0; i < listaDeBandasProductora.length; i++) {
				if (listaDeBandasProductora[i] == null) {
					listaDeBandasProductora[i] = banda;
					seAgregoBanda = true;
					break;
				}
			}

		}
		return seAgregoBanda;
	}

	public Boolean agregarBanda(Integer idBanda, Integer nroIntegrantes, Genero gen, Integer idMusico,
			Integer idMusico2, Integer idMusico3, Integer idMusico4, Integer idMusico5) {

		Boolean seAgregoBanda = false;
		Musico musi = devolverMusico(idMusico);
		Musico musi2 = devolverMusico(idMusico2);
		Musico musi3 = devolverMusico(idMusico3);
		Musico musi4 = devolverMusico(idMusico4);
		Musico musi5 = devolverMusico(idMusico5);
		Banda banda = new Banda(idBanda, nroIntegrantes, gen);

		Boolean seAgregoMusico = banda.agregarMusico(musi);
		Boolean seAgregoMusico2 = banda.agregarMusico(musi2);
		Boolean seAgregoMusico3 = banda.agregarMusico(musi3);
		Boolean seAgregoMusico4 = banda.agregarMusico(musi4);
		Boolean seAgregoMusico5 = banda.agregarMusico(musi5);

		if (seAgregoMusico && seAgregoMusico2 && seAgregoMusico3 && seAgregoMusico4 && seAgregoMusico5) {
			for (int i = 0; i < listaDeBandasProductora.length; i++) {
				if (listaDeBandasProductora[i] == null) {
					listaDeBandasProductora[i] = banda;
					seAgregoBanda = true;
					break;
				}
			}

		}
		return seAgregoBanda;
	}

	public Boolean quitarBanda(Integer id) {
		Boolean seQuito = false;
		for (int i = 0; i < listaDeBandasProductora.length; i++) {
			if (listaDeBandasProductora[i] != null && listaDeBandasProductora[i].getId().equals(id)) {
				listaDeBandasProductora[i] = null;
				seQuito = true;
				break;
			}
		}
		return seQuito;
	}

	public Boolean agregarMusico(Musico musico) {
		Boolean seAgregó = false;
		for (int i = 0; i < listaDeMusicosProductora.length; i++) {
			if (listaDeMusicosProductora[i] == null) {
				listaDeMusicosProductora[i] = musico;
				seAgregó = true;
				break;
			}
		}
		return seAgregó;
	}

	public Boolean buscarMusico(Integer id) {
		Boolean musicoEncontrado = false;
		for (int i = 0; i < listaDeMusicosProductora.length; i++) {
			if (listaDeMusicosProductora[i] != null && listaDeMusicosProductora[i].getId().equals(id)) {
				musicoEncontrado = true;
				break;
			}

		}
		return musicoEncontrado;
	}

	public Musico devolverMusico(Integer id) {
		Musico musicoEncontrado = null;
		for (int i = 0; i < listaDeMusicosProductora.length; i++) {
			if (listaDeMusicosProductora[i] != null && listaDeMusicosProductora[i].getId().equals(id)) {
				musicoEncontrado = listaDeMusicosProductora[i];
				break;
			}
		}
		return musicoEncontrado;
	}

	public Boolean quitarMusico(Integer id) {
		Boolean musicoBorrado = false;
		for (int i = 0; i < listaDeMusicosProductora.length; i++) {
			if (listaDeMusicosProductora[i] != null && listaDeMusicosProductora[i].getId().equals(id)) {
				listaDeMusicosProductora[i] = null;
				musicoBorrado = true;
				break;
			}

		}
		return musicoBorrado;

	}

	public Boolean agregarFestival(Festival festi) {
		Boolean agregado = false;
		for (int i = 0; i < festivales.length; i++) {
			if (festivales[i] == null) {
				festivales[i] = festi;
				agregado = true;
				break;
			}
		}
		return agregado;

	}

	public Boolean quitarFestival(Integer idFesti) {
		Boolean quitado = false;
		for (int i = 0; i < festivales.length; i++) {
			if (festivales[i] != null && festivales[i].getIdFesti() == idFesti) {
				festivales[i] = null;
				quitado = true;
				break;
			}
		}
		return quitado;
	}

	public Boolean buscarFestival(Integer idFesti) {
		Boolean encontrado = false;
		for (int i = 0; i < festivales.length; i++) {
			if (festivales[i] != null && festivales[i].getIdFesti() == idFesti) {
				encontrado = true;
				break;
			}
		}
		return encontrado;
	}

	public Boolean agregarBanda(Banda banda) {
		Boolean seAgregoBanda = false;

		for (int i = 0; i < listaDeBandasProductora.length; i++) {
			if (listaDeBandasProductora[i] == null) {
				listaDeBandasProductora[i] = banda;
				seAgregoBanda = true;
				break;

			}

		}
		return seAgregoBanda;
	}

	public Boolean organizarFestival(Integer idBanda, String nombreFesti, Integer diasDeDuracion, Integer idFesti, Integer cantidadToleradaDeEspectadores) {
		Festival festi = new Festival(nombreFesti, diasDeDuracion, idFesti, cantidadToleradaDeEspectadores);
		Banda banda = buscarBanda(idBanda);
		Boolean bandaAgregadaAFesti = false;
		Boolean festiGuardado = false;

		for (int i = 0; i < festi.getListaDeBandas().length; i++) {
			if (festi.getListaDeBandas()[i] == null) {
				festi.getListaDeBandas()[i] = banda;
				bandaAgregadaAFesti = true;
				break;
			}
		}

		if (bandaAgregadaAFesti) {
			for (int i = 0; i < festivales.length; i++) {
				if (festivales[i] == null) {
					festivales[i] = festi;
					festiGuardado = true;
					break;

				}
			}

		}
		return festiGuardado;
	}

	public Banda buscarBanda(Integer idBanda) {
		Banda banda = null;
		for (int i = 0; i < listaDeBandasProductora.length; i++) {
			if (listaDeBandasProductora[i] != null && listaDeBandasProductora[i].getId().equals(idBanda)) {
				banda = listaDeBandasProductora[i];
				break;
			}

		}
		return banda;

	}

	public Boolean agregarMusico(Integer idMusico, String nombre, String apellido, String nombreArtistico,
			Boolean formacionAcademica, Boolean manejaMasDeUnInstrumento) {
		Musico musico = new Musico(idMusico, nombre, apellido, nombreArtistico, formacionAcademica,
				manejaMasDeUnInstrumento);

		Boolean seAgregó = false;
		for (int i = 0; i < listaDeMusicosProductora.length; i++) {
			if (listaDeMusicosProductora[i] == null) {
				listaDeMusicosProductora[i] = musico;
				seAgregó = true;
				break;
			}
		}
		return seAgregó;

	}

}
