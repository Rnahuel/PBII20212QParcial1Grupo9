package ar.edu.unlam.dominio;

public class Festival {
	
	private String nombre;
	private Banda listaDeBandas[];
	private Espectador audiencia[];
	private Integer diasDeDuracion;
	private Integer cantidadToleradaDeEspectadores;
	
	
	public Festival(String nombre, Integer diasDeDuracion, Integer cantidadToleradaDeEspectadores) {
		
		this.nombre = nombre;
		this.listaDeBandas = new Banda[25];
		this.audiencia = new Espectador[cantidadToleradaDeEspectadores];
		this.diasDeDuracion = diasDeDuracion;
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