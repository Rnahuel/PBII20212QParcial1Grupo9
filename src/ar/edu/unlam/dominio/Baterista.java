package ar.edu.unlam.dominio;

public class Baterista extends Musico {

	private Boolean cantaONo;
	private Integer partesDeLaBateria;

	public Baterista(Integer id, String nombre, String apellido, String nombreArtistico,
			Boolean tieneFormacionAcademica, Boolean manejaMasDeUnInstrumento, Boolean cantaONo,
			Integer partesDeLaBateria) {

		super(id, nombre, apellido, nombreArtistico, tieneFormacionAcademica, manejaMasDeUnInstrumento);
		this.cantaONo = cantaONo;
		this.partesDeLaBateria = partesDeLaBateria;

	}

	public Boolean getCantaONo() {
		return cantaONo;
	}

	public void setCantaONo(Boolean cantaONo) {
		this.cantaONo = cantaONo;
	}

	public Integer getPartesDeLaBateria() {
		return partesDeLaBateria;
	}

	public void setPartesDeLaBateria(Integer partesDeLaBateria) {
		this.partesDeLaBateria = partesDeLaBateria;
	}

}