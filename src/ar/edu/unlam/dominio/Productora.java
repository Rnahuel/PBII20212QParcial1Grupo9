package ar.edu.unlam.dominio;

public class Productora {

	private String nombre;
	private Banda listaDeBandasProductora[];
	private Musico listaDeMusicosProductora[];
	private Festival festivales[];

	public Productora(String nombre) {

		this.nombre = nombre;
		this.listaDeBandasProductora = new Banda[100];
		this.listaDeMusicosProductora = new Musico[500];
		this.festivales = new Festival[50];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Musico buscarMusico(Integer id) {
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

	public Boolean agregarMusicoAUnaBanda(Integer idBanda, Integer idMusico) {
		Boolean seAgrego = false;
		Banda banda = buscarBanda(idBanda);
		Musico musico = banda.buscarMusico(idMusico);
		seAgrego = banda.agregarMusico(musico);
		return seAgrego;
	}
	
	public Boolean quitarMusicoDeUnaBanda(Integer idBanda, Integer idMusico) {
		Boolean seQuito = false;
		Banda banda = buscarBanda(idBanda);
		Musico musicoAsacar = banda.buscarMusico(idMusico);
		seQuito = banda.quitarMusico(musicoAsacar.getId());
		return seQuito;
	}
}
