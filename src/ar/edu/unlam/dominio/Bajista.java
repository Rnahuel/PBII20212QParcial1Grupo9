package ar.edu.unlam.dominio;

public class Bajista extends Musico{
	
	private Boolean cantaONo;
	private UsoCuerdas usoCuerdas;
	
	
	public Bajista(Integer id, String nombre, String apellido, String nombreArtistico, Boolean tieneFormacionAcademica,
			Boolean manejaMasDeUnInstrumento, Boolean cantaONo, UsoCuerdas usoCuerdas) {
		
		super(id, nombre, apellido, nombreArtistico, tieneFormacionAcademica, manejaMasDeUnInstrumento);
		this.cantaONo = cantaONo;
		this.usoCuerdas = usoCuerdas;
	}


	public Boolean getCantaONo() {
		return cantaONo;
	}


	public void setCantaONo(Boolean cantaONo) {
		this.cantaONo = cantaONo;
	}


	public UsoCuerdas getUsoCuerdas() {
		return usoCuerdas;
	}


	public void setUsoCuerdas(UsoCuerdas usoCuerdas) {
		this.usoCuerdas = usoCuerdas;
	}
	
	
}
