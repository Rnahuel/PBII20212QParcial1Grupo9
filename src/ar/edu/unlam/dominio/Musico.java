package ar.edu.unlam.dominio;

public class Musico {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String nombreArtistico;
	private Boolean tieneFormacionAcademica;
	private Boolean manejaMasDeUnInstrumento;
	
	public Musico(Integer id, String nombre, String apellido, String nombreArtistico, Boolean tieneFormacionAcademica,
			Boolean manejaMasDeUnInstrumento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreArtistico = nombreArtistico;
		this.tieneFormacionAcademica = tieneFormacionAcademica;
		this.manejaMasDeUnInstrumento = manejaMasDeUnInstrumento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}

	public Boolean getTieneFormacionAcademica() {
		return tieneFormacionAcademica;
	}

	public void setTieneFormacionAcademica(Boolean tieneFormacionAcademica) {
		this.tieneFormacionAcademica = tieneFormacionAcademica;
	}

	public Boolean getManejaMasDeUnInstrumento() {
		return manejaMasDeUnInstrumento;
	}

	public void setManejaMasDeUnInstrumento(Boolean manejaMasDeUnInstrumento) {
		this.manejaMasDeUnInstrumento = manejaMasDeUnInstrumento;
	}

	@Override
	public String toString() {
		return "Musico [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nombreArtistico="
				+ nombreArtistico + ", tieneFormacionAcademica=" + tieneFormacionAcademica
				+ ", manejaMasDeUnInstrumento=" + manejaMasDeUnInstrumento + "]";
	}
	
	
}
