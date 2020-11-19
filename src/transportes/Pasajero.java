package transportes;

public class Pasajero {

	private String nombre;
	private Transporte vehiculo;

	public Pasajero(String nombreDelPasajero) {

		nombre = nombreDelPasajero;
		vehiculo = null;
	}

	public String obtenerNombre() {

		return nombre;
	}

	public Transporte obtenerVehiculo() {

		return vehiculo;
	}

	public void subirEn(Transporte transporte) {

		vehiculo = transporte;
	}

	public void bajar() {

		vehiculo = null;
	}

}
