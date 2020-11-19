package hoteles;

public class Hotel {

	private Huesped[] huespedesEnHabitacion;
	
	public Hotel(int capacidad) {
		
		if (capacidad < 1) {
			throw new Error("El transporte debe tener capacidad");
		}
		
		huespedesEnHabitacion = new Huesped[capacidad];
	}

	public int contarHabitaciones() {
		
		return huespedesEnHabitacion.length;
	}

	public int contarHabitacionesOcupadas() {
		
		int ocupadas = 0;
		
		for (int i = 0; i < huespedesEnHabitacion.length; i++) {
			
			if (huespedesEnHabitacion[i] != null) {
				
				ocupadas++;
			}
		}
		
		return ocupadas;
	}

	public void ocupar(int numeroHabitacion, Huesped huesped) {
		
		int posicion = posicionar(numeroHabitacion);
		
		huespedesEnHabitacion[posicion] = huesped;
	}

	private int posicionar(int numeroHabitacion) {

		if ((numeroHabitacion < 1) || (numeroHabitacion > huespedesEnHabitacion.length)) {
			throw new Error("El número de habitación no existe: " + numeroHabitacion);
		}
		
		return numeroHabitacion - 1;
	}

	public Huesped obtenerHuespedEn(int numeroHabitacion) {
		
		int posicion = posicionar(numeroHabitacion);
		
		return huespedesEnHabitacion[posicion];
	}

}
