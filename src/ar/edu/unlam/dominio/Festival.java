package ar.edu.unlam.dominio;

public class Festival {

	private String nombre;
	private Banda listaDeBandas[];
	private Espectador audiencia[];
	private Integer diasDeDuracion;
	private Integer idFesti;

	public Festival(String nombre, Integer diasDeDuracion,Integer idFesti) {

		this.nombre = nombre;
		this.listaDeBandas = new Banda[25];
		this.audiencia = new Espectador[50000];
		this.diasDeDuracion = diasDeDuracion;
		this.idFesti=idFesti;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Banda[] getListaDeBandas() {
		return listaDeBandas;
	}

	public void setListaDeBandas(Banda[] listaDeBandas) {
		this.listaDeBandas = listaDeBandas;
	}

	public Espectador[] getAudiencia() {
		return audiencia;
	}

	public void setAudiencia(Espectador[] audiencia) {
		this.audiencia = audiencia;
	}

	public Integer getDiasDeDuracion() {
		return diasDeDuracion;
	}

	public void setDiasDeDuracion(Integer diasDeDuracion) {
		this.diasDeDuracion = diasDeDuracion;
	}

	public Integer getIdFesti() {
		return idFesti;
	}

	public void setIdFesti(Integer idFesti) {
		this.idFesti = idFesti;
	}

}