package transportes;

public class Transporte {

	private Pasajero[] pasajeros;
	
	public Transporte(int capacidad) {
		
		if (capacidad < 1) {
			throw new Error("El transporte debe tener capacidad");
		}
		
		pasajeros = new Pasajero[capacidad];
	}

	public int contarLugaresLibres() {
		
		int libres = 0;
		
		for (int i = 0; i < pasajeros.length; i++) {
			
			if (pasajeros[i] == null) {
				libres++;
			}
		}
		
		return libres;
	}

	public int contarLugaresOcupados() {
		
		return pasajeros.length - contarLugaresLibres();
	}

	public void subir(int numero, Pasajero pasajero) {
		
		int posicion = posicionarPasajero(numero); 
		
		if (pasajeros[posicion] != null) {
			pasajeros[posicion].bajar();
		}
		
		pasajeros[posicion] = pasajero;
		pasajero.subirEn(this);
	}

	public Pasajero obtenerPasajero(int numero) {
		
		int posicion = posicionarPasajero(numero);
		
		return pasajeros[posicion];
	}
	
	private int posicionarPasajero(int numero) {
		
		if ((numero < 1) || (numero > pasajeros.length)) {
			throw new Error("Número de pasajero incorrecto: " + numero);
		}
		
		return numero - 1;
	}
}
