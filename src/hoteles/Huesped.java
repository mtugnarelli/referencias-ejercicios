package hoteles;

public class Huesped {

	private String nombre;

	public Huesped(String nombreDelHuesped) {

		nombre = nombreDelHuesped;
	}

	public String obtenerNombre() {

		return nombre;
	}

	public void cambiarNombre(String nombreCorregido) {

		nombre = nombreCorregido;
	}

}
