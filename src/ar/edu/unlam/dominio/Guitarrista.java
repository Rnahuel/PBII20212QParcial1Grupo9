package ar.edu.unlam.dominio;

public class Guitarrista extends Musico {

	private Boolean cantaONo;
	private TipoGuitarra tipoGuitarra;
	private UsoCuerdas usoCuerdas;

	public Guitarrista(Integer id, String nombre, String apellido, String nombreArtistico,
			Boolean tieneFormacionAcademica, Boolean manejaMasDeUnInstrumento, Boolean cantaONo,
			TipoGuitarra tipoGuitarra, UsoCuerdas usoCuerdas) {

		super(id, nombre, apellido, nombreArtistico, tieneFormacionAcademica, manejaMasDeUnInstrumento);
		this.cantaONo = cantaONo;
		this.tipoGuitarra = tipoGuitarra;
		this.usoCuerdas = usoCuerdas;
	}

	public Boolean getCantaONo() {
		return cantaONo;
	}

	public void setCantaONo(Boolean cantaONo) {
		this.cantaONo = cantaONo;
	}

	public TipoGuitarra getTipoGuitarra() {
		return tipoGuitarra;
	}

	public void setTipoGuitarra(TipoGuitarra tipoGuitarra) {
		this.tipoGuitarra = tipoGuitarra;
	}

	public UsoCuerdas getUsoCuerdas() {
		return usoCuerdas;
	}

	public void setUsoCuerdas(UsoCuerdas usoCuerdas) {
		this.usoCuerdas = usoCuerdas;
	}

}
