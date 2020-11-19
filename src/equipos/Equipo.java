package equipos;

public class Equipo {

	private String nombre;
	private Integrante[] integrantes;
	private Integrante capitan;
	
	public Equipo(String nombreDelEquipo, int cantidadMaximaIntegrantes) {
		
		if (cantidadMaximaIntegrantes < 2) {
			throw new Error("Todo equipo debe tener al menos 2 integrantes");
		}
		
		nombre = nombreDelEquipo;
		integrantes = new Integrante[cantidadMaximaIntegrantes];
		capitan = null;
	}

	public String obtenerNombre() {

		return nombre;
	}

	public int contarMiembros() {
		
		int  miembros = 0;
		
		for (int i = 0; i < integrantes.length; i++) {
			
			if (integrantes[i] != null) {
				
				miembros++;
			}
		}
		
		return miembros;
	}

	public Integrante obtenerCapitan() {
		
		return capitan;
		
	}

	public void asignarIntegrante(int numero, Integrante integrante) {

		int posicion = posicionarIntegrante(numero);
		
		integrantes[posicion] = integrante;
	}

	private int posicionarIntegrante(int numero) {

		if ((numero < 1) || (numero > integrantes.length)) {
			
			throw new Error("No existe integrante número: " + numero);
		}
		
		return numero - 1;
	}

	public void asignarCapitan(Integrante nuevoCapitan) {

		capitan = nuevoCapitan;
	}

	public Integrante obtenerIntegrante(int numero) {
		
		return integrantes[posicionarIntegrante(numero)];
	}

}
