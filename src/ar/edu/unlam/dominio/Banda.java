package ar.edu.unlam.dominio;

import java.util.Arrays;

public class Banda {

	private Integer id;
	private Integer nroIntegrantes;
	private Genero genero;
	private Musico musicosIntegrantes[];

	public Banda(Integer id, Integer nroIntegrantes, Genero genero) {

		this.id = id;
		this.nroIntegrantes = nroIntegrantes;
		this.genero = genero;
		this.musicosIntegrantes = new Musico[nroIntegrantes+1];
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
	
	public Boolean quitarMusico (Integer idMusico) {
		Boolean seQuito = false;
		for (int i = 0; i < musicosIntegrantes.length; i++) {
			if(musicosIntegrantes[i] != null && musicosIntegrantes[i].getId().equals(idMusico)) {
				musicosIntegrantes[i] = null;
				seQuito = true;
				break;
			}
		} return seQuito;
		
	}

	
	  public void setGenero(Genero genero) { this.genero = genero; }

	@Override
	public String toString() {
		return "Banda [id=" + id + ", nroIntegrantes=" + nroIntegrantes + ", genero=" + genero + ", musicosIntegrantes="
				+ Arrays.toString(musicosIntegrantes) + "]";
	}

	  
}