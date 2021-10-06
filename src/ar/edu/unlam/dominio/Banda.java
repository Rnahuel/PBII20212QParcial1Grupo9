package ar.edu.unlam.dominio;

public class Banda {

	private Integer id;
	private Integer nroIntegrantes;
	private Genero genero;
	private Musico musicosIntegrantes[];

	public Banda(Integer id, Integer nroIntegrantes, Genero genero) {

		this.id = id;
		this.nroIntegrantes = nroIntegrantes;
		this.genero = genero;
		this.musicosIntegrantes = new Musico[nroIntegrantes];
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNroIntegrantes() {
		return nroIntegrantes;
	}

	public void setNroIntegrantes(Integer nroIntegrantes) {
		this.nroIntegrantes = nroIntegrantes;
	}

	public Genero getGenero() {
		return genero;
	}

	public Boolean buscarMusico(Integer id) {
		Boolean musico = false;
		for (int i = 0; i < musicosIntegrantes.length; i++) {
			if (musicosIntegrantes[i] != null && musicosIntegrantes[i].getId().equals(id)) {
				musico = true;
				break;
			}
		}
		return musico;
	}

	public Boolean agregarMusico(Musico musico) {
		Boolean seAgrego = false;
		for (int i = 0; i < musicosIntegrantes.length; i++) {
			if (musicosIntegrantes[i]==null) {
				musicosIntegrantes[i]=musico;
				seAgrego=true;
				break;
			}
		}
		return seAgrego;

	}
	
	

	/*
	 * public void setGenero(Genero genero) { this.genero = genero; }
	 */

}