package transportes;

import org.junit.Assert;
import org.junit.Test;

public class EjemploTransporte {

	@Test
	public void subirPasajeros1() {
		
		Transporte colectivo = new Transporte(5);
		Assert.assertEquals(5, colectivo.contarLugaresLibres());
		Assert.assertEquals(0, colectivo.contarLugaresOcupados());
		Pasajero lionel = new Pasajero("Lionel");
		Assert.assertEquals("Lionel", lionel.obtenerNombre());
		Assert.assertTrue(lionel.obtenerVehiculo() == null);
		colectivo.subir(1, lionel);
		Assert.assertTrue(lionel == colectivo.obtenerPasajero(1));
		Assert.assertTrue(lionel.obtenerVehiculo() == colectivo);
		Assert.assertEquals(4, colectivo.contarLugaresLibres());
		Assert.assertEquals(1, colectivo.contarLugaresOcupados());
		
		// #uno
		
		colectivo.subir(2, new Pasajero("Paulo"));
		colectivo.subir(3, new Pasajero("Mauro"));
		Pasajero primero = colectivo.obtenerPasajero(1);
		Transporte transporte = colectivo;
		Pasajero segundo = transporte.obtenerPasajero(2);
		Pasajero tercero = transporte.obtenerPasajero(3);
		Transporte bicicleta = new Transporte(1);
		bicicleta.subir(1, tercero);
		colectivo = null;
		
		// #dos
	}
	
	
    @Test
    public void subirPasajeros2() {
    	
    	Transporte auto = new Transporte(4);
        Assert.assertEquals(4, auto.contarLugaresLibres());   
        Assert.assertEquals(0, auto.contarLugaresOcupados());
        Pasajero agustina = new Pasajero("Agustina Lopez");
        Assert.assertEquals("Agustina Lopez", agustina.obtenerNombre());
        Pasajero martin;
        
        // #uno
        
        Transporte autoSuplente = new Transporte(8);        
        auto.subir(1, agustina);
        Assert.assertTrue(agustina == auto.obtenerPasajero(1));
        Assert.assertEquals(3, auto.contarLugaresLibres());   
        Assert.assertEquals(1, auto.contarLugaresOcupados());
        martin = new Pasajero("Martin Diaz");
        auto.subir(2, martin);
        Assert.assertTrue(martin == auto.obtenerPasajero(2));
        Assert.assertTrue(auto == martin.obtenerVehiculo());
        
        // #dos
        
        autoSuplente = auto;
        Pasajero leo = new Pasajero("Leo Paredes");
        autoSuplente.subir(1, leo);
        Assert.assertTrue(leo == autoSuplente.obtenerPasajero(1));
        Assert.assertTrue(agustina.obtenerVehiculo() == null);
        
        // #tres
    }
    
    @Test
    public void subirPasajeros3() {
    	
    	Transporte colectivo = new Transporte(8);
        Assert.assertEquals(8, colectivo.contarLugaresLibres());   
        Assert.assertEquals(0, colectivo.contarLugaresOcupados());
        Pasajero lucas = new Pasajero("Lucas");
        Assert.assertEquals("Lucas", lucas.obtenerNombre());
        Assert.assertTrue(lucas.obtenerVehiculo() == null);
        
        // #uno
        
        colectivo.subir(1, lucas);
        Assert.assertTrue(lucas == colectivo.obtenerPasajero(1));
        Assert.assertEquals(7, colectivo.contarLugaresLibres());   
        Assert.assertEquals(1, colectivo.contarLugaresOcupados());
        colectivo.subir(2, new Pasajero("Natalia"));
        colectivo.subir(3, new Pasajero("Marcelo"));
        Pasajero primero = colectivo.obtenerPasajero(1);
        
        // #dos
        
        Transporte transporte = colectivo;
        Pasajero segundo = transporte.obtenerPasajero(2);
        Pasajero tercero = transporte.obtenerPasajero(3);
        Transporte bicicleta = new Transporte(1);
        bicicleta.subir(1, tercero);
        
        // #tres
    }
}
