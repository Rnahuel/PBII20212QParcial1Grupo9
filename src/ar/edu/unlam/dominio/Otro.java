package ar.edu.unlam.dominio;

public class Otro extends Musico {

	private Boolean cantaONo;
	private String descripcion;


	public Otro(Integer id, String nombre, String apellido, String nombreArtistico, Boolean tieneFormacionAcademica,
			Boolean manejaMasDeUnInstrumento, String descripcion, Boolean cantaONo) {


		super(id, nombre, apellido, nombreArtistico, tieneFormacionAcademica, manejaMasDeUnInstrumento);
		this.descripcion = descripcion;
		this.cantaONo = cantaONo;
	}


	public Boolean getCantaONo() {
		return cantaONo;
	}

	public void setCantaONo(Boolean cantaONo) {
		this.cantaONo = cantaONo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}