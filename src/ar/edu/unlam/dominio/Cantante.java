package ar.edu.unlam.dominio;

public class Cantante extends Musico {

	private Boolean esCompositor;

	public Cantante(Integer id, String nombre, String apellido, String nombreArtistico, Boolean tieneFormacionAcademica,
			Boolean manejaMasDeUnInstrumento, Boolean esCompositor) {

		super(id, nombre, apellido, nombreArtistico, tieneFormacionAcademica, manejaMasDeUnInstrumento);
		this.esCompositor = esCompositor;
	}

	public boolean isEsCompositor() {
		return esCompositor;
	}

	public void setEsCompositor(Boolean esCompositor) {
		this.esCompositor = esCompositor;
	}

}
