package hoteles;

import org.junit.Assert;
import org.junit.Test;

public class EjemploHotel {

	@Test
    public void reservarHabitaciones() {
		
		Hotel hotel = new Hotel(3);
		Assert.assertEquals(3, hotel.contarHabitaciones());
        Assert.assertEquals(0, hotel.contarHabitacionesOcupadas());
        Huesped lucia = new Huesped("Lucia E");
        Assert.assertEquals("Lucia E", lucia.obtenerNombre());
        Huesped martin;
        Huesped paula = null;
        
        // #uno
        
        martin = new Huesped("Martin S");
        Assert.assertTrue(hotel.obtenerHuespedEn(1) == null);
        hotel.ocupar(1, martin);
        Assert.assertTrue(hotel.obtenerHuespedEn(1) == martin);
        hotel.ocupar(2, lucia);
        hotel.ocupar(3, paula);
        
        // #dos
        
        martin = new Huesped("Tincho G");
        lucia = null;
        paula = new Huesped("Paula T");
        hotel.ocupar(1, paula);
	}
	
	@Test
    public void reservarHabitacionesLiterarias() {
        
		Hotel hotelVerona = new Hotel(5);
        Assert.assertEquals(5, hotelVerona.contarHabitaciones());
        Assert.assertEquals(0, hotelVerona.contarHabitacionesOcupadas());
		Huesped romeo = new Huesped("Romeo M");
        Assert.assertEquals("Romeo M", romeo.obtenerNombre());
        Hotel hotelItalia;
        Huesped julieta = new Huesped("Julieta C");
        Huesped guillermo = null;
        
        // #uno
        
        hotelItalia = new Hotel(4);        
        hotelVerona.ocupar(1, julieta);
        Assert.assertTrue(julieta == hotelVerona.obtenerHuespedEn(1));
        hotelVerona.ocupar(2, guillermo);
        hotelVerona.ocupar(3, romeo);
        hotelItalia.ocupar(1, romeo);
        Assert.assertTrue(hotelVerona.obtenerHuespedEn(3) == hotelItalia.obtenerHuespedEn(1));
        Assert.assertTrue(hotelItalia.obtenerHuespedEn(2) == null);
        hotelItalia.ocupar(2, romeo);
        hotelItalia.ocupar(3, julieta);
        hotelItalia.ocupar(4, guillermo);
        guillermo = new Huesped("Guillermo S");
        hotelItalia.ocupar(2, guillermo );
        Assert.assertTrue(hotelItalia.obtenerHuespedEn(4) == null);
        Assert.assertEquals(3, hotelItalia.contarHabitacionesOcupadas());
        
        // #dos
        
        Huesped guille = guillermo;
        hotelVerona.ocupar(4, guille);
        guille.cambiarNombre("Guillermo (Guille) S");
        guillermo = null;
        julieta = new Huesped("Juli C");
        
        // #tres
    }
}
