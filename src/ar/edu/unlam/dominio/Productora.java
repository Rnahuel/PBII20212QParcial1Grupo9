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

	public Boolean agregarBanda(Banda banda) {
		Boolean seAgrego = false;
		for (int i = 0; i < listaDeBandasProductora.length; i++) {
			if (listaDeBandasProductora[i] == null) {
				listaDeBandasProductora[i] = banda;
				seAgrego = true;
				break;
			}
		}
		return seAgrego;
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
		Boolean seAgreg� = false;
		for (int i = 0; i < listaDeMusicosProductora.length; i++) {
			if (listaDeMusicosProductora[i] == null) {
				listaDeMusicosProductora[i] = musico;
				seAgreg� = true;
				break;
			}
		}
		return seAgreg�;
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

}
