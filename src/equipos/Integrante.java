package equipos;

public class Integrante {
	
	private String nombre;

	public Integrante(String nombreDelIntegrante) {
		
		nombre = nombreDelIntegrante;
	}

	public String obtenerNombre() {
		
		return nombre;
	}

	public void cambiarNombre(String nuevoNombre) {
		
		nombre = nuevoNombre;
	}

}
