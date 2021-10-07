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


	
	public Boolean agregarBanda(Banda banda) {
		Boolean seAgregoBanda=false;
		
		for (int i = 0; i < listaDeBandas.length; i++) {
			if(listaDeBandas[i]== null) {
				listaDeBandas[i]= banda;
				seAgregoBanda= true;
				break;
			}
		}return seAgregoBanda;
	}
	
	public Boolean quitarBanda (Integer codigo) {
		Boolean seQuitoBanda= false;
		
		for (int i = 0; i < listaDeBandas.length; i++) {
			if(listaDeBandas[i] !=null && listaDeBandas[i].getId().equals(codigo)) {
				listaDeBandas[i]= null;
				seQuitoBanda=true;
				break;
			}
		}return seQuitoBanda;
	}
	
	public Boolean agregarEspectador(Espectador espectador) {
		Boolean seAgregoEspectador= false;
		
		for (int i = 0; i < audiencia.length; i++) {
			if(audiencia[i] == null) {
				audiencia[i]= espectador;
				seAgregoEspectador= true;
				break;
			}
		}return seAgregoEspectador;
	}
	
	public Boolean quitarEspectador(Integer dni) {
		Boolean seQuitoEspectador= false;
		
		for (int i = 0; i < audiencia.length; i++) {
			if(audiencia[i]!= null && audiencia[i].getDni().equals(dni)) {
				audiencia[i]= null;
				seQuitoEspectador= true;
				break;
			}
		}
		return seQuitoEspectador;
	}
	

}